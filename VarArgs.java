import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        multiple(3,4,"Darshan","crown");

    }
    static void multiple(int a , int b , String...x){
        System.out.println(a + " "+  b+ Arrays.toString(x));

    }
}
