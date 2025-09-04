package Chapter4_ValuesAndDataTypes;
// 1.JavaCharacterSetDemo.java
// Comprehensive hands-on exploration of Java Character Set
// Covers ASCII, Unicode, boundary cases, and practical programming usage

class JavaCharacterSetDemo {
    public static void main(String[] args) {
        // 1. Basic ASCII characters
        System.out.println("--- ASCII Characters ---");
        for (char c = 32; c < 128; c++) { // Printable ASCII range
            System.out.print(c + " ");
        }
        System.out.println("\n");

        // 2. Print ASCII values for characters
        System.out.println("--- ASCII Values ---");
        char sample = 'A';
        System.out.println("Character: " + sample + ", ASCII Value: " + (int)sample);
        sample = 'z';
        System.out.println("Character: " + sample + ", ASCII Value: " + (int)sample);
        System.out.println();

        // 3. Unicode examples (multilingual)
        System.out.println("--- Unicode Characters ---");
        char kannada = '\u0C95'; // ಕ
        char telugu = '\u0C24'; // త
        char chinese = '\u4E2D'; // 中
        char arabic = '\u0627'; // ا
        char emoji = '\u263A'; // ☺
        System.out.println("Kannada: " + kannada);
        System.out.println("Telugu: " + telugu);
        System.out.println("Chinese: " + chinese);
        System.out.println("Arabic: " + arabic);
        System.out.println("Emoji: " + emoji);
        System.out.println();

        // 4. Boundary conditions
        System.out.println("--- Boundary Conditions ---");
        char minChar = Character.MIN_VALUE; // '\u0000'
        char maxChar = Character.MAX_VALUE; // '\uFFFF'
        System.out.println("Min char (Unicode): " + (int)minChar);
        System.out.println("Max char (Unicode): " + (int)maxChar);
        System.out.println("Is 'A' a letter? " + Character.isLetter('A'));
        System.out.println("Is '9' a digit? " + Character.isDigit('9'));
        System.out.println("Is ' ' whitespace? " + Character.isWhitespace(' '));
        System.out.println();

        // 5. Practical: Validate if a character is valid for Java identifier
        System.out.println("--- Valid Identifier Characters ---");
        char[] testChars = {'A', '_', '$', '9', '#', '\u0939'};
        for (char tc : testChars) {
            System.out.println("'" + tc + "' valid start: " + Character.isJavaIdentifierStart(tc) + ", valid part: " + Character.isJavaIdentifierPart(tc));
        }
        System.out.println();

        // 6. Edge case: Surrogate pairs (for advanced Unicode)
        System.out.println("--- Surrogate Pairs (Advanced) ---");
        String smiley = "\uD83D\uDE00"; // 😀
        System.out.println("Smiley (surrogate pair): " + smiley);
    }
}
