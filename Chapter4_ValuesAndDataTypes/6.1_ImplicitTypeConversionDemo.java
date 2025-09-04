package Chapter4_ValuesAndDataTypes;
// 6.1_ImplicitTypeConversionDemo.java
// Implicit type conversion (widening conversion)

class ImplicitTypeConversionDemo {
    public static void main(String[] args) {
        System.out.println("=== IMPLICIT TYPE CONVERSION DEMO ===");
        System.out.println("Automatic conversion from smaller to larger data types\n");

        // byte to int
        byte byteVal = 100;
        int intVal = byteVal; // Automatic conversion
        System.out.println("--- byte to int ---");
        System.out.println("byte value: " + byteVal);
        System.out.println("int value: " + intVal);
        System.out.println();

        // int to double
        int intNum = 25;
        double doubleNum = intNum; // Automatic conversion
        System.out.println("--- int to double ---");
        System.out.println("int value: " + intNum);
        System.out.println("double value: " + doubleNum);
        System.out.println();

        // char to int
        char character = 'A';
        int charCode = character; // Gets ASCII/Unicode value
        System.out.println("--- char to int ---");
        System.out.println("char value: " + character);
        System.out.println("int value (ASCII): " + charCode);
        System.out.println();

        // Conversion hierarchy
        System.out.println("--- Conversion Hierarchy ---");
        System.out.println("byte → short → int → long → float → double");
        System.out.println("char → int");
        System.out.println("Smaller types automatically convert to larger types");
    }
}
