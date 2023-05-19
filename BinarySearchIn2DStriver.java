import java.util.Arrays;

public class BinarySearchIn2DStriver {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };

        int[] res =search(arr, arr.length, arr[0].length, 30);

        System.out.println(Arrays.toString(res));
    }

    static int[] search(int[][] matrix, int n, int m, int target){

        int low = 0;
        int high = (n*m)-1;
        
        while(low <= high){
            int mid = (low+high)/2;
 
            System.out.println(mid);
            int startIndex = mid/m;
            int endIndex = mid%m;

            if(target > matrix[startIndex][endIndex]){
                low = mid + 1;
            }
            else if(target < matrix[startIndex][endIndex]){
                high = mid - 1;
            }
            else{
                return new int[] {startIndex, endIndex};
            }
        }

        return new int[] {-1, -1};
    }
}
