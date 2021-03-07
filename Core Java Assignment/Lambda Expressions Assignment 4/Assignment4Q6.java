import java.util.List;
import java.util.function.UnaryOperator;

public class Assignment4Q6 {
    public static void main(String[] args) {}
    public List<String> convertToUpperCase(List<String> list) {
        UnaryOperator<String> op = word -> word.toUpperCase();
        list.replaceAll(op);
        return list;
    }

}