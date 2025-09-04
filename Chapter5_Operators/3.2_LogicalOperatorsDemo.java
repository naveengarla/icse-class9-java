package Chapter5_Operators;
// 3.2_LogicalOperatorsDemo.java
// Focus: AND, OR, NOT operators for combining conditions

class LogicalOperatorsDemo {
    public static void main(String[] args) {
        System.out.println("=== LOGICAL OPERATORS ===");
        System.out.println("Combining multiple conditions\n");

        // Sample data for examples
        int age = 16;
        boolean hasLicense = false;
        int score = 75;
        boolean isPassing = score >= 60;
        
        System.out.println("Sample data:");
        System.out.println("Age: " + age);
        System.out.println("Has License: " + hasLicense);
        System.out.println("Score: " + score);
        System.out.println("Is Passing: " + isPassing);
        System.out.println();

        // AND operator (&&)
        System.out.println("--- AND OPERATOR (&&) ---");
        System.out.println("Both conditions must be TRUE for result to be TRUE");
        System.out.println();
        
        boolean canDrive = (age >= 18) && hasLicense;
        System.out.println("Can drive a car?");
        System.out.println("  (age >= 18) = " + (age >= 18));
        System.out.println("  hasLicense = " + hasLicense);
        System.out.println("  Result: " + (age >= 18) + " && " + hasLicense + " = " + canDrive);
        System.out.println("  Answer: " + (canDrive ? "Yes, can drive" : "No, cannot drive"));
        System.out.println();

        boolean canWatchMovie = (age >= 13) && isPassing;
        System.out.println("Can watch PG-13 movie as reward?");
        System.out.println("  (age >= 13) = " + (age >= 13));
        System.out.println("  isPassing = " + isPassing);
        System.out.println("  Result: " + (age >= 13) + " && " + isPassing + " = " + canWatchMovie);
        System.out.println("  Answer: " + (canWatchMovie ? "Yes, enjoy the movie!" : "No movie this time"));
        System.out.println();

        // OR operator (||)
        System.out.println("--- OR OPERATOR (||) ---");
        System.out.println("At least ONE condition must be TRUE for result to be TRUE");
        System.out.println();
        
        boolean isEligible = (score >= 80) || (age >= 18);
        System.out.println("Eligible for advanced class?");
        System.out.println("  (score >= 80) = " + (score >= 80));
        System.out.println("  (age >= 18) = " + (age >= 18));
        System.out.println("  Result: " + (score >= 80) + " || " + (age >= 18) + " = " + isEligible);
        System.out.println("  Answer: " + (isEligible ? "Yes, eligible" : "Not eligible"));
        System.out.println();

        boolean needsHelp = (score < 50) || (age < 14);
        System.out.println("Needs extra help?");
        System.out.println("  (score < 50) = " + (score < 50));
        System.out.println("  (age < 14) = " + (age < 14));
        System.out.println("  Result: " + (score < 50) + " || " + (age < 14) + " = " + needsHelp);
        System.out.println("  Answer: " + (needsHelp ? "Yes, needs help" : "No extra help needed"));
        System.out.println();

        // NOT operator (!)
        System.out.println("--- NOT OPERATOR (!) ---");
        System.out.println("Flips TRUE to FALSE and FALSE to TRUE");
        System.out.println();
        
        System.out.println("Original values:");
        System.out.println("  hasLicense = " + hasLicense);
        System.out.println("  isPassing = " + isPassing);
        System.out.println();
        
        System.out.println("After applying NOT operator:");
        System.out.println("  !hasLicense = " + !hasLicense);
        System.out.println("  !isPassing = " + !isPassing);
        System.out.println();

        boolean isFailing = !isPassing;
        System.out.println("Is student failing?");
        System.out.println("  isFailing = !isPassing = !" + isPassing + " = " + isFailing);
        System.out.println();

        // Truth table examples
        System.out.println("--- TRUTH TABLES ---");
        System.out.println("AND (&&) Operator:");
        System.out.println("true  && true  = " + (true && true));
        System.out.println("true  && false = " + (true && false));
        System.out.println("false && true  = " + (false && true));
        System.out.println("false && false = " + (false && false));
        System.out.println();
        
        System.out.println("OR (||) Operator:");
        System.out.println("true  || true  = " + (true || true));
        System.out.println("true  || false = " + (true || false));
        System.out.println("false || true  = " + (false || true));
        System.out.println("false || false = " + (false || false));
        System.out.println();
        
        System.out.println("NOT (!) Operator:");
        System.out.println("!true  = " + !true);
        System.out.println("!false = " + !false);
    }
}
