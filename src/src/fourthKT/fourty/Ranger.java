package fourthKT.fourty;

import java.util.ArrayList;
import java.util.List;

public class Ranger {
    public static String formatRanger(int[] numb) {
        List<String> ranges = new ArrayList<>();
        int starter = numb[0];
        int end = starter;

        for (int j = 1; j < numb.length; j++) {
            if (numb[j] == end + 1) {
                end++;
            } else {
                ranges.add(formater(starter, end));
                starter = end = numb[j];
            }
        }
        ranges.add(formater(starter, end));

        return String.join(",", ranges);
    }

    private static String formater(int starter, int end) {
        if (starter == end) {
            return Integer.toString(starter);
        } else {
            return starter + "-" + end;
        }
    }
}
