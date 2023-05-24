package fourthKT.fourtyfive;

public class Converter {

    private static final String[] tisyach = {"", "M", "MM", "MMM"};
    private static final String[] sotochki = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] desyatochki = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] edinichki = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public static String converter(int numb) {
        if (numb < 1 || numb > 9999) {
            throw new IllegalArgumentException("Number out of range (1-9999)");
        }

        StringBuilder resultik = new StringBuilder();
        resultik.append(tisyach[numb / 1000]);
        resultik.append(sotochki[(numb % 1000) / 100]);
        resultik.append(desyatochki[(numb % 100) / 10]);
        resultik.append(edinichki[numb % 10]);

        return resultik.toString();
    }
}
