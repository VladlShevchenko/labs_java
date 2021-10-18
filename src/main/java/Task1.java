import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static List<String> convert() {
        List<String> result = new ArrayList<>();
        for (int i = 10; i < 100; i += 20) {
            result.add(i + " - " + Integer.toString(i, 16));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> expected = convert();
        System.out.println(expected);
    }
}
