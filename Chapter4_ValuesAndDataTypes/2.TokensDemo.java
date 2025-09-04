package Chapter4_ValuesAndDataTypes;
// 2.TokensDemo.java
// Hands-on exploration of Java tokens: keywords, identifiers, symbols
// Includes valid/invalid examples and boundary cases

// List of Java keywords for reference:
// abstract, assert, boolean, break, byte, case, catch, char, class, const, continue, default, do, double, else, enum, extends, final, finally, float, for, goto, if, implements, import, instanceof, int, interface, long, native, new, package, private, protected, public, return, short, static, strictfp, super, switch, synchronized, this, throw, throws, transient, try, void, volatile, while

class TokensDemo {
    public static void main(String[] args) {
        // 1. Keywords (reserved words)
        // Example: int, class, public, static
        int number = 10; // 'int' is a keyword
        // String className = "TokensDemo"; // 'class' is a keyword

        // 1a. Case sensitivity
        int Value = 1;
        int value = 2;
        System.out.println("Case sensitivity: Value=" + Value + ", value=" + value);

        // 1b. Identifier length
        int thisIsAReallyLongIdentifierNameToShowLengthLimit = 100;
        System.out.println("Long identifier: " + thisIsAReallyLongIdentifierNameToShowLengthLimit);

        // 2. Identifiers (names for variables, methods, classes)
        int _validIdentifier = 5;
        int $anotherValid = 7;
        int valid123 = 123;
        // int 123invalid = 10; // Invalid: cannot start with digit
        // int class = 20; // Invalid: 'class' is a keyword
        // int my-var = 30; // Invalid: '-' not allowed in identifiers

        // 2a. Practical use in method names
        System.out.println("Method result: " + sampleMethod123());

        // 3. Symbols (operators, punctuation)
        int sum = number + _validIdentifier; // '+' is an operator
        System.out.println("Sum: " + sum); // '(' and ')' are symbols

        // 3a. More symbols
        int[] arr = {1, 2, 3}; // '{', '}', '[', ']' are symbols
        System.out.println("Array: " + arr[0] + ", " + arr[1] + ", " + arr[2]);
        // ';' is a symbol (statement terminator)

        // 4. Boundary cases for identifiers
        String unicodeIdentifier = "ಕನ್ನಡ"; // Valid in Java 9+
        // int @invalid = 5; // Invalid: '@' not allowed
        // int void = 1; // Invalid: 'void' is a keyword

        // 5. Practice: Print valid and invalid tokens
        System.out.println("--- Valid Identifiers ---");
        System.out.println("_validIdentifier, $anotherValid, valid123, unicodeIdentifier");
        System.out.println("--- Invalid Identifiers (commented out) ---");
        System.out.println("123invalid, class, my-var, @invalid, void");

        // 6. Mini-experiment: Try using a reserved word as an identifier (uncomment to see error)
        // int public = 10; // Error: 'public' is a keyword
    }

    // Example of identifier in method name
    public static int sampleMethod123() {
        return 42;
    }
}
