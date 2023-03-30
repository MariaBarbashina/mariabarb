package osnProg.secondKT.nine;

import java.util.Scanner;

public class Stroki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine();

        boolean endsWith = str1.endsWith(str2);

        if (endsWith) {
            System.out.println("Вторая строка является окончанием первой.");
        } else {
            System.out.println("Вторая строка не является окончанием первой.");
        }
    }
}