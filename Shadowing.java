public class Shadowing {
    static int a = 90;
    public static void main(String[] args) {
        System.out.println(a);
        int a = 30;
        System.out.println(a);
        fun();
    }
   static void fun(){
        int a =40;
        System.out.println(a);
    }
}
