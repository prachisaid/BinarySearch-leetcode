public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 2, 19, 2};
        int target = 19;

        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        
        return -1;
    }
}
