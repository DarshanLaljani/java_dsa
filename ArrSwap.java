import java.util.Arrays;

public class ArrSwap {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 8, 9};
        System.out.println(Arrays.toString(arr));
    swap(arr,3,1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int [] arr, int index1,int index2 ){
        int temp= arr[index1];
        arr[index1]=arr[index2];
        arr[index2] = temp;
    }
}
