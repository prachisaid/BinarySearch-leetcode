import java.util.Arrays;

public class BinaryNumSearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortArray(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, mid, low);
                mid++;
                low++;
            }else if(arr[mid] == 2){
                swap(arr, mid, high);
                high--;
            }else{
                mid++;
            }
        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
