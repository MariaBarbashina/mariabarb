package osnProg.secondKT.six;

import java.util.Scanner;

public class Proverka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int n = scanner.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime && n >= 1) {
            System.out.println(n + " - простое число");
        } else {
            System.out.println(n + " - не простое число");
        }
    }
}