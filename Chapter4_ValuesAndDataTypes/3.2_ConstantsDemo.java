package Chapter4_ValuesAndDataTypes;
// 3.2_ConstantsDemo.java
// Using constants with final keyword

class ConstantsDemo {
    public static void main(String[] args) {
        System.out.println("=== CONSTANTS DEMO ===");
        System.out.println("Constants are variables that cannot be changed\n");

        // Declaring constants with final keyword
        final int MAX_STUDENTS = 50;
        final double GRAVITY = 9.8;
        final String SCHOOL_NAME = "ABC High School";
        final boolean IS_WEEKEND = false;

        System.out.println("--- Constant Values ---");
        System.out.println("Maximum students: " + MAX_STUDENTS);
        System.out.println("Gravity: " + GRAVITY + " m/s²");
        System.out.println("School name: " + SCHOOL_NAME);
        System.out.println("Is weekend: " + IS_WEEKEND);
        System.out.println();

        // Constant expressions
        final int AREA = 5 * 10;
        final double CIRCLE_AREA = 3.14159 * 5 * 5;
        
        System.out.println("--- Constant Expressions ---");
        System.out.println("Rectangle area (5×10): " + AREA);
        System.out.println("Circle area (r=5): " + CIRCLE_AREA);
        System.out.println();

        System.out.println("--- Rules for Constants ---");
        System.out.println("1. Use 'final' keyword");
        System.out.println("2. Cannot be reassigned once initialized");
        System.out.println("3. Convention: Use UPPER_CASE names");
        System.out.println("// MAX_STUDENTS = 60; // This would cause error!");
    }
}
