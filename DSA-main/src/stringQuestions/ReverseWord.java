package stringQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWord {
    static void main() {

        String str = "  Hello World" ;
        String s = str.trim();
        List<String> words = Arrays.asList(s.split("\\s+"));
        Collections.reverse(words);
        System.out.println(String.join(" ", words));
    }
}
