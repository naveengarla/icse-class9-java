package Chapter5_Operators;
// 4.2_AssignmentPracticeDemo.java
// Interactive: Practice with assignment operators

import java.util.Scanner;

class AssignmentPracticeDemo {
    public static void main(String[] args) {
        System.out.println("=== ASSIGNMENT OPERATORS PRACTICE ===");
        System.out.println("Interactive exercises with assignment operators\n");

        Scanner sc = new Scanner(System.in);

        // Exercise 1: Personal savings tracker
        System.out.println("--- EXERCISE 1: SAVINGS TRACKER ---");
        System.out.print("Enter your initial savings amount: ₹");
        double savings = sc.nextDouble();
        
        System.out.println("\nCurrent savings: ₹" + savings);
        
        System.out.print("Add weekly allowance: ₹");
        double allowance = sc.nextDouble();
        savings += allowance;
        System.out.println("After adding allowance: ₹" + savings);
        
        System.out.print("Subtract money spent on snacks: ₹");
        double spent = sc.nextDouble();
        savings -= spent;
        System.out.println("After spending on snacks: ₹" + savings);
        
        System.out.print("Bank gives 5% interest. Apply interest? (y/n): ");
        char choice = sc.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            savings *= 1.05;
            System.out.println("After 5% interest: ₹" + String.format("%.2f", savings));
        }
        System.out.println();

        // Exercise 2: Study hours calculator
        System.out.println("--- EXERCISE 2: STUDY HOURS CALCULATOR ---");
        System.out.print("Enter hours studied on Monday: ");
        int totalHours = sc.nextInt();
        System.out.println("Total hours so far: " + totalHours);
        
        System.out.print("Add Tuesday hours: ");
        int tuesdayHours = sc.nextInt();
        totalHours += tuesdayHours;
        System.out.println("After Tuesday: " + totalHours + " hours");
        
        System.out.print("Add Wednesday hours: ");
        int wednesdayHours = sc.nextInt();
        totalHours += wednesdayHours;
        System.out.println("After Wednesday: " + totalHours + " hours");
        
        // Calculate average (let's say for 3 days)
        double averageHours = totalHours / 3.0;
        System.out.println("Average hours per day: " + String.format("%.1f", averageHours));
        
        // Check if meets target
        int targetHours = 6;
        if (averageHours >= targetHours) {
            System.out.println("🎉 Great! You're meeting your " + targetHours + "-hour daily target!");
        } else {
            double shortfall = targetHours - averageHours;
            System.out.println("Need " + String.format("%.1f", shortfall) + " more hours per day to meet target.");
        }
        System.out.println();

        // Exercise 3: Shopping cart calculator
        System.out.println("--- EXERCISE 3: SHOPPING CART ---");
        double cartTotal = 0;
        System.out.println("Starting cart total: ₹" + cartTotal);
        
        System.out.print("Add price of first item: ₹");
        double item1 = sc.nextDouble();
        cartTotal += item1;
        System.out.println("Cart total: ₹" + cartTotal);
        
        System.out.print("Add price of second item: ₹");
        double item2 = sc.nextDouble();
        cartTotal += item2;
        System.out.println("Cart total: ₹" + cartTotal);
        
        System.out.print("Apply discount percentage (e.g., 10 for 10%): ");
        double discountPercent = sc.nextDouble();
        double discountMultiplier = 1 - (discountPercent / 100);
        cartTotal *= discountMultiplier;
        System.out.println("After " + discountPercent + "% discount: ₹" + String.format("%.2f", cartTotal));
        
        // Add tax
        double taxRate = 1.18;  // 18% GST
        cartTotal *= taxRate;
        System.out.println("After 18% tax: ₹" + String.format("%.2f", cartTotal));
        System.out.println();

        // Exercise 4: Number operations challenge
        System.out.println("--- EXERCISE 4: NUMBER CHALLENGE ---");
        System.out.print("Enter a starting number: ");
        int number = sc.nextInt();
        System.out.println("Starting number: " + number);
        
        number += 10;
        System.out.println("Add 10: " + number);
        
        number *= 2;
        System.out.println("Multiply by 2: " + number);
        
        number -= 5;
        System.out.println("Subtract 5: " + number);
        
        number /= 3;
        System.out.println("Divide by 3: " + number);
        
        number %= 7;
        System.out.println("Find remainder when divided by 7: " + number);
        
        System.out.println("Final result: " + number);

        sc.close();
        System.out.println("\n🎯 Excellent practice with assignment operators!");
    }
}
