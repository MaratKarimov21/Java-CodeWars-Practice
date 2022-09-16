import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class ReverseWords {
    public static String reverseWords(String str){
        List<String> words = Arrays.asList(str.split("\\W+"));
        Collections.reverse(words);

        return String.join(" ", words);
    }
}

