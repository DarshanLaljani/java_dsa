package LinkedList;

public class HappyNoLL {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (fast != slow);

        return slow == 1;
    }

    private int findSquare(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem;
            num = num / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        HappyNoLL happyNoLL = new HappyNoLL();

        // Sample Input 1: Happy Number
        int happyNumber = 19;
        System.out.println("Sample Input 1: " + happyNumber + " is Happy Number? " + happyNoLL.isHappy(happyNumber));

        // Sample Input 2: Unhappy Number
        int unhappyNumber = 4;
        System.out.println("Sample Input 2: " + unhappyNumber + " is Happy Number? " + happyNoLL.isHappy(unhappyNumber));
    }
}
