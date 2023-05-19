public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 2, 19, 2};
        int target = 19, start = 1, end = 4;

        int ans = linearSearch(arr, target, start, end);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target, int start, int end) {

        for (int i = start; i <= end; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        
        return -1;
    }
}
