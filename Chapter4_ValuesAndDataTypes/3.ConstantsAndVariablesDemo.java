package Chapter4_ValuesAndDataTypes;
// 3.ConstantsAndVariablesDemo.java
// Hands-on exploration of constants and variables in Java
// Includes declaration, initialization, swapping, boundary cases, and use of final

class ConstantsAndVariablesDemo {
    public static void main(String[] args) {
        // 1. Declaring and initializing variables
        int a = 10;
        int b = 20;
        double pi = 3.14159;
        boolean isJavaFun = true;
        System.out.println("a = " + a + ", b = " + b + ", pi = " + pi + ", isJavaFun = " + isJavaFun);

        // 2. Using constants (final keyword)
        final int MAX_STUDENTS = 50;
        final double GRAVITY = 9.8;
        System.out.println("MAX_STUDENTS = " + MAX_STUDENTS + ", GRAVITY = " + GRAVITY);
        // MAX_STUDENTS = 60; // Uncomment to see error: cannot assign a value to final variable

        // 3. Practice: Swap two numbers using variables
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);

        // 4. Boundary cases
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("Integer range: " + minInt + " to " + maxInt);
        System.out.println("Double range: " + minDouble + " to " + maxDouble);

        // 5. Variable naming rules and scope
        int _underscore = 1;
        int $dollar = 2;
        // int 2start = 3; // Invalid: cannot start with digit
        // int final = 4; // Invalid: 'final' is a keyword
        {
            int scopedVar = 100; // Scoped to this block
            System.out.println("scopedVar inside block: " + scopedVar);
        }
        // System.out.println(scopedVar); // Error: scopedVar not visible here

        // 6. Constant expressions
        final int AREA = 5 * 10;
        System.out.println("Constant AREA = " + AREA);
    }
}
