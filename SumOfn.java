public class SumOfn {
    public static void main(String[] args) {
        int ans= sum(4);
        System.out.println(ans);
    }
    public static int sum(int n){

        if (n<=1){
            return 1;

        }
        return n+ sum(n-1);

    }

}
