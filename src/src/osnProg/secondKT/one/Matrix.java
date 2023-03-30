package osnProg.secondKT.one;

import java.util.Random;
import java.util.Arrays;

public class Matrix {

    Random randomizer = new Random();
    private int size;
    private int[][] matrix;

    public Matrix(int size) {
        this.size = size;
        matrix = new int[size][size];
        populate();
    }

    @Override
    public String toString() {

        return Arrays.deepToString(matrix)
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]");

    }
    public int[][] transp(Matrix m) {
        int[][] trans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++){

                trans[j][i] = matrix[i][j];


            }
        }
        return trans;
    }

    private void populate() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomizer.nextInt(9) + 1;
            }
        }
    }
}
