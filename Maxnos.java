import java.util.Scanner;

public class Maxnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
 int max = a;
       if(b>max){
            max=b;
        }
        if(c>max){
            max= c;
        }
        System.out.println(max);

        int maximum = Math.max(c,Math.max(a,b));
        System.out.println(maximum + " using math class ");

    }
}
