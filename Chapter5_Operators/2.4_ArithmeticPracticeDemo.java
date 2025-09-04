package Chapter5_Operators;
// 2.4_ArithmeticPracticeDemo.java
// Interactive: Calculator practice with user input

import java.util.Scanner;

class ArithmeticPracticeDemo {
    public static void main(String[] args) {
        System.out.println("=== ARITHMETIC PRACTICE ===");
        System.out.println("Let's practice with your own numbers!\n");

        Scanner sc = new Scanner(System.in);

        // Get numbers from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println();

        // Perform all arithmetic operations
        System.out.println("=== CALCULATION RESULTS ===");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println();

        // Addition
        int sum = num1 + num2;
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);

        // Subtraction
        int difference = num1 - num2;
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);

        // Multiplication
        int product = num1 * num2;
        System.out.println("Multiplication: " + num1 + " × " + num2 + " = " + product);

        // Division (with safety check)
        if (num2 != 0) {
            int quotient = num1 / num2;
            System.out.println("Division: " + num1 + " ÷ " + num2 + " = " + quotient);
            
            // Show decimal result too
            double decimalResult = (double)num1 / num2;
            System.out.println("Decimal division: " + num1 + " ÷ " + num2 + " = " + decimalResult);
            
            // Modulus
            int remainder = num1 % num2;
            System.out.println("Remainder: " + num1 + " % " + num2 + " = " + remainder);
        } else {
            System.out.println("Division: Cannot divide by zero!");
            System.out.println("Remainder: Cannot find remainder when dividing by zero!");
        }
        System.out.println();

        // Fun facts about the results
        System.out.println("=== FUN FACTS ===");
        
        // Check if sum is even or odd
        String sumType = (sum % 2 == 0) ? "even" : "odd";
        System.out.println("• The sum " + sum + " is " + sumType);
        
        // Check if product is positive or negative
        if (product > 0) {
            System.out.println("• The product " + product + " is positive");
        } else if (product < 0) {
            System.out.println("• The product " + product + " is negative");
        } else {
            System.out.println("• The product is zero");
        }

        // Compare the numbers
        if (num1 > num2) {
            System.out.println("• " + num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println("• " + num1 + " is less than " + num2);
        } else {
            System.out.println("• Both numbers are equal!");
        }

        // Simple word problem
        System.out.println("\n=== WORD PROBLEM ===");
        System.out.println("If you had " + num1 + " marbles and your friend gave you " + num2 + " more,");
        System.out.println("you would have " + sum + " marbles in total!");
        
        if (num2 > 0 && num1 >= num2) {
            System.out.println("If you then gave away " + num2 + " marbles, you'd have " + difference + " left.");
        }

        sc.close();
        System.out.println("\n🎉 Great job practicing arithmetic operators!");
    }
}
