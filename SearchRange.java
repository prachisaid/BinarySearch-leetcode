import java.util.Arrays;

public class SearchRange{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 5, 6};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(arr, target)));
        // System.out.println(searchRange(arr, target));
    }

    static int[] searchRange(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int[] ans = {-1, -1};

        if(arr.length == 0){
            return ans;
        }
        
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                System.out.println(start + " " + end + " " + mid);
                end = mid - 1;
            }else{
                if(target > arr[mid]){
                    System.out.println(start + " " + end + " " + mid);
                    start = mid + 1;
                }else{
                    System.out.println(start + " " + end + " " + mid);
                    end = mid - 1;
                }
            }
        }

        if(start > arr.length){
            
        }
        else if(arr[start] == target){
            System.out.println(start);
            
            ans[0] = start;
        }

        start = 0;
        end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                System.out.println(start + " a " + end + " " + mid);
                start = mid + 1;
            }else if(target < arr[mid]){
                System.out.println(start + " b " + end + " " + mid);
                end = mid - 1;
            }else{
                if(arr[mid] > target){
                    System.out.println(start + " c " + end + " " + mid);
                    end = mid - 1;
                }else{
                    System.out.println(start + " d " + end + " " + mid);
                    start = mid + 1;
                }
            }
        }
        
        if(end == -1){

        }
        else if(arr[end] == target){
            System.out.println(end);
            ans[1] = end;
        }
    

        return ans;
    }
}