public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {5,4,3,12,2,1};

        System.out.println(isSortedAndHow(array));
    }

    public static String isSortedAndHow(int[] array) {
        int image = 0;
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] < array[i + 1]) {
                image++;
            } else if (array[i] > array[i + 1]) {
                image--;
            } else {
                image += Math.signum(image);
            }
        }
        if (image == array.length - 1) {
            return "yes, ascending";
        } else if (-image == array.length - 1) {
            return "yes, descending";
        } else return "no";
    }
}