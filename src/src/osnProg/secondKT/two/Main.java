package osnProg.secondKT.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] visitors = {true, true, true, false, true, true, true, true, true, false, true, false, true, false, false, true, true, true, true, true, false, false, true, true};

        int employeesCounter = 0;
        for (boolean visitor : visitors) {
            if (visitor) {
                employeesCounter++;
            }
        }

        System.out.println("Количество сотрудников на предприятии: " + employeesCounter);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив значений через запятую и без пробелов (например: 1,1,0,0,1):");
        String input = scanner.nextLine();
        String[] values = input.split(",");
        int employeesCounter2 = 0;
        for (String value : values) {
            if (value.trim().equals("1")) {
                employeesCounter2++;
            }
        }
        System.out.println("Количество сотрудников по введенным значениям: " + employeesCounter2);
    }
}