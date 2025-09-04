package Chapter5_Operators;
// 4_AssignmentOperatorsDemo.java
// Demonstrates assignment and shorthand operators in Java with hands-on examples

class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Initial a = " + a);
        a += 5;
        System.out.println("a += 5 -> a = " + a);
        a -= 3;
        System.out.println("a -= 3 -> a = " + a);
        a *= 2;
        System.out.println("a *= 2 -> a = " + a);
        a /= 4;
        System.out.println("a /= 4 -> a = " + a);
        a %= 3;
        System.out.println("a %= 3 -> a = " + a);

        // Compound Interest formula using assignment operators
        double principal = 1000.0;
        double rate = 0.05;
        int years = 3;
        System.out.println("\nCompound Interest Calculation:");
        System.out.println("Principal = " + principal + ", Rate = " + rate + ", Years = " + years);
        for (int i = 1; i <= years; i++) {
            principal *= (1 + rate);
            System.out.println("Year " + i + ": " + principal);
        }

        // Boundary case: Assigning max/min values
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("\nMax int: " + max);
        System.out.println("Min int: " + min);
        max += 1; // Overflow
        min -= 1; // Underflow
        System.out.println("After overflow: max = " + max);
        System.out.println("After underflow: min = " + min);
    }
}
