import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(countSmileys(Arrays.asList(":)", "XD", ":0}", "x:-", "):-", "D:")));

    }

    public static int countSmileys(List<String> arr) {
        int faceCounter = 0;

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
            System.out.println(checkFace(arr.get(i)));
            if (checkFace(arr.get(i))) faceCounter++;
        }
        return faceCounter;
    }

    public static boolean checkFace(String el) {
        if (el.length() > 3) return false;

        int mouthIndex = mouthIndex(el);

        if (mouthIndex < 1) return false;

        if (mouthIndex == -1) return false;

        if (checkEyes(el, mouthIndex) && el.length() == 2) return true;

        String nose = el.substring(mouthIndex - 1, mouthIndex);

        if (nose.equals("-") || nose.equals("~")) {
            if (checkEyes(el, mouthIndex - 1)) return true;
        }

        return false;
    }

    public static boolean checkEyes(String el, int index) {
        String eyes = el.substring(index - 1, index);


        if (eyes.equals(":") || eyes.equals(";")) {
            return true;
        }
        return false;
    }

    public static int mouthIndex(String el) {
        if (el.contains(")")) {
            return el.indexOf(")");
        } else if (el.contains("D")) {
            return el.indexOf(("D"));
        } else return -1;
    }
}