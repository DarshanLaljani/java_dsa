public class MethodOverloading {
    public static void main(String[] args) {
        fun(232);
        fun("darshan");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String s){
        System.out.println(s);
    }
}
