package homeWork17_12fb24;

public class StringUtilsImpl implements StringUtils {

    @Override
    public double div (String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        return 0;
    }

    @Override
    public int[] findWord (String text, String word) throws NullPointerException {
        if (text == null || word == null) return null;

        int[] result = new int[(text.length() - text.replace(word, "").length()) / word.length()];
        String str = text;

        for (int f1 = 0; f1 < result.length; f1++) {
            result[f1] = str.indexOf(word) + (text.length() - str.length());
            str = str.substring(str.indexOf(word) + word.length(), str.length());
        }

        return result;
    }

    @Override
    public double[] findNumbers (String text) throws CustomException {
        String arrInt = "0123456789";
        StringBuilder[] arrStr = new StringBuilder[0];

        for (int i = 0; i < text.length(); i++) {
            if (arrInt.contains(String.valueOf(text.charAt(i)))) {

                StringBuilder[] bufStr = arrStr;
                arrStr = new StringBuilder[bufStr.length + 1];
                for (int f1 = 0; f1 < bufStr.length; f1++) arrStr[f1] = bufStr[f1];
                arrStr[bufStr.length] = new StringBuilder();

                for (int j = i; j < text.length(); j++) {
                    if (arrInt.contains(String.valueOf(text.charAt(j)))) {
                        arrStr[bufStr.length].append(text.charAt(j));
                    } else if (".".equals(String.valueOf(text.charAt(j)))) {
                        if (!".".equals(String.valueOf(text.charAt(j - 1)))) {
                            arrStr[bufStr.length].append(text.charAt(j));
                        } else {
                            i = j;
                            break;
                        }
                    } else {
                        i = j;
                        break;
                    }
                }

            }
        }

        if (arrStr.length == 0) {
            throw new CustomException("Not fou234.9nd");
        } else {
            double[] result = new double[arrStr.length];
            for (int f1 = 0; f1 < result.length; f1++) {
                result[f1] = Double.parseDouble(arrStr[f1].toString());
            }
            return result;
        }
    }
}
