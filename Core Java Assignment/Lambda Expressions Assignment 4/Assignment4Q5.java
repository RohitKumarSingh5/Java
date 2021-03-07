import java.util.Arrays;
import java.util.List;

public class Assignment4Q5 {
    List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    public static void main(String[] args) { }

    public static String processWords(List<String> list) {
        StringBuilder newWord = new StringBuilder();
        list.forEach(str->newWord.append(str.charAt(0)));
        return newWord.toString();
    }
}