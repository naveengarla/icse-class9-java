package Chapter5_Operators;
// 1.1_WhatAreOperatorsDemo.java
// Introduction: Understanding what operators are and why we need them

class WhatAreOperatorsDemo {
    public static void main(String[] args) {
        System.out.println("=== WHAT ARE OPERATORS? ===");
        System.out.println("Understanding the building blocks of calculations\n");

        // Real-life analogy
        System.out.println("--- Real-Life Analogy ---");
        System.out.println("Think of operators like buttons on a calculator:");
        System.out.println("  + button → adds two numbers");
        System.out.println("  - button → subtracts two numbers");
        System.out.println("  * button → multiplies two numbers");
        System.out.println("  / button → divides two numbers");
        System.out.println();

        // What operators do in Java
        System.out.println("--- What Operators Do in Java ---");
        System.out.println("Operators are special symbols that tell Java:");
        System.out.println("  1. How to calculate with numbers");
        System.out.println("  2. How to compare values");
        System.out.println("  3. How to combine conditions");
        System.out.println("  4. How to store values in variables");
        System.out.println();

        // Simple examples
        System.out.println("--- Simple Examples ---");
        int a = 10;
        int b = 5;
        System.out.println("If a = " + a + " and b = " + b + ", then:");
        System.out.println("  a + b = " + (a + b) + " (addition operator +)");
        System.out.println("  a > b = " + (a > b) + " (comparison operator >)");
        System.out.println("  a = 15   (assignment operator =)");
        a = 15;
        System.out.println("  Now a = " + a);
        System.out.println();

        // Why operators are important
        System.out.println("--- Why Operators Are Important ---");
        System.out.println("Without operators, we couldn't:");
        System.out.println("  • Calculate student grades");
        System.out.println("  • Compare scores in games");
        System.out.println("  • Check if password is correct");
        System.out.println("  • Count items in shopping cart");
        System.out.println("  • Make decisions in programs");
    }
}
