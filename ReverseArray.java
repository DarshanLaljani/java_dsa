public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Create a new array to store the reversed elements
        int[] reversedArray = new int[arr.length];

        // Loop through the original array from end to start
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }

        // Print the reversed array
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
