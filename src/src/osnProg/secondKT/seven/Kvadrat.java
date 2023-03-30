package osnProg.secondKT.seven;

import java.util.Scanner;

public class Kvadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        int closestSquare = 0;
        int closestnum =0;
        int closestDistance = Integer.MAX_VALUE;

        for (int i = 0; i <= num; i++) {
            int square = i * i;
            int distance = Math.abs(num - square);

            if (distance < closestDistance) {
                closestDistance = distance;
                closestSquare = square;
                closestnum = i;
            }
        }

        System.out.println("Ближайший квадрат: " + closestSquare + ", число, возведенное в квадрат: " + closestnum);
    }
}