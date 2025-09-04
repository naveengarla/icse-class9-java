package Chapter5_Operators;
// 6.1_OperatorPrecedenceDemo.java
// Understanding: Order of operations in Java

class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        System.out.println("=== OPERATOR PRECEDENCE ===");
        System.out.println("Understanding the order of operations in Java\n");

        // Basic arithmetic precedence (PEMDAS/BODMAS)
        System.out.println("--- ARITHMETIC PRECEDENCE ---");
        System.out.println("Just like in math: Parentheses → Multiplication/Division → Addition/Subtraction");
        System.out.println();

        int result1 = 2 + 3 * 4;
        System.out.println("2 + 3 * 4 = " + result1);
        System.out.println("  Step 1: 3 * 4 = 12 (multiplication first)");
        System.out.println("  Step 2: 2 + 12 = 14 (then addition)");
        System.out.println();

        int result2 = (2 + 3) * 4;
        System.out.println("(2 + 3) * 4 = " + result2);
        System.out.println("  Step 1: (2 + 3) = 5 (parentheses first)");
        System.out.println("  Step 2: 5 * 4 = 20 (then multiplication)");
        System.out.println();

        int result3 = 20 / 4 + 2 * 3;
        System.out.println("20 / 4 + 2 * 3 = " + result3);
        System.out.println("  Step 1: 20 / 4 = 5 (division)");
        System.out.println("  Step 2: 2 * 3 = 6 (multiplication)");
        System.out.println("  Step 3: 5 + 6 = 11 (addition)");
        System.out.println();

        // Comparison and arithmetic combined
        System.out.println("--- COMPARISON WITH ARITHMETIC ---");
        System.out.println("Arithmetic happens before comparison");
        System.out.println();

        int a = 5, b = 3, c = 2;
        boolean result4 = a + b > c * 4;
        System.out.println("a=5, b=3, c=2");
        System.out.println("a + b > c * 4  →  " + result4);
        System.out.println("  Step 1: a + b = 5 + 3 = 8");
        System.out.println("  Step 2: c * 4 = 2 * 4 = 8");
        System.out.println("  Step 3: 8 > 8 = false");
        System.out.println();

        boolean result5 = a * b >= c + 10;
        System.out.println("a * b >= c + 10  →  " + result5);
        System.out.println("  Step 1: a * b = 5 * 3 = 15");
        System.out.println("  Step 2: c + 10 = 2 + 10 = 12");
        System.out.println("  Step 3: 15 >= 12 = true");
        System.out.println();

        // Logical operators with comparisons
        System.out.println("--- LOGICAL WITH COMPARISONS ---");
        System.out.println("Comparisons happen before logical operations");
        System.out.println();

        boolean result6 = a > 3 && b < 5;
        System.out.println("a=5, b=3");
        System.out.println("a > 3 && b < 5  →  " + result6);
        System.out.println("  Step 1: a > 3 = 5 > 3 = true");
        System.out.println("  Step 2: b < 5 = 3 < 5 = true");
        System.out.println("  Step 3: true && true = true");
        System.out.println();

        boolean result7 = a + b > 7 || c * 3 < 5;
        System.out.println("a + b > 7 || c * 3 < 5  →  " + result7);
        System.out.println("  Step 1: a + b = 5 + 3 = 8");
        System.out.println("  Step 2: 8 > 7 = true");
        System.out.println("  Step 3: c * 3 = 2 * 3 = 6");
        System.out.println("  Step 4: 6 < 5 = false");
        System.out.println("  Step 5: true || false = true");
        System.out.println();

        // Assignment has lowest precedence
        System.out.println("--- ASSIGNMENT PRECEDENCE ---");
        System.out.println("Assignment happens last (lowest precedence)");
        System.out.println();

        int x;
        x = 2 + 3 * 4;  // Calculates 2 + 12 = 14, then assigns to x
        System.out.println("x = 2 + 3 * 4");
        System.out.println("  Step 1: 3 * 4 = 12");
        System.out.println("  Step 2: 2 + 12 = 14");
        System.out.println("  Step 3: x = 14");
        System.out.println("  Result: x = " + x);
        System.out.println();

        // Complex expression
        System.out.println("--- COMPLEX EXPRESSION ---");
        int p = 2, q = 3, r = 4;
        boolean complexResult = p + q * r > 10 && r - p < q;
        
        System.out.println("p=2, q=3, r=4");
        System.out.println("p + q * r > 10 && r - p < q  →  " + complexResult);
        System.out.println("Breaking it down:");
        System.out.println("  Step 1: q * r = 3 * 4 = 12");
        System.out.println("  Step 2: p + 12 = 2 + 12 = 14");
        System.out.println("  Step 3: 14 > 10 = true");
        System.out.println("  Step 4: r - p = 4 - 2 = 2");
        System.out.println("  Step 5: 2 < 3 = true");
        System.out.println("  Step 6: true && true = true");
        System.out.println();

        // Best practice
        System.out.println("--- BEST PRACTICE ---");
        System.out.println("When in doubt, use parentheses to make your intention clear!");
        System.out.println();
        
        // Confusing without parentheses
        int confusing = 2 + 3 * 4 - 1;
        System.out.println("Confusing: 2 + 3 * 4 - 1 = " + confusing);
        
        // Clear with parentheses
        int clear = ((2 + 3) * 4) - 1;
        System.out.println("Clear: ((2 + 3) * 4) - 1 = " + clear);
        
        System.out.println("\n💡 Use parentheses to make complex expressions readable!");
    }
}
