import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        int salary = 10300;
        System.out.println("old salary:" + salary);
        if(salary>10000){
            salary= salary + 3000;
        }else if(salary<300) {
            salary= salary-500;
        }else {
            salary+=300;
        }
System.out.println(salary);
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }
       int c =0;
       while(c<10){
           System.out.println(c);
            c++;
        }
        /*
        use for loop when we know the end of the loop or we know how many times the loop is goona run
        other wise use while
        */
do{
    c++;
    System.out.println(c);
}while (c<15);


    }
}
