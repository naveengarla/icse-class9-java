package Chapter4_ValuesAndDataTypes;
// 1.4_IdentifierCharacterDemo.java
// Java identifier character validation

class IdentifierCharacterDemo {
    public static void main(String[] args) {
        System.out.println("=== JAVA IDENTIFIER CHARACTER DEMO ===");
        System.out.println("Testing which characters are valid for Java identifiers\n");

        System.out.println("--- Valid Identifier Characters ---");
        char[] testChars = {'A', 'a', '_', '$', '9', '#', '@', '\u0C95'};
        for (char tc : testChars) {
            System.out.println("Character: '" + tc + "'");
            System.out.println("  Can start identifier? " + Character.isJavaIdentifierStart(tc));
            System.out.println("  Can be part of identifier? " + Character.isJavaIdentifierPart(tc));
            System.out.println();
        }

        System.out.println("--- Identifier Rules ---");
        System.out.println("1. Must start with letter, underscore (_), or dollar ($)");
        System.out.println("2. Can contain letters, digits, underscore, or dollar");
        System.out.println("3. Cannot be a Java keyword");
        System.out.println("4. Case sensitive");
    }
}
