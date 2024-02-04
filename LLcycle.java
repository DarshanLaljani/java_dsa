package LinkedList;

public class LLcycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // Cycle detected, find the start node of the cycle
                ListNode start = head;
                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }
                return start;
            }
        }

        // No cycle
        return null;
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;

        // Detect cycle and calculate length
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            length++;
            if (fast == slow) {
                return length;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        LLcycle llCycle = new LLcycle();

        // Sample Input 1: Cycle present
        ListNode headWithCycle = llCycle.createLinkedListWithCycle();
        boolean hasCycle1 = llCycle.hasCycle(headWithCycle);
        System.out.println("Sample Input 1: " + (hasCycle1 ? "Cycle is present" : "No cycle"));
        System.out.println("Length of the cycle is: " + llCycle.lengthCycle(headWithCycle));
        ListNode cycleStartNode1 = llCycle.detectCycle(headWithCycle);
        System.out.println("Node where cycle starts: " + (cycleStartNode1 != null ? cycleStartNode1.val : "N/A"));

        // Sample Input 2: No cycle
        ListNode headWithoutCycle = llCycle.createLinkedListWithoutCycle();
        boolean hasCycle2 = llCycle.hasCycle(headWithoutCycle);
        System.out.println("Sample Input 2: " + (hasCycle2 ? "Cycle is present" : "No cycle"));
        System.out.println("Length of the cycle is: " + llCycle.lengthCycle(headWithoutCycle));
        ListNode cycleStartNode2 = llCycle.detectCycle(headWithoutCycle);
        System.out.println("Node where cycle starts: " + (cycleStartNode2 != null ? cycleStartNode2.val : "N/A"));
    }

    // Helper method to create a linked list without a cycle
    private static ListNode createLinkedListWithoutCycle() {
        LLcycle llCycle = new LLcycle();
        ListNode head = llCycle.new ListNode(1);
        head.next = llCycle.new ListNode(2);
        head.next.next = llCycle.new ListNode(3);
        head.next.next.next = llCycle.new ListNode(4);

        return head;
    }

    // Helper method to create a linked list with a cycle
    private static ListNode createLinkedListWithCycle() {
        LLcycle llCycle = new LLcycle();
        ListNode head = llCycle.new ListNode(1);
        head.next = llCycle.new ListNode(2);
        head.next.next = llCycle.new ListNode(3);
        head.next.next.next = llCycle.new ListNode(4);
        head.next.next.next.next = head.next; // Creating a cycle

        return head;
    }
}
