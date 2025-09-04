package Chapter5_Operators;
// 7.2_OperatorMasteryFinalChallenge.java
// Challenge: The ultimate test of operator mastery - become a Java wizard!

import java.util.Scanner;

class OperatorMasteryFinalChallenge {
    public static void main(String[] args) {
        System.out.println("=== OPERATOR MASTERY: FINAL CHALLENGE ===");
        System.out.println("🎖️ Congratulations! You've reached the final test!");
        System.out.println("⚡ Time to prove you're a true Java operator wizard!\n");

        Scanner sc = new Scanner(System.in);
        int totalPoints = 0;
        int totalChallenges = 6;

        System.out.println("🏆 THE ULTIMATE OPERATOR MASTERY TEST");
        System.out.println("Complete all challenges to earn your Java Wizard Certificate!");
        System.out.println("Each challenge tests different operator mastery levels.\n");

        // Challenge 1: Speed Calculator
        System.out.println("⚡ CHALLENGE 1: LIGHTNING SPEED CALCULATOR");
        System.out.println("Create a calculator using ONLY operators (no Math library)");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result = 0;
        boolean validOperation = true;
        String operationName = "";

        // Operator mastery test
        if (operator == '+') {
            result = num1 + num2;
            operationName = "Addition";
        } else if (operator == '-') {
            result = num1 - num2;
            operationName = "Subtraction";
        } else if (operator == '*') {
            result = num1 * num2;
            operationName = "Multiplication";
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                operationName = "Division";
            } else {
                System.out.println("🚫 Division by zero detected! Nice try, but I'm smarter than that!");
                validOperation = false;
            }
        } else if (operator == '%') {
            if (num2 != 0) {
                result = num1 % num2;
                operationName = "Modulus";
            } else {
                System.out.println("🚫 Modulus by zero detected! You can't trick me!");
                validOperation = false;
            }
        } else {
            System.out.println("🚫 Invalid operator! Stick to the basics for now.");
            validOperation = false;
        }

        if (validOperation) {
            System.out.println("✅ " + operationName + " Result: " + num1 + " " + operator + " " + num2 + " = " + result);
            totalPoints += 10;
        } else {
            System.out.println("❌ Challenge 1 failed! +0 points");
        }
        System.out.println();

        // Challenge 2: Digit Manipulation Master
        System.out.println("🔢 CHALLENGE 2: DIGIT MANIPULATION MASTER");
        System.out.print("Enter a 4-digit number: ");
        int number = sc.nextInt();

        if (number >= 1000 && number <= 9999) {
            // Extract digits using only operators
            int thousands = number / 1000;
            int hundreds = (number / 100) % 10;
            int tens = (number / 10) % 10;
            int units = number % 10;

            // Perform digit magic
            int sum = thousands + hundreds + tens + units;
            int product = thousands * hundreds * tens * units;
            int reversed = units * 1000 + tens * 100 + hundreds * 10 + thousands;

            System.out.println("🎯 Digit breakdown: " + thousands + ", " + hundreds + ", " + tens + ", " + units);
            System.out.println("📊 Sum of digits: " + sum);
            System.out.println("🔥 Product of digits: " + product);
            System.out.println("🔄 Reversed number: " + reversed);

            // Bonus check: Is it divisible by sum of digits?
            if (sum != 0 && number % sum == 0) {
                System.out.println("🌟 BONUS: Your number is divisible by its digit sum! +5 extra points!");
                totalPoints += 15;
            } else {
                totalPoints += 10;
            }
        } else {
            System.out.println("❌ Must be a 4-digit number! +0 points");
        }
        System.out.println();

        // Challenge 3: Boolean Logic Master
        System.out.println("🧠 CHALLENGE 3: BOOLEAN LOGIC MASTER");
        System.out.println("Answer this complex logic puzzle:");
        System.out.println("If P = true, Q = false, R = true");
        System.out.println("What is: (P && Q) || (P && R) || (Q && R) ?");

        boolean P = true, Q = false, R = true;
        boolean correctAnswer = (P && Q) || (P && R) || (Q && R);

        System.out.print("Enter true or false: ");
        boolean userAnswer = sc.nextBoolean();

        if (userAnswer == correctAnswer) {
            System.out.println("✅ Brilliant! You're a logic wizard!");
            System.out.println("🔍 Breakdown: (false) || (true) || (false) = true");
            totalPoints += 10;
        } else {
            System.out.println("❌ Not quite! The answer is " + correctAnswer);
            System.out.println("🔍 Breakdown: (P && Q) = false, (P && R) = true, (Q && R) = false");
            System.out.println("   So: false || true || false = true");
        }
        System.out.println();

        // Challenge 4: Advanced Increment/Decrement
        System.out.println("🎯 CHALLENGE 4: INCREMENT/DECREMENT NINJA");
        System.out.println("What's the final value of x after this sequence?");
        System.out.println("int x = 5;");
        System.out.println("x = ++x + x++ - --x + x--;");

        // Let's trace this step by step
        int x = 5;
        // ++x: x becomes 6, returns 6
        // x++: returns 6, then x becomes 7
        // --x: x becomes 6, returns 6
        // x--: returns 6, then x becomes 5
        // So: 6 + 6 - 6 + 6 = 12, and final x = 5
        int complexResult = ++x + x++ - --x + x--;
        
        System.out.print("Final value of x: ");
        int userX = sc.nextInt();

        if (userX == x) {
            System.out.println("✅ Amazing! You understand increment/decrement perfectly!");
            System.out.println("🔍 The expression equals " + complexResult + ", but x ends up as " + x);
            totalPoints += 15; // Extra hard challenge!
        } else {
            System.out.println("❌ Tricky one! The final x = " + x);
            System.out.println("🔍 Trace: ++x(6) + x++(6→7) - --x(6) + x--(6→5) = 12");
        }
        System.out.println();

        // Challenge 5: Real-World Problem Solving
        System.out.println("🌍 CHALLENGE 5: REAL-WORLD PROBLEM SOLVER");
        System.out.println("A pizza costs $12. You have a 15% discount coupon.");
        System.out.println("There's also 8% tax on the final price.");
        System.out.print("How much will you pay? (round to 2 decimal places): ");

        double pizzaPrice = 12.0;
        double discountPercent = 15.0;
        double taxPercent = 8.0;

        // Calculate using operators
        double discountAmount = pizzaPrice * (discountPercent / 100.0);
        double priceAfterDiscount = pizzaPrice - discountAmount;
        double taxAmount = priceAfterDiscount * (taxPercent / 100.0);
        double finalPrice = priceAfterDiscount + taxAmount;

        // Round to 2 decimal places using operators
        double roundedPrice = (int)(finalPrice * 100 + 0.5) / 100.0;

        double userPrice = sc.nextDouble();
        double tolerance = 0.01; // Allow small rounding differences

        if (userPrice >= roundedPrice - tolerance && userPrice <= roundedPrice + tolerance) {
            System.out.println("✅ Perfect! You're ready for real-world programming!");
            System.out.println("🔍 Calculation: $12 - $1.80 (15%) = $10.20 + $0.82 (8%) = $" + roundedPrice);
            totalPoints += 15;
        } else {
            System.out.println("❌ Close! The answer is $" + roundedPrice);
            System.out.println("🔍 Steps: Discount: $12 × 0.15 = $1.80");
            System.out.println("         After discount: $12 - $1.80 = $10.20");
            System.out.println("         Tax: $10.20 × 0.08 = $0.82");
            System.out.println("         Final: $10.20 + $0.82 = $11.02");
        }
        System.out.println();

        // Challenge 6: Creative Programming
        System.out.println("🎨 CHALLENGE 6: CREATIVE PROGRAMMING MASTER");
        System.out.println("Create a simple ASCII pattern using only operators!");
        System.out.print("Enter a number (1-9) for pattern size: ");
        int patternSize = sc.nextInt();

        if (patternSize >= 1 && patternSize <= 9) {
            System.out.println("Your custom pattern:");
            
            // Create a diamond pattern using loops and operators
            for (int i = 1; i <= patternSize; i++) {
                // Spaces before stars
                for (int j = 1; j <= patternSize - i; j++) {
                    System.out.print(" ");
                }
                // Stars
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
            // Bottom half
            for (int i = patternSize - 1; i >= 1; i--) {
                // Spaces before stars
                for (int j = 1; j <= patternSize - i; j++) {
                    System.out.print(" ");
                }
                // Stars
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
            System.out.println("✅ Beautiful! You've mastered creative programming!");
            totalPoints += 10;
        } else {
            System.out.println("❌ Please enter a number between 1 and 9!");
        }
        System.out.println();

        // Final Evaluation
        System.out.println("🏆 === FINAL EVALUATION ===");
        System.out.println("Total Points Earned: " + totalPoints + " / 85");
        
        double percentage = (totalPoints / 85.0) * 100;
        System.out.println("Mastery Percentage: " + String.format("%.1f", percentage) + "%");
        System.out.println();

        // Award Certificates
        if (percentage >= 90) {
            System.out.println("🎖️ === JAVA OPERATOR GRANDMASTER ===");
            System.out.println("🌟 CONGRATULATIONS! You've achieved the highest rank!");
            System.out.println("🚀 You're ready for advanced Java programming!");
            System.out.println("💎 Your operator skills are absolutely exceptional!");
        } else if (percentage >= 75) {
            System.out.println("🥇 === JAVA OPERATOR EXPERT ===");
            System.out.println("🌟 Excellent work! You have mastered most concepts!");
            System.out.println("🎯 With a little more practice, you'll be unstoppable!");
        } else if (percentage >= 60) {
            System.out.println("🥈 === JAVA OPERATOR APPRENTICE ===");
            System.out.println("🌟 Great progress! You understand the fundamentals!");
            System.out.println("📚 Keep practicing to reach expert level!");
        } else if (percentage >= 40) {
            System.out.println("🥉 === JAVA OPERATOR STUDENT ===");
            System.out.println("🌟 Good start! You're learning the basics!");
            System.out.println("💪 Don't give up - every expert was once a beginner!");
        } else {
            System.out.println("📖 === JAVA OPERATOR BEGINNER ===");
            System.out.println("🌟 Everyone starts somewhere!");
            System.out.println("🎓 Review the concepts and try again - you've got this!");
        }

        System.out.println();
        System.out.println("🎆 === JAVA OPERATOR MASTERY COMPLETE ===");
        System.out.println("You've completed an incredible journey through:");
        System.out.println("• Arithmetic Operations & Mathematical Wizardry");
        System.out.println("• Comparison & Logical Thinking");
        System.out.println("• Assignment & Memory Management");
        System.out.println("• Increment/Decrement & Advanced Patterns");
        System.out.println("• Operator Precedence & Expression Evaluation");
        System.out.println("• Real-World Problem Solving");
        System.out.println("• Creative Programming & Pattern Creation");
        System.out.println();
        System.out.println("🌟 Remember: Operators are the building blocks of ALL programming!");
        System.out.println("🚀 Master these, and you can master any programming language!");
        System.out.println("🎯 Keep coding, keep challenging yourself, and most importantly...");
        System.out.println("🎉 HAVE FUN CREATING AMAZING PROGRAMS!");

        sc.close();
    }
}
