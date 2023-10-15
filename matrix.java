import java.util.Arrays;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
//        int [][] matrix = {
//                {1,2,3},
//                {4,6,7},
//                {3,5,6}
//        };
        Scanner in = new Scanner(System.in);
        int [][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
