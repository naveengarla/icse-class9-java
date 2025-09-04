package Chapter5_Operators;
// 4.1_AssignmentBasicsDemo.java
// Introduction: Basic assignment operator and its variations

class AssignmentBasicsDemo {
    public static void main(String[] args) {
        System.out.println("=== ASSIGNMENT OPERATORS ===");
        System.out.println("Storing and updating values in variables\n");

        // Basic assignment (=)
        System.out.println("--- BASIC ASSIGNMENT (=) ---");
        System.out.println("Stores a value in a variable");
        
        int score;              // Declare variable
        score = 85;             // Assign value
        System.out.println("score = 85  →  score is now " + score);
        
        score = 90;             // Reassign new value
        System.out.println("score = 90  →  score is now " + score);
        
        int newScore = score;   // Copy value to another variable
        System.out.println("newScore = score  →  newScore is now " + newScore);
        System.out.println();

        // Compound assignment operators
        System.out.println("--- COMPOUND ASSIGNMENT OPERATORS ---");
        System.out.println("Shorthand for common operations\n");
        
        // Addition assignment (+=)
        int points = 100;
        System.out.println("Starting points: " + points);
        
        points += 25;  // Same as: points = points + 25
        System.out.println("points += 25  →  points = " + points);
        System.out.println("  (This is the same as: points = points + 25)");
        System.out.println();
        
        // Subtraction assignment (-=)
        points -= 15;  // Same as: points = points - 15
        System.out.println("points -= 15  →  points = " + points);
        System.out.println("  (This is the same as: points = points - 15)");
        System.out.println();
        
        // Multiplication assignment (*=)
        int multiplier = 3;
        multiplier *= 4;  // Same as: multiplier = multiplier * 4
        System.out.println("multiplier = 3, then multiplier *= 4  →  multiplier = " + multiplier);
        System.out.println("  (This is the same as: multiplier = multiplier * 4)");
        System.out.println();
        
        // Division assignment (/=)
        int total = 80;
        total /= 4;  // Same as: total = total / 4
        System.out.println("total = 80, then total /= 4  →  total = " + total);
        System.out.println("  (This is the same as: total = total / 4)");
        System.out.println();
        
        // Modulus assignment (%=)
        int remainder = 17;
        remainder %= 5;  // Same as: remainder = remainder % 5
        System.out.println("remainder = 17, then remainder %= 5  →  remainder = " + remainder);
        System.out.println("  (This is the same as: remainder = remainder % 5)");
        System.out.println();

        // Real-world example: Bank account
        System.out.println("--- REAL-WORLD EXAMPLE: BANK ACCOUNT ---");
        double balance = 1000.0;
        System.out.println("Initial balance: ₹" + balance);
        
        balance += 500.0;  // Deposit money
        System.out.println("After deposit of ₹500: ₹" + balance);
        
        balance -= 150.0;  // Withdraw money
        System.out.println("After withdrawal of ₹150: ₹" + balance);
        
        balance *= 1.02;   // Add 2% interest
        System.out.println("After 2% interest: ₹" + balance);
        System.out.println();

        // Gaming score example
        System.out.println("--- GAMING SCORE EXAMPLE ---");
        int gameScore = 0;
        System.out.println("Starting score: " + gameScore);
        
        gameScore += 50;   // Kill enemy
        System.out.println("Killed enemy (+50): " + gameScore);
        
        gameScore += 100;  // Complete level
        System.out.println("Completed level (+100): " + gameScore);
        
        gameScore -= 25;   // Lost life
        System.out.println("Lost life (-25): " + gameScore);
        
        gameScore *= 2;    // Bonus multiplier
        System.out.println("Bonus multiplier (×2): " + gameScore);
        
        System.out.println("\n💡 Compound operators make code shorter and clearer!");
    }
}
