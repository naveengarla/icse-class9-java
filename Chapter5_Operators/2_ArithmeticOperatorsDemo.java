package Chapter5_Operators;
// 2_ArithmeticOperatorsDemo.java
// Demonstrates arithmetic operators in Java with hands-on examples

import java.util.Scanner;

class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        // Basic arithmetic operations
        int a = 15, b = 4;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition: a + b = " + (a + b));
        System.out.println("Subtraction: a - b = " + (a - b));
        System.out.println("Multiplication: a * b = " + (a * b));
        System.out.println("Division: a / b = " + (a / b)); // Integer division
        System.out.println("Modulus: a % b = " + (a % b));

        // Division with double
        double x = 15, y = 4;
        System.out.println("Double Division: x / y = " + (x / y));

        // Boundary cases
        int zero = 0;
        // System.out.println("Division by zero: a / zero = " + (a / zero)); // Uncomment to see error

        // Simple calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- Simple Calculator ---");
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Quotient: " + (num1 / num2));
            System.out.println("Remainder: " + (num1 % num2));
        } else {
            System.out.println("Cannot divide by zero!");
        }
        sc.close();
    }
}
