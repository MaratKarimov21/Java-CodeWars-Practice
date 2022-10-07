public class Main {
    public static void main(String[] args) {

        String s = whitespaceNumber(1);
        s = s.replace("\n", "\\n");
        s = s.replace("\t", "\\t");
        System.out.println(s);
    }

    public static String whitespaceNumber(final int n) {
        String sign = "";
        if (n > 0) {
            sign = " ";
        } else if (n < 0) {
            sign = "\t";
        }
        String value = Integer.toBinaryString(Math.abs(n)).replaceAll("0", " ").replaceAll("1", "\t");
        return sign + value + "\n";
    }
}