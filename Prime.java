import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        if (isPrime(n)==true){
            System.out.println(n + "is a prime num");
        }
        else {
            System.out.println("not a prime");
        }
    }

 static boolean isPrime(int n) {
        if(n<=1){

            return false;
        }
     for (int i = 2; i <=Math.sqrt(n); i++) {
         if(n%i==0){

             return false;
         }
     }

     return true;
    }
}

