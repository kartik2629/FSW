import java.util.regex.*;

public class MatcherExample {
    public static void main(String[] args) {
        String text = "The cat in the hat";
        Pattern pattern = Pattern.compile("cat");
        Matcher matcher = pattern.matcher(text);
        // Using Matcher methods
        if (matcher.find()) {
            System.out.println("Match found at index " + matcher.start());
        } else {
            System.out.println("Match not found");
        }
    }
}