package fourthKT.fourtyeight;

import java.util.HashSet;

public class US {
    public static void main(String[] args) {
        int nom = 30;
        HashSet<Integer> v = new HashSet<>();

        int a = 0;
        int b, c;

        while (v.size() < nom) {
            b = 2 * a + 1;
            c = 3 * a + 1;
            v.add(a);
            v.add(b);
            v.add(c);
            a++;
        }

        System.out.println("Ряд чисел v без дубликатов:");
        for (int num : v) {
            System.out.print(num + " ");
        }
    }
}