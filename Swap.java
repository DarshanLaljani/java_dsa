public class Swap {
    public static void main(String[] args) {
        swap(20,10);

    }
     static void swap(int c, int d) {
       int temp = c;
       c=d;
       d=temp;
         System.out.println(c+","+d);
    }
}
