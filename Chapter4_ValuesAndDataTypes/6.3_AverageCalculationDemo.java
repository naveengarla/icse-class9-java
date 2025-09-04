package Chapter4_ValuesAndDataTypes;
// 6.3_AverageCalculationDemo.java
// Practice: Calculating average with int vs double

import java.util.Scanner;

class AverageCalculationDemo {
    public static void main(String[] args) {
        System.out.println("=== AVERAGE CALCULATION DEMO ===");
        System.out.println("Comparing integer vs floating-point division\n");

        Scanner sc = new Scanner(System.in);

        // Get three numbers from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("\nNumbers: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Sum: " + sum);
        System.out.println();

        // Integer division (truncates decimal)
        int avgInt = sum / 3;
        System.out.println("--- Integer Division ---");
        System.out.println("Average (int): " + avgInt + " (decimal part lost)");
        System.out.println();

        // Floating-point division (preserves decimal)
        double avgDouble = sum / 3.0; // or (double)sum / 3
        System.out.println("--- Floating-Point Division ---");
        System.out.println("Average (double): " + avgDouble + " (accurate result)");
        System.out.println();

        // Demonstration with fixed numbers
        System.out.println("--- Example: 7 + 8 + 9 = 24 ---");
        int fixedSum = 7 + 8 + 9;
        System.out.println("Integer average: " + (fixedSum / 3)); // Result: 8
        System.out.println("Double average: " + (fixedSum / 3.0)); // Result: 8.0

        sc.close();
    }
}
