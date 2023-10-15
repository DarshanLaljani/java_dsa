import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       // sum();
        System.out.println(sum2(20,30));
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two nos u want to add");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a+b;
        System.out.println("answer: " + sum);
    }
    static int sum2(int c , int d ){
       int sum= c+d;
       return sum;

    }
}
/*  method syntax :
return type name {
//body
return statement;
}
*/