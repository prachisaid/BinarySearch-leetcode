import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {

    }

    static int nextGap(int gap){
        if(gap <= 1){
            return 0;
        }
    
        return (gap / 2) + (gap % 2);
    }

    static void sort(int[] arr1, int[] arr2, int n, int m){
        int i, j, gap = n + m;

        for(gap = nextGap(gap); gap > 0; gap = nextGap(gap)){

            // for comparing first array
            for(i = 0; i + gap < n; i++){
                if(arr[i] > arr[i + gap]){
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
            }
        }
    }
}
