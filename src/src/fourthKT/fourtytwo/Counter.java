package fourthKT.fourtytwo;

public class Counter {
    public static int counter(int[][] intervals) {
        int c = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
            int ender = intervals[i][1];
            int started = intervals[i + 1][0];
            c += started - ender - 1;
        }
        return c;
    }
}
