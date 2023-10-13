public class Main {
    public static void main(String[] args) {
        var generateTetaMatrix = new GenerateTethaMatrix();
        var tetaMatrix = generateTetaMatrix.generateMatrix(5);

        System.out.println("n: 5");
        System.out.println("Teta Matrix:");
        showMatrix(tetaMatrix);

        System.out.println("n: 4");
        tetaMatrix = generateTetaMatrix.generateMatrix(4);
        System.out.println("Teta Matrix:");
        showMatrix(tetaMatrix);

        System.out.println("n: 3");
        tetaMatrix = generateTetaMatrix.generateMatrix(3);
        System.out.println("Teta Matrix:");
        showMatrix(tetaMatrix);

        System.out.println("n: 2");
        tetaMatrix = generateTetaMatrix.generateMatrix(2);
        System.out.println("Teta Matrix:");
        showMatrix(tetaMatrix);
    }

    public static void showMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("| ");
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println("|");
        }
    }
}
