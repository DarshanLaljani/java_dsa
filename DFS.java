import java.util.*;

class Graph {
    private Map<Character, List<Character>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addNode(char node, List<Character> neighbors) {
        adjList.put(node, neighbors);
    }

    public List<Character> getNeighbors(char node) {
        return adjList.getOrDefault(node, new ArrayList<>());
    }

    public Set<Character> getAllNodes() {
        return adjList.keySet();
    }
}

public class DFS {
    private static Graph graph;

    public static void main(String[] args) {
        graph = new Graph();

        // Add nodes and their neighbors
        graph.addNode('S', Arrays.asList('A', 'H'));
        graph.addNode('A', Arrays.asList('B', 'C'));
        graph.addNode('B', Collections.singletonList('K'));
        graph.addNode('C', Collections.singletonList('G'));
        graph.addNode('H', Arrays.asList('I', 'J'));
        graph.addNode('I', Collections.singletonList('F'));

        char startNode = 'S';
        char goalNode = 'G';

        System.out.println("Depth-First Search Path:");
        List<Character> path = dfs(startNode, goalNode, new HashSet<>());

        if (path != null) {
            System.out.println("Path exists: " + path);
        } else {
            System.out.println("No path found.");
        }
    }

    private static List<Character> dfs(char currentNode, char goalNode, Set<Character> visited) {
        visited.add(currentNode);

        if (currentNode == goalNode) {
            return new ArrayList<>(Collections.singletonList(currentNode));
        }

        for (char neighbor : graph.getNeighbors(currentNode)) {
            if (!visited.contains(neighbor)) {
                List<Character> path = dfs(neighbor, goalNode, visited);
                if (path != null) {
                    path.add(0, currentNode);
                    return path;
                }
            }
        }

        return null;
    }
}
