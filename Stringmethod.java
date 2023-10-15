public class Stringmethod {
    public static void main(String[] args) {
       String message =  greet2("Darshan");
        System.out.println(message);
    }
   static String greet(){
        String greeting = "hi sir";
        return greeting;
    }
    static String greet2(String name){
        String msg = "hello"+name;
        return msg;
    }
}

