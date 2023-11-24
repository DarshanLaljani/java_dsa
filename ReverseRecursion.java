public class ReverseRecursion {
    public static void main(String[] args) {
   rev1(1234);
        System.out.println(sum);
    }
    static int sum = 0;
    static int rev1(int n){
        if (n==0){
            return n;
        }
        int rem = n%10;
        sum = sum*10 +rem;
        rev1(n/10);

        return n;
    }
}
