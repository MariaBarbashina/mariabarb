package osnProg.secondKT.eleven;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = scanner.nextLine();

        String result = str.replaceAll("[aeiouAEIOU]", "");

        System.out.println("Результат: " + result);
    }
}