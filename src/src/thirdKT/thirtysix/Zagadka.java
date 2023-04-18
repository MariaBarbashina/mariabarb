package thirdKT.thirtysix;

import java.util.Random;
import java.util.Scanner;

public class Zagadka {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] secretCode = new int[4];
        for (int i = 0; i < 4; i++) {
            secretCode[i] = random.nextInt(10);
        }

        System.out.println("Угадай код из четырех символов");

        int attemptsLeft = 20;
        while (attemptsLeft > 0) {
            System.out.println("Осталось попыток: " + attemptsLeft);
            int[] guess = new int[4];
            System.out.print("Введите 4 числа от 0 до 9: ");
            for (int i = 0; i < 4; i++) {
                guess[i] = scanner.nextInt();
            }

            int numMatches = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == secretCode[i]) {
                    numMatches++;
                }
            }

            if (numMatches == 4) {
                System.out.println("Ты угадал код!!!");
                return;
            } else {
                System.out.println("Всего Совпадений: " + numMatches);
            }

            attemptsLeft--;
        }

        System.out.println("Ты проиграл, попытки закончились");
    }
}