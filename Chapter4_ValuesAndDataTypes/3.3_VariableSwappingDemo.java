package Chapter4_ValuesAndDataTypes;
// 3.3_VariableSwappingDemo.java
// Practice: Swap two numbers using variables

class VariableSwappingDemo {
    public static void main(String[] args) {
        System.out.println("=== VARIABLE SWAPPING DEMO ===");
        System.out.println("Learning to swap values between variables\n");

        // Method 1: Using a temporary variable
        int a = 10, b = 20;
        System.out.println("--- Method 1: Using Temporary Variable ---");
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        int temp = a;  // Store a in temp
        a = b;         // Copy b to a
        b = temp;      // Copy temp (original a) to b
        
        System.out.println("After swap: a = " + a + ", b = " + b);
        System.out.println();

        // Method 2: Without temporary variable (arithmetic)
        int x = 15, y = 25;
        System.out.println("--- Method 2: Without Temporary Variable ---");
        System.out.println("Before swap: x = " + x + ", y = " + y);
        
        x = x + y;     // x now contains sum
        y = x - y;     // y now contains original x
        x = x - y;     // x now contains original y
        
        System.out.println("After swap: x = " + x + ", y = " + y);
        System.out.println();

        // Practice with different data types
        String first = "Hello", second = "World";
        System.out.println("--- Swapping Strings ---");
        System.out.println("Before swap: first = \"" + first + "\", second = \"" + second + "\"");
        
        String tempStr = first;
        first = second;
        second = tempStr;
        
        System.out.println("After swap: first = \"" + first + "\", second = \"" + second + "\"");
    }
}
