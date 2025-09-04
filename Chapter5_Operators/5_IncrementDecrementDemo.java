package Chapter5_Operators;
// 5_IncrementDecrementDemo.java
// Demonstrates increment and decrement operators in Java with hands-on examples

class IncrementDecrementDemo {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Initial x = " + x);
        System.out.println("Pre-increment ++x: " + (++x)); // x becomes 6
        System.out.println("Post-increment x++: " + (x++)); // prints 6, then x becomes 7
        System.out.println("After post-increment, x = " + x);
        System.out.println("Pre-decrement --x: " + (--x)); // x becomes 6
        System.out.println("Post-decrement x--: " + (x--)); // prints 6, then x becomes 5
        System.out.println("After post-decrement, x = " + x);

        // Practice: Print sequence of numbers using increment
        System.out.println("\nSequence using increment:");
        int seq = 1;
        for (int i = 0; i < 5; i++) {
            System.out.print(seq + " ");
            seq++;
        }
        System.out.println();

        // Practice: Print sequence using decrement
        System.out.println("Sequence using decrement:");
        int dec = 5;
        for (int i = 0; i < 5; i++) {
            System.out.print(dec + " ");
            dec--;
        }
        System.out.println();

        // Boundary case: Overflow/Underflow
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("\nMax int before increment: " + max);
        max++;
        System.out.println("Max int after increment (overflow): " + max);
        System.out.println("Min int before decrement: " + min);
        min--;
        System.out.println("Min int after decrement (underflow): " + min);
    }
}
