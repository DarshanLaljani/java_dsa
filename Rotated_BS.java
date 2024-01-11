public class Rotated_BS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(rotsearch(arr, 7,0,arr.length-1));
    }

    private static int rotsearch(int[] arr, int target, int s, int e) {

        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                rotsearch(arr, target, s, mid - 1);
            } else {
                rotsearch(arr, target, mid + 1, e);
            }
        }
            if (target >= arr[mid] && target <= arr[e]) {
                return rotsearch(arr, target, mid + 1, e);
            }


        return rotsearch(arr, target, s, mid - 1);
    }
}