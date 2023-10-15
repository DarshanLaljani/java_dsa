public class MethodOverriding {
    public static void main(String[] args) {
        Abusive saala = new Beep();
        saala.start();
    }

}
class Abusive {
    void  start(){
        System.out.println("hi I am from main class");
    }}
class Beep extends Abusive{
    void start(){
        System.out.println("I m from sub class");
    }
}