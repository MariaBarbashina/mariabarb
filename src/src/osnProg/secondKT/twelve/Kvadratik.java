package osnProg.secondKT.twelve;

import java.util.Scanner;

public class Kvadratik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int first = scanner.nextInt();

        System.out.println("Введите шаг:");
        int step = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            int num = first + i * step;
            int square = num * num;
            System.out.print(square + " ");
        }
    }
}