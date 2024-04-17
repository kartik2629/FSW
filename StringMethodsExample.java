public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        // Various String methods
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(7));
        System.out.println("Concatenation: " + str.concat(" How are you?"));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Replace 'l' with 'X': " + str.replace('l', 'X'));
    }
}