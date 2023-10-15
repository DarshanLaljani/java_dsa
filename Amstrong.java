public class Amstrong {
    // sum of each digit's cube of a num = num
    // 153 = 1^3 + 5^3 + 3^3 therefore this is amstrong nu
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        for (int i = 100; i < 1000; i++) {

            if(isAmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
    static boolean isAmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
        int rem = n%10;
            n=n/10;
        sum = sum + rem*rem*rem;

    }
        if(sum==original){

            return true;
    }
    return false;
    }
}
