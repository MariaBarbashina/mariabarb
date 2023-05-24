package fourthKT.fourtynine;

public class Calc {
    public static int f(int num) {
        int x = 0;
        int y = 1;

        if (num == 0) {
            return x;
        }

        if (num == 1 || num == 2) {
            return y;
        }

        while (num > 2) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
                int temp = x;
                x = x + y;
                y = temp;
            }
        }

        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(f(0));
        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));
    }
}