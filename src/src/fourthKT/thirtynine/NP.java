package fourthKT.thirtynine;

import java.util.Arrays;

public class NP {
    public int getNP(int num) {
        int[] digital = Integer.toString(num).chars().map(c -> c - '0').toArray();
        int i = digital.length - 2;
        while (i >= 0 && digital[i] >= digital[i + 1]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }
        int j = digital.length - 1;
        while (digital[j] <= digital[i]) {
            j--;
        }
        int t = digital[i];
        digital[i] = digital[j];
        digital[j] = t;
        Arrays.sort(digital, i + 1, digital.length);
        int nP = Integer.parseInt(Arrays.toString(digital)
                .replaceAll("[\\[\\]\\,\\s]", ""));
        return (nP > num) ? nP : -1;
    }
}