import java.util.regex.*;

public class PatternExample {
    public static void main(String[] args) {
        String regex = "ab+c";
        String input = "abbc";
        // Using Pattern methods
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Pattern matched!");
        } else {
            System.out.println("Pattern did not match");
        }
    }
}