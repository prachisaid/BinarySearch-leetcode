import java.util.Arrays;

public class MedianOfTwoArrays {
    public static void main(String[] args) {
        int[] num1 = {1, 3};
        int[] num2 = {2};

        System.out.println(findMedian(num1, num2));
    }

    static double findMedian(int[] num1, int[] num2){

        if(num2.length < num1.length){
            return findMedian(num2, num1);
        }

        int n1 = num1.length;
        int n2 = num2.length;

        int start  = 0;
        int end = n1; 

        
        while(start <= end){
        int mid1 = start + (end - start) / 2;
        int mid2 = (n1+n2+1)/2 - mid1;

        int l1 = mid1 == 0 ? Integer.MIN_VALUE : num1[mid1-1];
        int l2 = mid2 == 0 ? Integer.MIN_VALUE : num2[mid2-1];
        
        int r1 = mid1 == n1 ? Integer.MAX_VALUE : num1[mid1];
        int r2 = mid2 == n2 ? Integer.MAX_VALUE : num2[mid2];

        if(l1 <= r2 && l2 <= r1){
            if((n1+n2) % 2 == 0){
                return (Math.max(l1, l2) + Math.min(r1, r2))/2.0;
            }else{
                return Math.max(l1, l2);
            }
        }
        else if(l2 > r1){
            start = mid1+1;
        }else{
            end = mid1-1;
        }
    }

        return 0.0;
    }
}
