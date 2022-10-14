public class Main {
    public static void main(String[] args) {
        solution(1, 5);
    }
    public static int solution(int start, int finish)
    {
        int big_jumps = (finish - start) / 3;
        int small_jumps = (finish - start) % 3;

        return big_jumps + small_jumps;
    }
}