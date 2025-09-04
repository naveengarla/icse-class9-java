package Chapter5_Operators;
// 3_RelationalLogicalOperatorsDemo.java
// Demonstrates relational and logical operators in Java with hands-on examples

import java.util.Scanner;

class RelationalLogicalOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("a = " + a + ", b = " + b);
        // Relational operators
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical operators
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Practice: Check if a number is within a range
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number to check if it is between 5 and 15: ");
        int num = sc.nextInt();
        boolean inRange = (num >= 5) && (num <= 15);
        System.out.println("Is " + num + " in range 5-15? " + inRange);

        // Boundary cases
        System.out.println("\nBoundary case: Check with min and max values");
        System.out.println("Integer.MIN_VALUE < 0: " + (Integer.MIN_VALUE < 0));
        System.out.println("Integer.MAX_VALUE > 0: " + (Integer.MAX_VALUE > 0));
        sc.close();
    }
}
