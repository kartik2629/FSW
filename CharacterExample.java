public class CharacterExample {
    public static void main(String[] args) {
        char ch = 'A';
        // Using Character class methods
        System.out.println("Is digit: " + Character.isDigit(ch));
        System.out.println("Is letter: " + Character.isLetter(ch));
        System.out.println("Is uppercase: " + Character.isUpperCase(ch));
        System.out.println("To lowercase: " + Character.toLowerCase(ch));
    }
}