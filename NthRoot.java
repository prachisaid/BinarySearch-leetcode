public class NthRoot {
    public static void main(String[] args) {
        System.out.println(8 > 0.000001);
        System.out.println(nthRoot(2, 8));
    }

    static double findTarget(int n, double mid){
        double num = 1.0;
        // while(n != 0){
        //     num *= mid;
        //     n--;
        // }

        num = mid*mid;

        return num;
    }

    static double nthRoot(int n, int m){
        double start = 1;
        double end = m;
        double eps = 1e-3;

        while((end-start) > eps){
            double mid = (start + end)/2.0;
            double target = findTarget(2, mid);

            if(target > m){
                end = mid;
            }else{
                start = mid;
            }
        }
        System.out.println(end - start);
        return end;
    }
}
