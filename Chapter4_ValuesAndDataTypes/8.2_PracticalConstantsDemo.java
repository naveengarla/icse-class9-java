package Chapter4_ValuesAndDataTypes;
// 8.2_PracticalConstantsDemo.java
// Practice: Using constants in real-world scenarios

import java.util.Scanner;

class PracticalConstantsDemo {
    // Class-level constants (can be used by all methods)
    static final double TAX_RATE = 0.18; // 18% GST
    static final int PASSING_MARKS = 40;
    static final double DISCOUNT_THRESHOLD = 1000.0;
    static final double DISCOUNT_RATE = 0.10; // 10% discount

    public static void main(String[] args) {
        System.out.println("=== PRACTICAL CONSTANTS DEMO ===");
        System.out.println("Using constants in real-world applications\n");

        Scanner sc = new Scanner(System.in);

        // Shopping bill calculator
        System.out.println("--- Shopping Bill Calculator ---");
        System.out.print("Enter item price: ₹");
        double itemPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double subtotal = itemPrice * quantity;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        System.out.println("\n--- Bill Details ---");
        System.out.println("Item price: ₹" + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: ₹" + subtotal);
        System.out.println("Tax (" + (TAX_RATE * 100) + "%): ₹" + tax);

        // Apply discount if applicable
        if (subtotal >= DISCOUNT_THRESHOLD) {
            double discount = subtotal * DISCOUNT_RATE;
            total = subtotal + tax - discount;
            System.out.println("Discount (" + (DISCOUNT_RATE * 100) + "%): -₹" + discount);
            System.out.println("You saved ₹" + discount + "!");
        }

        System.out.println("Final total: ₹" + total);
        System.out.println();

        // Grade calculator
        System.out.println("--- Grade Calculator ---");
        System.out.print("Enter student's marks: ");
        int marks = sc.nextInt();

        System.out.println("Student marks: " + marks);
        System.out.println("Passing marks: " + PASSING_MARKS);

        if (marks >= PASSING_MARKS) {
            System.out.println("Result: PASS ✓");
            if (marks >= 90) {
                System.out.println("Grade: A+ (Excellent!)");
            } else if (marks >= 80) {
                System.out.println("Grade: A (Very Good)");
            } else if (marks >= 70) {
                System.out.println("Grade: B (Good)");
            } else if (marks >= 60) {
                System.out.println("Grade: C (Average)");
            } else {
                System.out.println("Grade: D (Below Average)");
            }
        } else {
            System.out.println("Result: FAIL ✗");
            System.out.println("Need " + (PASSING_MARKS - marks) + " more marks to pass");
        }
        System.out.println();

        // Time conversion using constants
        final int SECONDS_PER_MINUTE = 60;
        final int MINUTES_PER_HOUR = 60;
        final int HOURS_PER_DAY = 24;

        System.out.println("--- Time Conversion ---");
        System.out.print("Enter number of seconds: ");
        int totalSeconds = sc.nextInt();

        int days = totalSeconds / (HOURS_PER_DAY * MINUTES_PER_HOUR * SECONDS_PER_MINUTE);
        int remainingSeconds = totalSeconds % (HOURS_PER_DAY * MINUTES_PER_HOUR * SECONDS_PER_MINUTE);

        int hours = remainingSeconds / (MINUTES_PER_HOUR * SECONDS_PER_MINUTE);
        remainingSeconds = remainingSeconds % (MINUTES_PER_HOUR * SECONDS_PER_MINUTE);

        int minutes = remainingSeconds / SECONDS_PER_MINUTE;
        int seconds = remainingSeconds % SECONDS_PER_MINUTE;

        System.out.println(totalSeconds + " seconds = " + days + " days, " + 
                         hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

        sc.close();
    }
}
