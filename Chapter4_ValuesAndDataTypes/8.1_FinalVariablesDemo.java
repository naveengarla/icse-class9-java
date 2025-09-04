package Chapter4_ValuesAndDataTypes;
// 8.1_FinalVariablesDemo.java
// Introduction: Understanding final keyword and constants

class FinalVariablesDemo {
    public static void main(String[] args) {
        System.out.println("=== FINAL VARIABLES DEMO ===");
        System.out.println("Understanding constants with 'final' keyword\n");

        // Regular variables (can be changed)
        int regularNumber = 10;
        System.out.println("--- Regular Variables ---");
        System.out.println("Original value: " + regularNumber);
        regularNumber = 20; // This is allowed
        System.out.println("Changed value: " + regularNumber);
        System.out.println();

        // Final variables (constants - cannot be changed)
        final int DAYS_IN_WEEK = 7;
        final double PI = 3.14159;
        final String SCHOOL_NAME = "Greenwood High";

        System.out.println("--- Final Variables (Constants) ---");
        System.out.println("DAYS_IN_WEEK: " + DAYS_IN_WEEK);
        System.out.println("PI: " + PI);
        System.out.println("SCHOOL_NAME: " + SCHOOL_NAME);
        System.out.println();

        // Attempting to change final variable (this would cause error)
        // DAYS_IN_WEEK = 8; // Error! Cannot change final variable
        // PI = 3.14; // Error! Cannot change final variable

        // Using constants in calculations
        System.out.println("--- Using Constants in Calculations ---");
        int totalHours = DAYS_IN_WEEK * 24;
        System.out.println("Hours in a week: " + DAYS_IN_WEEK + " × 24 = " + totalHours);

        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("Circle area (radius=" + radius + "): " + PI + " × " + radius + "² = " + area);
        System.out.println();

        // Mathematical constants
        System.out.println("--- Common Mathematical Constants ---");
        final double GRAVITY = 9.8; // m/s²
        final int SPEED_OF_LIGHT = 299792458; // m/s (approximately)
        final double GOLDEN_RATIO = 1.618;

        System.out.println("Gravity: " + GRAVITY + " m/s²");
        System.out.println("Speed of light: " + SPEED_OF_LIGHT + " m/s");
        System.out.println("Golden ratio: " + GOLDEN_RATIO);
        System.out.println();

        // Benefits of using constants
        System.out.println("--- Benefits of Final Variables ---");
        System.out.println("1. Prevents accidental changes");
        System.out.println("2. Makes code more readable");
        System.out.println("3. Easy to update values in one place");
        System.out.println("4. Convention: Use UPPERCASE names");
    }
}
