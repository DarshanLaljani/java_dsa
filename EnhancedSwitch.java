import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("mango really?");
            case "apple" -> System.out.println("apple really?");
            case "banana" -> System.out.println("banana really?");
            case "grapes" -> System.out.println("grapes really?");
            default -> System.out.println("enter valid");

        }
        System.out.println("enter the no. of ur day");
        int day = in.nextInt();

        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6 , 7 ->
                System.out.println("weeknd");
        }
    }
}
