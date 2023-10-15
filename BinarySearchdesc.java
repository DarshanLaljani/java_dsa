public class BinarySearchdesc {
    public static void main(String[] args) {
        int [] arr = { 10, 5, 7 , 8 ,6 ,2,1};
        int target = 6;
        System.out.println("element is found at "+ search(arr,target));
    }
    static int search(int [] arr , int target){
        int l = arr[0];
        int h = arr[arr.length-1];

        while (l>h){
            int mid =  (l + h)/2;

            if(arr[mid]>l){
                h = mid-1;
            }
            else if(arr[mid]<h)  {
                l = mid +1;
            }else {
                return mid ;
            }
        }
        return -1;}
}
