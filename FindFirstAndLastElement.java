public class FindFirstAndLastElement {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 3, 3, 4, 5, 5, 6};

        int target = 3; // Element to search for

        int firstIndex = findFirstElement(sortedArray, target);
        int lastIndex = findLastElement(sortedArray, target);

        System.out.println("First occurrence of " + target + " is at index: " + firstIndex);
        System.out.println("Last occurrence of " + target + " is at index: " + lastIndex);
    }

    // Function to find the first occurrence of the target element
    public static int findFirstElement(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int firstIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                firstIndex = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return firstIndex;
    }

    // Function to find the last occurrence of the target element
    public static int findLastElement(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int lastIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                lastIndex = mid;
                left = mid + 1; // Continue searching on the right side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return lastIndex;
    }
}
