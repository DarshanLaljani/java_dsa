public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = { 1,2,4,6,8,9,10};
        int target = 6;
        System.out.println("element is found at "+ search(arr,target));
    }
    static int search(int [] arr , int target){
        int l = arr[0];
        int h = arr[arr.length-1];

       while (l<=h){
            int mid =  l + (h-l) /2;

        if(target < arr[mid]){
            h = mid-1;
        }
        else if(target > arr[mid])  {
            l = mid +1;
        }else {
            return mid ;
        }
    }
    return -1;}
}
