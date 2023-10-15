import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[3] ;
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i]=sc.nextInt();
//        }
//            System.out.println(Arrays.toString(arr));
//
//       // System.out.println(arr[5]);
        int [] arr1 = {3, 45,8 ,9};
        System.out.println(Arrays.toString(arr1));
        change(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void change(int[] arr){
        arr[0]=44;
    }
}
