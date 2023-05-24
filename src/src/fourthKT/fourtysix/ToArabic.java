package fourthKT.fourtysix;

import java.util.HashMap;

public class ToArabic {
    public static int converter(String roma) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int resultik = 0;
        for (int i = 0; i < roma.length(); i++) {
            int data = map.get(roma.charAt(i));
            if (i + 1 < roma.length() && map.get(roma.charAt(i + 1)) > data) {
                resultik -= data;
            } else {
                resultik += data;
            }
        }
        return resultik;
    }
}