public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        return calc(r) + calc(g) + calc(b);
    }

    public static String calc(int value) {
        if (value < 0) value = 0;
        if (value > 255) value = 255;
        String firstChar = toHex(value / 16);
        String secondChar = toHex(value % 16);
        return firstChar + secondChar;
    }

    public static String toHex(int value) {
        switch(value) {
            case 10: return "A";
            case 11: return "B";
            case 12: return "C";
            case 13: return "D";
            case 14: return "E";
            case 15: return "F";
            case 16: return "G";
            default: return String.valueOf(value);
        }
    }
}
