package osnProg.secondKT.four;

public class Counter {
    public static void main(String[] args) {
        String str = "Hello";
        char ch = 'o';
        int count = str_count(str, ch);
        System.out.println(count);
    }

    public static int str_count(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
