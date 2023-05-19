public class BitonicArray{
    public static void main(String[] args) {
        int[] arr = {1, 3, 1};

        System.out.println(bitonicArray(arr));
    }

    static int bitonicArray(int arr[]){
        
        int start = 0;
        int end = arr.length-1;
        

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }else if(arr[mid] > arr[mid+1]){
                end = mid - 1;
            }
        }

        return start;
    }
}