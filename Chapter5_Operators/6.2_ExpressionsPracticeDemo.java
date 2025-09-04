package Chapter5_Operators;
// 6.2_ExpressionsPracticeDemo.java
// Practice: Building and evaluating complex expressions

import java.util.Scanner;

class ExpressionsPracticeDemo {
    public static void main(String[] args) {
        System.out.println("=== EXPRESSIONS PRACTICE ===");
        System.out.println("Building complex expressions step by step\n");

        Scanner sc = new Scanner(System.in);

        // Exercise 1: Grade calculator with multiple conditions
        System.out.println("--- EXERCISE 1: GRADE CALCULATOR ---");
        System.out.print("Enter marks in Math: ");
        int math = sc.nextInt();
        System.out.print("Enter marks in Science: ");
        int science = sc.nextInt();
        System.out.print("Enter marks in English: ");
        int english = sc.nextInt();
        
        // Complex expression for total and average
        int total = math + science + english;
        double average = total / 3.0;
        
        System.out.println("\nResults:");
        System.out.println("Total marks: " + total + "/300");
        System.out.println("Average: " + String.format("%.1f", average) + "%");
        
        // Complex boolean expression for grade determination
        boolean isExcellent = average >= 90;
        boolean isGood = average >= 75 && average < 90;
        boolean isAverage = average >= 60 && average < 75;
        boolean isPassing = average >= 40 && average < 60;
        boolean isFailing = average < 40;
        
        System.out.println("\nGrade Analysis:");
        if (isExcellent) {
            System.out.println("🌟 Excellent! Grade: A+ (average >= 90)");
        } else if (isGood) {
            System.out.println("👍 Good! Grade: A (75 <= average < 90)");
        } else if (isAverage) {
            System.out.println("✓ Average. Grade: B (60 <= average < 75)");
        } else if (isPassing) {
            System.out.println("⚠️ Just passing. Grade: C (40 <= average < 60)");
        } else {
            System.out.println("❌ Failing. Grade: F (average < 40)");
        }
        
        // Additional conditions
        boolean allSubjectsPass = math >= 40 && science >= 40 && english >= 40;
        boolean hasWeakSubject = math < 50 || science < 50 || english < 50;
        
        System.out.println("\nAdditional Analysis:");
        System.out.println("All subjects passed (each >= 40): " + allSubjectsPass);
        System.out.println("Has weak subject (any < 50): " + hasWeakSubject);
        System.out.println();

        // Exercise 2: Shopping discount calculator
        System.out.println("--- EXERCISE 2: SHOPPING CALCULATOR ---");
        System.out.print("Enter number of items: ");
        int items = sc.nextInt();
        System.out.print("Enter price per item: ₹");
        double pricePerItem = sc.nextDouble();
        System.out.print("Are you a premium member? (true/false): ");
        boolean isPremium = sc.nextBoolean();
        
        // Complex calculation expression
        double subtotal = items * pricePerItem;
        
        // Complex discount logic
        double bulkDiscount = (items >= 10) ? 0.15 : (items >= 5) ? 0.10 : 0.0;
        double memberDiscount = isPremium ? 0.05 : 0.0;
        double totalDiscountRate = bulkDiscount + memberDiscount;
        
        // Ensure discount doesn't exceed 25%
        if (totalDiscountRate > 0.25) {
            totalDiscountRate = 0.25;
        }
        
        double discountAmount = subtotal * totalDiscountRate;
        double finalPrice = subtotal - discountAmount;
        
        System.out.println("\nShopping Summary:");
        System.out.println("Items: " + items + " × ₹" + pricePerItem + " = ₹" + subtotal);
        System.out.println("Bulk discount (" + (bulkDiscount * 100) + "%): ₹" + String.format("%.2f", subtotal * bulkDiscount));
        System.out.println("Member discount (" + (memberDiscount * 100) + "%): ₹" + String.format("%.2f", subtotal * memberDiscount));
        System.out.println("Total discount: ₹" + String.format("%.2f", discountAmount));
        System.out.println("Final price: ₹" + String.format("%.2f", finalPrice));
        System.out.println();

        // Exercise 3: Time and age calculator
        System.out.println("--- EXERCISE 3: AGE CALCULATOR ---");
        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();
        System.out.print("Enter current year: ");
        int currentYear = sc.nextInt();
        
        // Age calculations
        int age = currentYear - birthYear;
        int ageInMonths = age * 12;
        int ageInDays = age * 365; // Approximate
        int ageInHours = ageInDays * 24;
        
        System.out.println("\nAge Analysis:");
        System.out.println("You are " + age + " years old");
        System.out.println("That's approximately:");
        System.out.println("  " + ageInMonths + " months");
        System.out.println("  " + ageInDays + " days");
        System.out.println("  " + ageInHours + " hours");
        
        // Life stage analysis
        boolean isChild = age < 13;
        boolean isTeen = age >= 13 && age < 20;
        boolean isYoungAdult = age >= 20 && age < 30;
        boolean isAdult = age >= 30 && age < 60;
        boolean isSenior = age >= 60;
        
        System.out.println("\nLife Stage:");
        if (isChild) {
            System.out.println("🧒 Child (age < 13)");
        } else if (isTeen) {
            System.out.println("🧑‍🎓 Teenager (13 <= age < 20)");
        } else if (isYoungAdult) {
            System.out.println("🧑‍💼 Young Adult (20 <= age < 30)");
        } else if (isAdult) {
            System.out.println("👨‍💼 Adult (30 <= age < 60)");
        } else if (isSenior) {
            System.out.println("👴 Senior (age >= 60)");
        }
        
        // Voting and other rights
        boolean canVote = age >= 18;
        boolean canDrive = age >= 16;
        boolean isEligibleForSeniorDiscount = age >= 60;
        
        System.out.println("\nEligibility:");
        System.out.println("Can vote: " + canVote + " (age >= 18)");
        System.out.println("Can drive: " + canDrive + " (age >= 16)");
        System.out.println("Senior discount: " + isEligibleForSeniorDiscount + " (age >= 60)");

        sc.close();
        System.out.println("\n🎯 Excellent work with complex expressions!");
    }
}
