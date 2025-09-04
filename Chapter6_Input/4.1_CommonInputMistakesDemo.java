package Chapter6_Input;
// 4.1_CommonInputMistakesDemo.java
// Learning: Common input mistakes and how to avoid them

import java.util.Scanner;

class CommonInputMistakesDemo {
    public static void main(String[] args) {
        System.out.println("=== COMMON INPUT MISTAKES ===");
        System.out.println("Learning to avoid common problems with input\n");

        Scanner sc = new Scanner(System.in);

        // Mistake 1: Mixing nextInt() and nextLine()
        System.out.println("--- MISTAKE 1: MIXING NUMBERS AND TEXT ---");
        System.out.println("Problem: Using nextInt() then nextLine() can cause issues");
        System.out.println();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        // This is the problematic part - but we'll fix it!
        sc.nextLine(); // ← This line fixes the problem!
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Age: " + age + ", Name: " + name);
        System.out.println();
        System.out.println("✅ SOLUTION: Always add sc.nextLine() after reading numbers");
        System.out.println("   This 'clears the buffer' so text input works properly");
        System.out.println();

        // Mistake 2: Wrong data type
        System.out.println("--- MISTAKE 2: WRONG DATA TYPE ---");
        System.out.println("Problem: Asking for numbers but user types text");
        System.out.println();
        
        System.out.println("Let's try reading a number safely:");
        System.out.print("Enter your favorite number: ");
        
        try {
            int favoriteNumber = sc.nextInt();
            System.out.println("Great! Your favorite number is: " + favoriteNumber);
        } catch (Exception e) {
            System.out.println("❌ Oops! That's not a valid number!");
            System.out.println("💡 Make sure to type only digits (like 42, not 'forty-two')");
            sc.nextLine(); // Clear the invalid input
        }
        System.out.println();

        // Mistake 3: Case sensitivity
        System.out.println("--- MISTAKE 3: CASE SENSITIVITY ---");
        System.out.println("Problem: 'Yes', 'YES', 'yes' are all different to the computer");
        System.out.println();
        
        sc.nextLine(); // Clear buffer
        System.out.print("Do you like ice cream? (yes/no): ");
        String answer = sc.nextLine();
        
        // Wrong way (case sensitive)
        System.out.println("Wrong way to check:");
        if (answer.equals("yes")) {
            System.out.println("  This only works if you type exactly 'yes'");
        } else {
            System.out.println("  This doesn't work for 'Yes', 'YES', or 'Y'");
        }
        
        // Right way (case insensitive)
        System.out.println("Right way to check:");
        String lowerAnswer = answer.toLowerCase();
        if (lowerAnswer.equals("yes") || lowerAnswer.equals("y")) {
            System.out.println("  ✅ This works for any variation!");
        } else {
            System.out.println("  This handles 'No', 'NO', 'n', etc.");
        }
        System.out.println();

        // Mistake 4: Not checking for valid ranges
        System.out.println("--- MISTAKE 4: NOT CHECKING VALID RANGES ---");
        System.out.println("Problem: Not checking if numbers make sense");
        System.out.println();
        
        System.out.print("Enter your grade percentage (0-100): ");
        double grade = sc.nextDouble();
        
        if (grade < 0 || grade > 100) {
            System.out.println("❌ Invalid grade! Grades should be between 0 and 100");
            System.out.println("💡 Always check if numbers are in the expected range");
        } else {
            System.out.println("✅ Valid grade: " + grade + "%");
        }
        System.out.println();

        // Mistake 5: Forgetting to close Scanner
        System.out.println("--- MISTAKE 5: FORGETTING TO CLOSE SCANNER ---");
        System.out.println("Problem: Not closing Scanner when done");
        System.out.println("Solution: Always add sc.close() at the end");
        System.out.println();

        // Best practices summary
        System.out.println("--- BEST PRACTICES SUMMARY ---");
        System.out.println("✅ DO:");
        System.out.println("   • Use sc.nextLine() after nextInt(), nextDouble(), etc.");
        System.out.println("   • Use .toLowerCase() for text comparisons");
        System.out.println("   • Check if numbers are in valid ranges");
        System.out.println("   • Always close Scanner with sc.close()");
        System.out.println("   • Give clear instructions to users");
        System.out.println();
        
        System.out.println("❌ DON'T:");
        System.out.println("   • Mix number and text input without clearing buffer");
        System.out.println("   • Assume users will type exactly what you expect");
        System.out.println("   • Forget to handle invalid input");
        System.out.println("   • Use case-sensitive comparisons for yes/no questions");
        System.out.println();

        // Example of good input handling
        System.out.println("--- EXAMPLE OF GOOD INPUT HANDLING ---");
        sc.nextLine(); // Clear buffer
        
        System.out.print("What's your favorite day of the week? ");
        String day = sc.nextLine().toLowerCase().trim();
        
        // Handle multiple possible answers
        if (day.equals("monday") || day.equals("mon")) {
            System.out.println("Monday - Start of a new week! 💪");
        } else if (day.equals("friday") || day.equals("fri")) {
            System.out.println("Friday - Almost weekend! 🎉");
        } else if (day.equals("saturday") || day.equals("sat") || 
                   day.equals("sunday") || day.equals("sun")) {
            System.out.println("Weekend - Time to relax! 😎");
        } else {
            System.out.println("'" + day + "' is a great choice! 😊");
        }

        sc.close();
        System.out.println("\n🛡️ Now you know how to handle input safely and correctly!");
    }
}
