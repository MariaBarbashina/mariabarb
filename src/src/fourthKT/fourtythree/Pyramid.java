package fourthKT.fourtythree;

public class Pyramid {
    public static int findMaxim(int[][] pyramida) {
        int rows = pyramida.length;
        int[][] maximSum = new int[rows][rows];
        maximSum[0][0] = pyramida[0][0];

        for (int i = 1; i < rows; i++) {
            maximSum[i][0] = maximSum[i - 1][0] + pyramida[i][0];
            maximSum[i][i] = maximSum[i - 1][i - 1] + pyramida[i][i];
            for (int j = 1; j < i; j++) {
                maximSum[i][j] = Math.max(maximSum[i - 1][j - 1], maximSum[i - 1][j]) + pyramida[i][j];
            }
        }

        int maxim = 0;
        for (int i = 0; i < rows; i++) {
            maxim = Math.max(maxim, maximSum[rows - 1][i]);
        }

        return maxim;
    }

    public static void main(String[] args) {
        int[][] pyramida = {
                {4},
                {9, 5},
                {3, 5, 8},
                {6, 4, 9, 2}
        };

        int maxSlideSum = findMaxim(pyramida);
        System.out.println("Максимальная сумма скольжения: " + maxSlideSum);
    }
}