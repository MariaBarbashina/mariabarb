package osnProg.secondKT.fifteen;

import java.util.*;

public class Deletik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

        String output = String.join(" ", uniqueWords);
        System.out.println(output);
    }
}