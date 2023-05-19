public class KthElem {
    public static void main(String[] args) {
        int[] num1 = {-2, -3, 1, 2, 4, 5, 6};
        int[] num2 = {0, 3, 7, 9, 10};

        System.out.println(kthElement(num1, num2, num1.length, num2.length, 4));
    }

    static int kthElement(int[] num1, int[] num2, int n, int m, int p){

        if(n > m){
            return kthElement(num2, num1, m, n, p);
        }

        int k = (n+m)-p;

        int start  = Math.max(0, k-m);
        int end = Math.min(k, n); 

        while(start <= end){
        int mid1 = start + (end - start) / 2;
        int mid2 = k-mid1;

        int l1 = mid1 == 0 ? Integer.MIN_VALUE : num1[mid1-1];
        int l2 = mid2 == 0 ? Integer.MIN_VALUE : num2[mid2-1];
        
        int r1 = mid1 == n ? Integer.MAX_VALUE : num1[mid1];
        int r2 = mid2 == m ? Integer.MAX_VALUE : num2[mid2];

        if(l1 <= r2 && l2 <= r1){
            return Math.min(r1, r2);
        }
        else if(l2 > r1){
            start = mid1+1;
        }else{
            end = mid1-1;
        }
    }

        return -1;
    }
}
