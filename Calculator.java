import java.util.Scanner;
/*
switch case notes case must have ahve a constants
duplicate cases are not allowed
break is use to terminate the sequence
 there is also one case that is default meaning toh malum hi h

 */

public class Calculator {
    public static void main(String[] args) {
        int ans =0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter num 1");
         int num1 = in.nextInt();
        System.out.println("enter no two");
         int num2 = in.nextInt();

        System.out.println("enter operator ");
         char op = in.next().trim().charAt(0);
         while (true){

             if(op == '+' || op == '-' || op == '*' || op == '/'){
                 switch (op){
                    case '+':
                         ans = num1+ num2;
                        System.out.println(ans);
                         break;
                   case '-':
                     ans = num1+ num2;
                       System.out.println(ans);
                     break;
                    case  '*':
                     ans = num1* num2;
                        System.out.println(ans);
                     break;
                     case  '/':
                     ans = num1/ num2;
                         System.out.println(ans);
                     break;
                     default:
                         System.out.println("u r champ");
                 }

             }
         }
    }
}
