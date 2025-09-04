package Chapter4_ValuesAndDataTypes;
// 4.1_PrimitiveDataTypesDemo.java
// Introduction to primitive data types in Java

class PrimitiveDataTypesDemo {
    public static void main(String[] args) {
        System.out.println("=== PRIMITIVE DATA TYPES DEMO ===");
        System.out.println("Java has 8 primitive data types\n");

        // Integer types
        byte b = 127; // 8 bits: -128 to 127
        short s = 32767; // 16 bits: -32,768 to 32,767
        int i = 2147483647; // 32 bits: -2^31 to 2^31-1
        long l = 9223372036854775807L; // 64 bits: -2^63 to 2^63-1

        System.out.println("--- Integer Types ---");
        System.out.println("byte b = " + b + " (8 bits)");
        System.out.println("short s = " + s + " (16 bits)");
        System.out.println("int i = " + i + " (32 bits)");
        System.out.println("long l = " + l + "L (64 bits)");
        System.out.println();

        // Floating-point types
        float f = 3.14159f; // 32 bits: ~7 decimal digits
        double d = 3.141592653589793; // 64 bits: ~15 decimal digits

        System.out.println("--- Floating-Point Types ---");
        System.out.println("float f = " + f + "f (32 bits)");
        System.out.println("double d = " + d + " (64 bits)");
        System.out.println();

        // Character and boolean types
        char c = 'A'; // 16 bits: Unicode character
        boolean bool = true; // 1 bit: true or false

        System.out.println("--- Character and Boolean Types ---");
        System.out.println("char c = '" + c + "' (16 bits Unicode)");
        System.out.println("boolean bool = " + bool + " (1 bit)");
    }
}
