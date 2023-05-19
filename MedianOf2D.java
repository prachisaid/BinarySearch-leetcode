public class MedianOf2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 6},
            {2, 5, 9},
            {3, 6, 9}
        };

        System.out.println(findMedian(new int[][] {{0},{0}}));
        System.out.println(findMedian(arr));
    }

    static int findMedian(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length; 
        
        int start = 0;
        int end = matrix[rows-1][cols-1];

        while(start <= end){
            int mid = start + (end -start)/2;
            int count = 0;
             
            for(int i =0; i < rows; i++){
                count += findNumberOfElems(matrix[i], mid);
            }

            if(count <= (rows*cols)/2){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return start;
    }

    static int findNumberOfElems(int[] is, int target) {
        int start  = 0;
        int end = is.length-1;

        while(start <= end){
            int mid = start + (end -start)/2;

            if(is[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
}
