public class Exercise3 {

    private static long[] memo;

    public static long nthFibonacci(int n){

	if(n <= 1) {
            return n;
        }

        if(memo[n] != -1) {
            return memo[n];
        }

        

        memo[n] = nthFibonacci(n - 1) + nthFibonacci(n - 2);
        return memo[n];
    }

    public static double approximateGoldenRatio(int n) {
        if(n <= 1) {
            System.out.println("n should be greater than 1 for approximation!");
            return -1;
        }
        
        double ratio = (double) nthFibonacci(n) / nthFibonacci(n - 1);

        return ratio;
    }

    public static void main(String[] args) {

        int N= 80;
        memo = new long[N + 1];
        for (int i = 0; i <= N; i++) {
            memo[i] = -1;
        }

	// Testing robustness and computation time
        int[] testCases = {-10, -1, 0, 80, 2, 30, 40, 50, 70, 79}; 
        for (int n : testCases) {

	    long startTime = System.nanoTime();
	    double r = approximateGoldenRatio(n);
            long endTime = System.nanoTime();

            System.out.println("Approximation at position " + n + ": " + r + ", with computation time: " + (endTime - startTime) / 1_000 + " microseconds");
        }
    }

}


