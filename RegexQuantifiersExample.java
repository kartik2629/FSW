import java.util.regex.*;

public class RegexQuantifiersExample {
    public static void main(String[] args) {
        String text = "aaaabbbbccccc";
        // Using Regex Quantifiers
        Pattern pattern = Pattern.compile("a{3,4}");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        } else {
            System.out.println("Match not found");
        }
    }
}