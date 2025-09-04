package Chapter5_Operators;
// 3.1_ComparisonBasicsDemo.java
// Introduction: Basic comparison operators

class ComparisonBasicsDemo {
    public static void main(String[] args) {
        System.out.println("=== COMPARISON OPERATORS ===");
        System.out.println("Learning to compare values in Java\n");

        // Basic numbers to compare
        int score1 = 85;
        int score2 = 92;
        int score3 = 85;

        System.out.println("Student scores:");
        System.out.println("Score 1: " + score1);
        System.out.println("Score 2: " + score2);
        System.out.println("Score 3: " + score3);
        System.out.println();

        // Equal to (==)
        System.out.println("--- EQUAL TO (==) ---");
        System.out.println("Checks if two values are exactly the same");
        System.out.println("score1 == score2: " + score1 + " == " + score2 + " → " + (score1 == score2));
        System.out.println("score1 == score3: " + score1 + " == " + score3 + " → " + (score1 == score3));
        System.out.println();

        // Not equal to (!=)
        System.out.println("--- NOT EQUAL TO (!=) ---");
        System.out.println("Checks if two values are different");
        System.out.println("score1 != score2: " + score1 + " != " + score2 + " → " + (score1 != score2));
        System.out.println("score1 != score3: " + score1 + " != " + score3 + " → " + (score1 != score3));
        System.out.println();

        // Greater than (>)
        System.out.println("--- GREATER THAN (>) ---");
        System.out.println("Checks if left value is bigger than right value");
        System.out.println("score2 > score1: " + score2 + " > " + score1 + " → " + (score2 > score1));
        System.out.println("score1 > score2: " + score1 + " > " + score2 + " → " + (score1 > score2));
        System.out.println();

        // Less than (<)
        System.out.println("--- LESS THAN (<) ---");
        System.out.println("Checks if left value is smaller than right value");
        System.out.println("score1 < score2: " + score1 + " < " + score2 + " → " + (score1 < score2));
        System.out.println("score2 < score1: " + score2 + " < " + score1 + " → " + (score2 < score1));
        System.out.println();

        // Greater than or equal to (>=)
        System.out.println("--- GREATER THAN OR EQUAL TO (>=) ---");
        System.out.println("Checks if left value is bigger than or equal to right value");
        System.out.println("score2 >= score1: " + score2 + " >= " + score1 + " → " + (score2 >= score1));
        System.out.println("score1 >= score3: " + score1 + " >= " + score3 + " → " + (score1 >= score3));
        System.out.println();

        // Less than or equal to (<=)
        System.out.println("--- LESS THAN OR EQUAL TO (<=) ---");
        System.out.println("Checks if left value is smaller than or equal to right value");
        System.out.println("score1 <= score2: " + score1 + " <= " + score2 + " → " + (score1 <= score2));
        System.out.println("score1 <= score3: " + score1 + " <= " + score3 + " → " + (score1 <= score3));
        System.out.println();

        // Practical examples
        System.out.println("--- PRACTICAL EXAMPLES ---");
        int passingMarks = 40;
        int studentMarks = 65;
        
        System.out.println("Passing marks: " + passingMarks);
        System.out.println("Student marks: " + studentMarks);
        System.out.println();
        
        System.out.println("Has student passed? " + studentMarks + " >= " + passingMarks + " → " + (studentMarks >= passingMarks));
        System.out.println("Is student below passing? " + studentMarks + " < " + passingMarks + " → " + (studentMarks < passingMarks));
        
        System.out.println("\n💡 Remember: Comparison operators always give true or false!");
    }
}
