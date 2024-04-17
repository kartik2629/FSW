import java.util.regex.*;

public class RegexFinderExample {
    public static void main(String[] args) {
        String text = "The pattern is in the text.";
        // Using Regex Finder
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Word found: " + matcher.group());
        }
    }
}
