package Chapter5_Operators;
// 3.3_ComparisonPracticeDemo.java
// Interactive: Practice with comparison and logical operators

import java.util.Scanner;

class ComparisonPracticeDemo {
    public static void main(String[] args) {
        System.out.println("=== COMPARISON PRACTICE ===");
        System.out.println("Test your understanding with real scenarios!\n");

        Scanner sc = new Scanner(System.in);

        // Age verification system
        System.out.println("--- AGE VERIFICATION SYSTEM ---");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.println("\nAge-based permissions:");
        System.out.println("Can vote (age >= 18): " + (age >= 18));
        System.out.println("Can watch PG-13 movies (age >= 13): " + (age >= 13));
        System.out.println("Needs parental supervision (age < 13): " + (age < 13));
        System.out.println("Is senior citizen (age >= 60): " + (age >= 60));
        System.out.println();

        // Grade evaluation system
        System.out.println("--- GRADE EVALUATION SYSTEM ---");
        System.out.print("Enter your test score (0-100): ");
        int score = sc.nextInt();
        
        System.out.println("\nScore analysis:");
        System.out.println("Perfect score (score == 100): " + (score == 100));
        System.out.println("Excellent (score >= 90): " + (score >= 90));
        System.out.println("Good (score >= 80): " + (score >= 80));
        System.out.println("Passing (score >= 60): " + (score >= 60));
        System.out.println("Failing (score < 60): " + (score < 60));
        System.out.println();

        // Library access system
        System.out.println("--- LIBRARY ACCESS SYSTEM ---");
        System.out.print("Do you have a library card? (true/false): ");
        boolean hasCard = sc.nextBoolean();
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();
        
        boolean canBorrowBooks = hasCard && (age >= 16);
        boolean canUseComputers = hasCard || isStudent;
        boolean needsPermission = (age < 16) && !hasCard;
        
        System.out.println("\nLibrary permissions:");
        System.out.println("Can borrow books: " + canBorrowBooks);
        System.out.println("  Formula: hasCard && (age >= 16)");
        System.out.println("  Result: " + hasCard + " && " + (age >= 16) + " = " + canBorrowBooks);
        
        System.out.println("Can use computers: " + canUseComputers);
        System.out.println("  Formula: hasCard || isStudent");
        System.out.println("  Result: " + hasCard + " || " + isStudent + " = " + canUseComputers);
        
        System.out.println("Needs permission: " + needsPermission);
        System.out.println("  Formula: (age < 16) && !hasCard");
        System.out.println("  Result: " + (age < 16) + " && " + !hasCard + " = " + needsPermission);
        System.out.println();

        // Number range checker
        System.out.println("--- NUMBER RANGE CHECKER ---");
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        boolean inRange1to10 = (number >= 1) && (number <= 10);
        boolean outsideRange = (number < 1) || (number > 10);
        boolean isEven = (number % 2) == 0;
        boolean isPositive = number > 0;
        
        System.out.println("\nNumber analysis for " + number + ":");
        System.out.println("In range 1-10: " + inRange1to10);
        System.out.println("Outside range 1-10: " + outsideRange);
        System.out.println("Is even: " + isEven);
        System.out.println("Is positive: " + isPositive);
        System.out.println("Is odd and positive: " + (!isEven && isPositive));
        System.out.println();

        // Final summary
        System.out.println("--- SUMMARY ---");
        System.out.println("You are " + age + " years old with a score of " + score);
        
        if ((age >= 18) && (score >= 80)) {
            System.out.println("🎉 You're an adult with excellent performance!");
        } else if ((age >= 13) && (score >= 60)) {
            System.out.println("👍 You're doing well for your age!");
        } else {
            System.out.println("💪 Keep working hard, you're doing great!");
        }

        sc.close();
    }
}
