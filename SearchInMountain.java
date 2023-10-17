public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,5,3,2,1};
        int target = 2;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr , int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnostic(arr, target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnostic(arr,target,peak+1,arr.length-1);
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
    public static int orderAgnostic(int[] arr, int target , int left, int right) {

        boolean isAscending = arr[left] < arr[right];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return -1; // Element not found in the array
    }
}
