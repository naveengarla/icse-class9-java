package Chapter4_ValuesAndDataTypes;
// 1.3_BoundaryConditionsDemo.java
// Character boundary conditions and property checks

class BoundaryConditionsDemo {
    public static void main(String[] args) {
        System.out.println("=== CHARACTER BOUNDARY CONDITIONS DEMO ===");
        System.out.println("Understanding character limits and property checks\n");

        // Character boundaries
        char minChar = Character.MIN_VALUE; // '\u0000'
        char maxChar = Character.MAX_VALUE; // '\uFFFF'
        System.out.println("--- Character Range ---");
        System.out.println("Min char (Unicode): " + (int)minChar);
        System.out.println("Max char (Unicode): " + (int)maxChar);
        System.out.println();

        // Character property checks
        System.out.println("--- Character Property Checks ---");
        char[] testChars = {'A', 'a', '9', ' ', '@', '\u0C95'};
        for (char ch : testChars) {
            System.out.println("Character: '" + ch + "'");
            System.out.println("  Is letter? " + Character.isLetter(ch));
            System.out.println("  Is digit? " + Character.isDigit(ch));
            System.out.println("  Is whitespace? " + Character.isWhitespace(ch));
            System.out.println("  Is uppercase? " + Character.isUpperCase(ch));
            System.out.println("  Is lowercase? " + Character.isLowerCase(ch));
            System.out.println();
        }
    }
}
