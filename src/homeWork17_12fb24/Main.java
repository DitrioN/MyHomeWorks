package homeWork17_12fb24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main (String[] args) throws CustomException {
        String str = ".....0.1Прив.110ет 11.0, 99б 9пп";
        double[] dou = new StringUtilsImpl().findNumbers(str);

        for (double v : dou) {
            System.out.println(v);
        }

        int a = 10;
        Integer b = 10;

        System.out.print(a==b);
    }
}
