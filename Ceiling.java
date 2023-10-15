public class Ceiling {
    public static void main(String[] args) {
        // smallest element in array which greater than or equal to target element
        int[] arr = {1,3,5,7,8,9};
        int target = 6;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[] arr,int target){
        int l = 0;
        int h = arr.length-1;

        while (l<=h){
            int mid = l+(h-l)/2;
            if(target<arr[mid]){
                h= mid-1;
            } else if (target>arr[mid]) {
                l=mid + 1;
            }else {
                return mid;
            }
        }
        return h;
    }
}
