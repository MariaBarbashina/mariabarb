package fourthKT.fourtyone;

public class TimeCalculator {
    private static final int GOD = 365 * 24 * 60 * 60;
    private static final int MES = 30 * 24 * 60 * 60;
    private static final int NED = 7 * 24 * 60 * 60;
    private static final int DEN = 24 * 60 * 60;
    private static final int CHAS = 60 * 60;
    private static final int MINUT = 60;

    public static String calculateTime(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Время не может быть отрицательным");
        }

        if (seconds == 0) {
            return "0 секунд";
        }

        int god = seconds / GOD;
        seconds -= god * GOD;
        int mes = seconds / MES;
        seconds -= mes * MES;
        int ned = seconds / NED;
        seconds -= ned * NED;
        int den = seconds / DEN;
        seconds -= den * DEN;
        int chas = seconds / CHAS;
        seconds -= chas * CHAS;
        int minut = seconds / MINUT;
        seconds -= minut * MINUT;

        StringBuilder sb = new StringBuilder();
        if (god > 0) {
            sb.append(god).append(" ").append(formater(god, "год", "года", "лет"));
        }
        if (mes > 0) {
            appender(sb);
            sb.append(mes).append(" ").append(formater(mes, "месяц", "месяца", "месяцев"));
        }
        if (ned > 0) {
            appender(sb);
            sb.append(ned).append(" ").append(formater(ned, "неделя", "недели", "недель"));
        }
        if (den > 0) {
            appender(sb);
            sb.append(den).append(" ").append(formater(den, "день", "дня", "дней"));
        }
        if (chas > 0) {
            appender(sb);
            sb.append(chas).append(" ").append(formater(chas, "час", "часа", "часов"));
        }
        if (minut > 0) {
            appender(sb);
            sb.append(minut).append(" ").append(formater(minut, "минута", "минуты", "минут"));
        }
        if (seconds > 0) {
            appender(sb);
            sb.append(seconds).append(" ").append(formater(seconds, "секунда", "секунды", "секунд"));
        }

        return sb.toString();
    }

    private static void appender(StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
    }

    private static String formater(int numb, String f1, String f2, String f5) {
        if (numb % 10 == 1 && numb % 100 != 11) {
            return f1;
        } else if (numb % 10 >= 2 && numb % 10 <= 4 && (numb % 100 < 10 || numb % 100 >= 20)) {
            return f2;
        } else {
            return f5;
        }
    }
}
