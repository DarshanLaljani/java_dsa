public class Mountain {
    public static void main(String[] args) {
            int [] arr = {1,3,4,6,7,3,2,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int [] arr){
        int start=0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //descending part
                // so move left hand side
                end=mid;
            }else {
                //ascending part
                start= mid+1;
            }
        }
        // in the end , start and end will be pointing at same value
        // at every point we are getting the peak value between that start and end
       return arr[start];
    }
}
