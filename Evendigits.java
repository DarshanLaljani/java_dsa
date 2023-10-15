import java.util.Scanner;

public class Evendigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Boolean str = evendigit(a);
        System.out.println(str);
    }
    static int counter(int num){
        int count =0;
        while (num>0) {
            count++;
            num= num/10;
        }
        return count;
    }
    static boolean evendigit(int n){
        int c =counter(n);
        if(c%2==0){
            return true;
        }
        return false;
    }

}
