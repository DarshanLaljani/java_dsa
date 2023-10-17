public class OrderAgnostic {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        boolean isAscending = arr[left] < arr[right];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return -1; // Element not found in the array
    }

    public static void main(String[] args) {
        int[] ascendingArray = {1, 3, 5, 7, 9, 11, 13};
        int[] descendingArray = {13, 11, 9, 7, 5, 3, 1};
        int target = 7;

        int result1 = search(ascendingArray, target);
        int result2 = search(descendingArray, target);

        System.out.println("Target " + target + " found at index in ascending array: " + result1);
        System.out.println("Target " + target + " found at index in descending array: " + result2);
    }
}
