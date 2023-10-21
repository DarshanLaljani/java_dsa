public class SortedMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50},
                {51, 56, 67, 70}
        };

        int target = 34;
        int[] result = searchMatrix(matrix, target);

        if (result != null) {
            int row = result[0];
            int col = result[1];
            System.out.println("Target " + target + " found at row " + row + " and column " + col + ".");
        } else {
            System.out.println("Target " + target + " not found in the matrix.");
        }
    }

    public static int[] searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                int[] result = {mid / cols, mid % cols};
                return result;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}
