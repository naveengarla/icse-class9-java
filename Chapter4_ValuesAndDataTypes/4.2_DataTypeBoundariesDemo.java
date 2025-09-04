package Chapter4_ValuesAndDataTypes;
// 4.2_DataTypeBoundariesDemo.java
// Understanding data type boundaries and ranges

class DataTypeBoundariesDemo {
    public static void main(String[] args) {
        System.out.println("=== DATA TYPE BOUNDARIES DEMO ===");
        System.out.println("Each data type has minimum and maximum values\n");

        System.out.println("--- Integer Type Ranges ---");
        System.out.println("byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println();

        System.out.println("--- Floating-Point Type Ranges ---");
        System.out.println("float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println();

        System.out.println("--- Character Type Range ---");
        System.out.println("char range: " + (int)Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE);
        System.out.println("(Unicode values: \\u0000 to \\uFFFF)");
        System.out.println();

        // Overflow demonstration
        System.out.println("--- Overflow Example ---");
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Max byte value: " + maxByte);
        byte overflowByte = (byte)(maxByte + 1); // Wraps around to minimum
        System.out.println("Max byte + 1: " + overflowByte + " (overflow!)");
    }
}
