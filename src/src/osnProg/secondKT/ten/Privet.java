package osnProg.secondKT.ten;

import java.util.Scanner;

public class Privet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        System.out.printf("Привет, %s!", formattedName);
    }
}