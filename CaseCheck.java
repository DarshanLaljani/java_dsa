import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

    Scanner ch =  new Scanner(System.in);
    char d = ch.nextLine().trim().charAt(0);

     if(d >='a' && d <= 'z'){
        System.out.println("LowerCase");
    } else{
        System.out.println("UpperCase");
    }
}}
