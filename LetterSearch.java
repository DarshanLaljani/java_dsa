public class LetterSearch {
    public static void main(String[] args) {
        char[] arr = {'a','c','f'};
        char target = 'a';
        System.out.println(ceiling(arr,target));
    }
    static char ceiling(char[] arr , char target ){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }else{
                start = mid + 1;
            }
        }
        return arr[start%arr.length];
    }
}
