package Calc;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        History historyManager = new History();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите математическое выражение (или 'выход' для завершения): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("выход")) {
                break;
            }

            double result = calculator.ozenExpression(input);
            System.out.println("Результат: " + result);

            historyManager.saveExpression(input, result);
        }

        List<String> history = historyManager.loadHistory();
        System.out.println("История вычислений:");
        for (String entry : history) {
            System.out.println(entry);
        }
    }
}
