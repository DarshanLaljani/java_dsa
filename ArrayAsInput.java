import java.util.Scanner;

public class ArrayAsInput {
    public static void main(String[] args) {
        System.out.println("Enter size ur array ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements of array");
        for (int i = 0; i < size; i++) {
            System.out.println("Element "+ (i+1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("your array");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
