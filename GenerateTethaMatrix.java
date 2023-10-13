public class GenerateTethaMatrix {
    public int[][] generateMatrix(int n) {
        int[][] tetaMatrix = new int[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    if (condition(n, i, j, k)){
                        tetaMatrix[i-1][j-1] += summation(n, i, j, k);
                    }
                }
            }
        }
        return tetaMatrix;
    }

    public boolean condition(int n, int i, int j, int k) {
        if (((j - 1 >= 0) && (j - 1 >= k)) && ((n - j >= 0) && (i - k - 1 >= 0) && (n - j >= i - k - 1))) {
            return true;
        } else {
            return false;
        }
    }

    public int summation(int n, int i, int j, int k) {
        int x = (int) (Math.pow(-1, k) * getCombinatorio(j - 1, k) * getCombinatorio(n - j, i - k - 1));
        return x;
    }

    public int getCombinatorio(int n, int r) {
        if (n > r) {
            int factorialN = factorial(n); // m!
            int factorialR = factorial(r); // r!
            int factorialNmenosR = factorial(n - r); // (n-r)!

            int combinatorio = factorialN / (factorialR * factorialNmenosR); // n! / (r! * (n-r)!)

            return combinatorio;
        } 

        if ((n == 0) && (r == 0)) {
            return 1;
        }

        if (n == r) {
            return 1;
        }

        return 0;
    }

    public int factorial(int a){
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
