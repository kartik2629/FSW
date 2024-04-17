import java.util.regex.*;

public class RegexMetaCharactersExample {
    public static void main(String[] args) {
        String text = "a.b";
        // Using Regex MetaCharacters
        Pattern pattern = Pattern.compile("a\\.b");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        } else {
            System.out.println("Match not found");
        }
    }
}