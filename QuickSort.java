package Sorting;

import java.util.Arrays;

public class QuickSort {
    // two pointer are maintained start and end , if start is greater than pivot and end is less than pivot than swap
    // as ultimately we want than our left hand side elements must be less than pivot and right greater
    // tc - O(nlogn)
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 1, 4, 7, 6};
        quickSort(numbers, 0, numbers.length - 1);
        // Print the sorted array
        System.out.println(Arrays.toString(numbers));
// inbuilt library
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void quickSort(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low ;
        int e = hi;
        int m = s+ (e-s)/2;
        int pivot=nums[m];
    // also a reason why if its already sorted it will now swap
        while (s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while (nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        quickSort(nums,low ,e);
        quickSort(nums , s ,hi);
    }

}