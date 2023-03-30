package osnProg.secondKT.sixteen;

import java.util.Scanner;

public class Registr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int upperCounter = 0;
        int lowerCounter = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCounter++;
            } else if (Character.isLowerCase(c)) {
                lowerCounter++;
            }
        }

        String output;
        if (upperCounter > lowerCounter) {
            output = input.toUpperCase();
        } else if (upperCounter < lowerCounter) {
            output = input.toLowerCase();
        } else {
            output = input.toLowerCase();
        }

        System.out.println(output);
    }
}