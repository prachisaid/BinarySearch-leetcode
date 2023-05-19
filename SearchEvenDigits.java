public class SearchEvenDigits {
    public static void main(String[] args) {
       int[] arr = {12, 8, 9, 7897, 12};

       System.out.println(findNumber(arr));
    }

    static int findNumber(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(even(arr[i])){
                count++;
            }
        }

        return count;
    }

    static boolean even(int arr){

        int num = digits2(arr);

        if(num % 2 == 0){
            return true;
        }

        return false;
    }

    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }

        return (int) (Math.log10(num)) + 1;
    }

    // find the number of digits 
    static int digits(int arr){

        if(arr < 0){
            arr = arr * -1;
        }

        if(arr == 0){
            return 1;
        }

        int count = 0;

        while(arr > 0){
            count++;
            arr = arr/10;
        }

        return count;
    }
}
