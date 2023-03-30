package osnProg.secondKT.five;

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            sum += n * n;
        }

        System.out.println(sum);
    }
}