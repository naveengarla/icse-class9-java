package Chapter4_ValuesAndDataTypes;
// 4.DataTypesDemo.java
// Hands-on exploration of primitive data types in Java
// Includes declaration, initialization, boundary cases, and a temperature converter

class DataTypesDemo {
    public static void main(String[] args) {
        // 1. Primitive data types
        byte b = 127; // Max value for byte
        short s = 32767; // Max value for short
        int i = 2147483647; // Max value for int
        long l = 9223372036854775807L; // Max value for long
        float f = 3.14f;
        double d = 3.141592653589793;
        char c = 'A';
        boolean bool = true;
        System.out.println("byte: " + b + ", short: " + s + ", int: " + i + ", long: " + l);
        System.out.println("float: " + f + ", double: " + d + ", char: " + c + ", boolean: " + bool);

        // 2. Boundary cases
        System.out.println("Byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Char range: " + (int)Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE);

        // 3. Practice: Temperature converter (Celsius ↔ Fahrenheit)
        double celsius = 37.0;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
        double fToC = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " Fahrenheit = " + fToC + " Celsius");

        // 4. Type inference (Java 10+)
        var inferredInt = 100;
        var inferredDouble = 3.14;
        System.out.println("Type inference: inferredInt = " + inferredInt + ", inferredDouble = " + inferredDouble);

        // 5. Edge cases: Overflow
        byte overflowByte = (byte) (Byte.MAX_VALUE + 1); // Wraps around
        System.out.println("Overflow byte: " + overflowByte);
    }
}
