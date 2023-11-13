public class Fibonaaci {
    public static void main(String[] args) {
        System.out.println(fibo(7));
    }

    // Identify if u can break down problems int smaller problems
    // Write the recursive relation
    // base condition
    static int fibo(int n){
// base condition
    if (n<2){
        return n;
    }
            return fibo(n-1)+fibo(n-2);

    }
}
