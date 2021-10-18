import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task17 {
    private static final String regex = "^[-+]?[0-9]*[.]?[0-9]?$";

    public static List<String> filter(String[] input) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (String argument : input) {
            matcher = pattern.matcher(argument);
            boolean found = matcher.matches();
            if (found)
                result.add(argument + " Decimal");
            else
                result.add(argument + " String");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] input = {"+380", "word", "43a", "23.4"};
        List<String> filteredList = Task17.filter(input);
        System.out.println("Amount of arguments: " + input.length);
        System.out.println(filteredList);
    }
}
