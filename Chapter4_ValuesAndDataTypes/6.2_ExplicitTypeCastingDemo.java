package Chapter4_ValuesAndDataTypes;
// 6.2_ExplicitTypeCastingDemo.java
// Explicit type casting (narrowing conversion)

class ExplicitTypeCastingDemo {
    public static void main(String[] args) {
        System.out.println("=== EXPLICIT TYPE CASTING DEMO ===");
        System.out.println("Manual conversion from larger to smaller data types\n");

        // double to int (loses decimal part)
        double pi = 3.14159;
        int intPi = (int) pi; // Explicit casting required
        System.out.println("--- double to int ---");
        System.out.println("double value: " + pi);
        System.out.println("int value (cast): " + intPi + " (decimal part lost)");
        System.out.println();

        // int to byte (possible data loss)
        int largeInt = 300;
        byte smallByte = (byte) largeInt; // Explicit casting required
        System.out.println("--- int to byte (overflow) ---");
        System.out.println("int value: " + largeInt);
        System.out.println("byte value (cast): " + smallByte + " (overflow occurred)");
        System.out.println();

        // int to char
        int asciiValue = 65;
        char character = (char) asciiValue;
        System.out.println("--- int to char ---");
        System.out.println("int value: " + asciiValue);
        System.out.println("char value: " + character);
        System.out.println();

        // Safe casting
        System.out.println("--- Safe Casting Example ---");
        double smallDouble = 25.0;
        int safeInt = (int) smallDouble;
        System.out.println("double value: " + smallDouble);
        System.out.println("int value (safe cast): " + safeInt);
    }
}
