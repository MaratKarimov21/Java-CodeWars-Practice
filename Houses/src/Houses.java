public class Houses {
    public static long overTheRoad(long address, long n) {
        if (address % 2 == 1) {
            long pair = address / 2;
            return (2 * n - 2 * pair);
        } else {
            long pair = n - address / 2;
            return (2 * (pair + 1) - 1);
        }
    }
}
