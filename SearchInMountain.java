public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 6, 3, 1};
        int target = 6;

        System.out.println(findInMountainArray(target, arr));
    }

    static int findInMountainArray(int target, int[] arr){
        int peak = bitonicArray(arr);

        if(arr[peak] == target){
            return peak;
        }

        if(ascArray(arr, target, peak) != -1){
            return ascArray(arr, target, peak);
        }
        else if(dscArray(arr, target, peak) != -1){
            return dscArray(arr, target, peak);
        }else{
            return -1;
        }
    }

    static int ascArray(int[] arr, int target, int peak){
        int start = 0;
        int end = peak;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int dscArray(int[] arr, int target, int peak){
        int start = peak+1;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                end = mid - 1;
            }else if(target < arr[mid]){        // descending order
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
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
