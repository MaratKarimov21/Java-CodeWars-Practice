import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static long multiply(long a, long b) {
        BigInteger mult = BigInteger.valueOf(a).multiply(BigInteger.valueOf(b));
        BigInteger max = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger min = BigInteger.valueOf(Long.MIN_VALUE);


        if (mult.compareTo(max) == 1 || mult.compareTo(min) == -1) throw new ArithmeticException();

        return mult.longValue();

    }
}