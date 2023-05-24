package fourthKT.fourtyseven;
import java.util.ArrayList;
import java.util.List;


public class SnArrays {
    public static List<Integer> snail(int[][] array) {
        List<Integer> result = new ArrayList<>();
        int n = array.length;
        int rowNach = 0, rowKon = n - 1;
        int colNach = 0, colKon = n - 1;

        while (rowNach <= rowKon && colNach <= colKon) {
            for (int i = colNach; i <= colKon; i++) {
                result.add(array[rowNach][i]);
            }
            rowNach++;

            for (int i = rowNach; i <= rowKon; i++) {
                result.add(array[i][colKon]);
            }
            colKon--;

            if (rowNach <= rowKon) {
                for (int i = colKon; i >= colNach; i--) {
                    result.add(array[rowKon][i]);
                }
                rowKon--;
            }

            if (colNach <= colKon) {
                for (int i = rowKon; i >= rowNach; i--) {
                    result.add(array[i][colNach]);
                }
                colNach++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] array = {{5, 2, 8}, {4, 6, 3}, {1, 9, 0}};
        List<Integer> sorted = snail(array);
        System.out.println(sorted);
    }
}
