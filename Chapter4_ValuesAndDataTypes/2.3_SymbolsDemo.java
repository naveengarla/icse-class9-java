package Chapter4_ValuesAndDataTypes;
// 2.3_SymbolsDemo.java
// Java symbols (operators, punctuation marks)

class SymbolsDemo {
    public static void main(String[] args) {
        System.out.println("=== JAVA SYMBOLS DEMO ===");
        System.out.println("Symbols are operators and punctuation marks in Java\n");

        // Arithmetic symbols
        int a = 10, b = 3;
        System.out.println("--- Arithmetic Symbols ---");
        System.out.println("a + b = " + (a + b) + " (+ is addition symbol)");
        System.out.println("a - b = " + (a - b) + " (- is subtraction symbol)");
        System.out.println("a * b = " + (a * b) + " (* is multiplication symbol)");
        System.out.println("a / b = " + (a / b) + " (/ is division symbol)");
        System.out.println("a % b = " + (a % b) + " (% is modulus symbol)");
        System.out.println();

        // Punctuation symbols
        System.out.println("--- Punctuation Symbols ---");
        int[] arr = {1, 2, 3}; // { } [ ] are symbols
        System.out.println("Array: {1, 2, 3} using { } [ ] symbols");
        System.out.println("Parentheses ( ) for method calls: System.out.println()");
        System.out.println("Semicolon ; ends statements");
        System.out.println("Comma , separates elements");
        System.out.println("Double quotes \" \" for strings: \"Hello\"");
        System.out.println("Single quotes ' ' for chars: 'A'");
    }
}
