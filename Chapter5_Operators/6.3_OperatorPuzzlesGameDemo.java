package Chapter5_Operators;
// 6.3_OperatorPuzzlesGameDemo.java
// Challenge: Mind-bending operator puzzles and games for future programmers!

import java.util.Scanner;

class OperatorPuzzlesGameDemo {
    public static void main(String[] args) {
        System.out.println("=== OPERATOR PUZZLES GAME ===");
        System.out.println("🎮 Welcome to the Ultimate Programming Challenge!\n");

        Scanner sc = new Scanner(System.in);
        int totalScore = 0;
        int questionsAsked = 0;

        System.out.println("🏆 Can you solve these mind-bending operator puzzles?");
        System.out.println("Each correct answer = 10 points!");
        System.out.println("Let's see if you have what it takes to be a coding genius!\n");

        // Puzzle 1: Arithmetic Mystery
        System.out.println("🧩 PUZZLE 1: THE ARITHMETIC MYSTERY");
        System.out.println("Without using a calculator, solve this:");
        System.out.println("25 * 4 + 18 / 3 - 2 * 5 = ?");
        System.out.print("Your answer: ");
        int answer1 = sc.nextInt();
        questionsAsked++;
        
        int correct1 = 25 * 4 + 18 / 3 - 2 * 5; // 100 + 6 - 10 = 96
        if (answer1 == correct1) {
            System.out.println("🎉 CORRECT! You're a math wizard!");
            totalScore += 10;
        } else {
            System.out.println("❌ Not quite! The answer is " + correct1);
            System.out.println("   25 * 4 = 100, 18 / 3 = 6, 2 * 5 = 10");
            System.out.println("   So: 100 + 6 - 10 = 96");
        }
        System.out.println();

        // Puzzle 2: Modulus Magic
        System.out.println("🎩 PUZZLE 2: MODULUS MAGIC");
        System.out.println("What's the last digit of 2^10 (2 to the power of 10)?");
        System.out.println("Hint: Calculate 2^10 % 10");
        System.out.print("Your answer: ");
        int answer2 = sc.nextInt();
        questionsAsked++;
        
        int powerOfTwo = 1;
        for (int i = 0; i < 10; i++) {
            powerOfTwo *= 2;
        }
        int correct2 = powerOfTwo % 10; // Last digit of 1024 is 4
        
        if (answer2 == correct2) {
            System.out.println("🎉 AMAZING! You cracked the modulus code!");
            totalScore += 10;
        } else {
            System.out.println("❌ Close! 2^10 = " + powerOfTwo + ", so " + powerOfTwo + " % 10 = " + correct2);
        }
        System.out.println();

        // Puzzle 3: Boolean Brain Teaser
        System.out.println("🧠 PUZZLE 3: BOOLEAN BRAIN TEASER");
        System.out.println("If A = true, B = false, C = true");
        System.out.println("What is: (A && B) || (A && C) || (B && C) ?");
        System.out.print("Enter true or false: ");
        boolean answer3 = sc.nextBoolean();
        questionsAsked++;
        
        boolean A = true, B = false, C = true;
        boolean correct3 = (A && B) || (A && C) || (B && C);
        
        if (answer3 == correct3) {
            System.out.println("🎉 BRILLIANT! You're a logic master!");
            totalScore += 10;
        } else {
            System.out.println("❌ Let's break it down:");
            System.out.println("   (A && B) = (true && false) = false");
            System.out.println("   (A && C) = (true && true) = true");
            System.out.println("   (B && C) = (false && true) = false");
            System.out.println("   So: false || true || false = " + correct3);
        }
        System.out.println();

        // Puzzle 4: The Increment Riddle
        System.out.println("🎯 PUZZLE 4: THE INCREMENT RIDDLE");
        System.out.println("If x = 5, what is the value of (++x) + (x++) ?");
        System.out.print("Your answer: ");
        int answer4 = sc.nextInt();
        questionsAsked++;
        
        int x = 5;
        int correct4 = (++x) + (x++); // 6 + 6 = 12 (x becomes 8)
        
        if (answer4 == correct4) {
            System.out.println("🎉 INCREDIBLE! You understand increment perfectly!");
            totalScore += 10;
        } else {
            System.out.println("❌ Let's trace it:");
            System.out.println("   ++x: x becomes 6, returns 6");
            System.out.println("   x++: returns 6, then x becomes 7");
            System.out.println("   So: 6 + 6 = " + correct4);
        }
        System.out.println();

        // Puzzle 5: The Assignment Challenge
        System.out.println("🎲 PUZZLE 5: THE ASSIGNMENT CHALLENGE");
        System.out.println("If a = 3, what is 'a' after: a += a *= a ?");
        System.out.print("Your answer: ");
        int answer5 = sc.nextInt();
        questionsAsked++;
        
        // This is a tricky one! Let's break it down:
        // a += a *= a  is equivalent to  a = a + (a *= a)
        // First: a *= a  →  a = a * a = 3 * 3 = 9
        // Then: a += 9   →  a = a + 9 = 9 + 9 = 18
        int correct5 = 18;
        
        if (answer5 == correct5) {
            System.out.println("🎉 MIND-BLOWING! You're a true coding genius!");
            totalScore += 10;
        } else {
            System.out.println("❌ This is super tricky! Here's how:");
            System.out.println("   a += a *= a  means  a = a + (a *= a)");
            System.out.println("   First: a *= a  →  a = 3 * 3 = 9");
            System.out.println("   Then: a += 9   →  a = 9 + 9 = 18");
        }
        System.out.println();

        // Bonus Challenge: Number Pattern Recognition
        System.out.println("🌟 BONUS CHALLENGE: PATTERN MASTER");
        System.out.print("Enter a 4-digit number to analyze: ");
        int number = sc.nextInt();
        questionsAsked++;
        
        // Extract digits
        int digit1 = number / 1000;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;
        
        // Check for special patterns
        boolean isIncreasing = (digit1 < digit2) && (digit2 < digit3) && (digit3 < digit4);
        boolean isDecreasing = (digit1 > digit2) && (digit2 > digit3) && (digit3 > digit4);
        boolean isPalindrome = (digit1 == digit4) && (digit2 == digit3);
        boolean allSame = (digit1 == digit2) && (digit2 == digit3) && (digit3 == digit4);
        boolean sumDivisibleBy9 = ((digit1 + digit2 + digit3 + digit4) % 9) == 0;
        
        System.out.println("\n🔍 PATTERN ANALYSIS for " + number + ":");
        System.out.println("Digits: " + digit1 + ", " + digit2 + ", " + digit3 + ", " + digit4);
        System.out.println();
        
        int bonusPoints = 0;
        if (allSame) {
            System.out.println("🎯 All digits are the same! (+5 points)");
            bonusPoints += 5;
        }
        if (isPalindrome) {
            System.out.println("🪞 It's a palindrome! (+5 points)");
            bonusPoints += 5;
        }
        if (isIncreasing) {
            System.out.println("📈 Digits are in increasing order! (+3 points)");
            bonusPoints += 3;
        }
        if (isDecreasing) {
            System.out.println("📉 Digits are in decreasing order! (+3 points)");
            bonusPoints += 3;
        }
        if (sumDivisibleBy9) {
            System.out.println("✨ Sum of digits is divisible by 9! (+2 points)");
            bonusPoints += 2;
        }
        
        if (bonusPoints == 0) {
            System.out.println("🙂 No special patterns, but that's okay! (+1 point for trying)");
            bonusPoints = 1;
        }
        
        totalScore += bonusPoints;
        System.out.println("Bonus points earned: " + bonusPoints);
        System.out.println();

        // Final Score Calculation
        System.out.println("🏆 === FINAL RESULTS ===");
        System.out.println("Questions answered: " + questionsAsked);
        System.out.println("Total score: " + totalScore + " points");
        
        double percentage = (totalScore / 55.0) * 100; // Max possible is 55 points
        
        System.out.println("Percentage: " + String.format("%.1f", percentage) + "%");
        System.out.println();
        
        // Award titles based on performance
        if (percentage >= 90) {
            System.out.println("🏅 CODING GENIUS LEVEL!");
            System.out.println("You're ready for advanced programming!");
        } else if (percentage >= 70) {
            System.out.println("🥉 PROGRAMMING PRODIGY!");
            System.out.println("You have excellent operator skills!");
        } else if (percentage >= 50) {
            System.out.println("🎯 FUTURE PROGRAMMER!");
            System.out.println("You're on the right track!");
        } else {
            System.out.println("📚 LEARNING PROGRAMMER!");
            System.out.println("Keep practicing - you'll get there!");
        }
        
        System.out.println();
        System.out.println("💡 Programming Tips:");
        System.out.println("• Practice these puzzles daily");
        System.out.println("• Always trace through complex expressions step by step");
        System.out.println("• Understand operator precedence");
        System.out.println("• When in doubt, use parentheses!");

        sc.close();
        System.out.println("\n🚀 Keep coding and keep challenging yourself!");
        System.out.println("The world needs more problem solvers like you!");
    }
}
