import java.util.*;

class Graph2 {
    private Map<Character, List<Character>> adjList;

    public Graph2() {
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

public class DepthLimited {
    private static Graph2 graph2;

    public static void main(String[] args) {
        graph2 = new Graph2();

        graph2.addNode('S', Arrays.asList('A', 'H'));
        graph2.addNode('A', Arrays.asList('B', 'C'));
        graph2.addNode('B', Collections.singletonList('K'));
        graph2.addNode('C', Collections.singletonList('G'));
        graph2.addNode('H', Arrays.asList('I', 'J'));
        graph2.addNode('I', Collections.singletonList('F'));

        char startNode = 'S';
        char goalNode = 'G';
        int depth = 2; // Adjust the depth value

        System.out.println("Depth-limited Search");
        List<Character> path = dls(startNode, goalNode, new HashSet<>(), depth);

        if (path != null) {
            System.out.println("Path exists: " + path);
        } else {
            System.out.println("No Path found ");
        }
    }

    private static List<Character> dls(char currentNode, char goalNode, HashSet<Character> visited, int depth) {
        visited.add(currentNode);

        if (currentNode == goalNode) {
            return new ArrayList<>(Collections.singletonList(currentNode));
        }

        if (depth > 0) {
            for (char neighbor : graph2.getNeighbors(currentNode)) {
                if (!visited.contains(neighbor)) {
                    List<Character> path = dls(neighbor, goalNode, visited, depth - 1);

                    if (path != null) {
                        path.add(0, currentNode);
                        return path;
                    }
                }
            }
        }

        return null;
    }
}
