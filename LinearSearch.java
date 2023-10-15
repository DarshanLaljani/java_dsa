public class LinearSearch {
    public static void main(String[] args) {
        int[] arr1 = {2,4,5,5,9,6,98,1};
       int ans =  binarySearch(arr1,5);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr , int target){
            if(arr.length==0) {
                return -1;
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==target){
                    return i;
                }
            }
            return -1;
        }

    }

