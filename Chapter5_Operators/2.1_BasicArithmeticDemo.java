package Chapter5_Operators;
// 2.1_BasicArithmeticDemo.java
// Introduction: Addition, subtraction, multiplication basics

class BasicArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("=== BASIC ARITHMETIC OPERATORS ===");
        System.out.println("Addition (+), Subtraction (-), Multiplication (*)\n");

        // Addition operator (+)
        System.out.println("--- ADDITION OPERATOR (+) ---");
        int apples = 5;
        int oranges = 3;
        int totalFruits = apples + oranges;
        
        System.out.println("Apples: " + apples);
        System.out.println("Oranges: " + oranges);
        System.out.println("Total fruits: " + apples + " + " + oranges + " = " + totalFruits);
        System.out.println();

        // Subtraction operator (-)
        System.out.println("--- SUBTRACTION OPERATOR (-) ---");
        int money = 100;
        int spent = 25;
        int remaining = money - spent;
        
        System.out.println("Initial money: ₹" + money);
        System.out.println("Money spent: ₹" + spent);
        System.out.println("Money remaining: ₹" + money + " - ₹" + spent + " = ₹" + remaining);
        System.out.println();

        // Multiplication operator (*)
        System.out.println("--- MULTIPLICATION OPERATOR (*) ---");
        int boxes = 4;
        int pencilsPerBox = 12;
        int totalPencils = boxes * pencilsPerBox;
        
        System.out.println("Number of boxes: " + boxes);
        System.out.println("Pencils per box: " + pencilsPerBox);
        System.out.println("Total pencils: " + boxes + " × " + pencilsPerBox + " = " + totalPencils);
        System.out.println();

        // Working with different numbers
        System.out.println("--- PRACTICE WITH DIFFERENT NUMBERS ---");
        int num1 = 15;
        int num2 = 7;
        
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplication: " + num1 + " × " + num2 + " = " + (num1 * num2));
        System.out.println();

        // Negative numbers
        System.out.println("--- WORKING WITH NEGATIVE NUMBERS ---");
        int positive = 10;
        int negative = -3;
        
        System.out.println("Positive number: " + positive);
        System.out.println("Negative number: " + negative);
        System.out.println("Addition: " + positive + " + (" + negative + ") = " + (positive + negative));
        System.out.println("Subtraction: " + positive + " - (" + negative + ") = " + (positive - negative));
        System.out.println("Multiplication: " + positive + " × (" + negative + ") = " + (positive * negative));
        
        System.out.println("\n💡 Tip: Use parentheses in calculations to make them clearer!");
    }
}
