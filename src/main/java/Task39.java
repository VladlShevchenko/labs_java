import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task39 {
    private static final String regex = "[0-9a-fA-F]+";

    public static List<String> filter(String[] input) {
        List<String> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (String argument : input) {
            matcher = pattern.matcher(argument);
            boolean found = matcher.matches();
            if (found)
                result.add(argument + " - " + hexToBin(argument));
        }
        return result;
    }

    static String hexToBin(String s) {
        return new BigInteger(s, 16).toString(2);
    }

    public static void main(String[] args) {
        String[] input = {"03", "F", "01", "23.4"};
        System.out.println("Input List: " + Arrays.toString(input));
        List<String> filteredList = Task39.filter(input);
        System.out.println("Amount of arguments: " + input.length);
        System.out.println(filteredList);
    }
}
