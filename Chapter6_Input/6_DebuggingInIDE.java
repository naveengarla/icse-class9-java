package Chapter6_Input;
// 6_DebuggingInIDE.java
// Demonstrates step-by-step debugging concepts in Java

class DebuggingInIDE {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int result = 0;
        // Step 1: Set breakpoint here
        try {
            result = a / b; // Step 2: Watch for exception
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
        // Step 3: Inspect variables in IDE
        System.out.println("a = " + a + ", b = " + b + ", result = " + result);
    }
}
