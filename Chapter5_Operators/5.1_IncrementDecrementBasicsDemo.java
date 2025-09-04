package Chapter5_Operators;
// 5.1_IncrementDecrementBasicsDemo.java
// Introduction: Understanding ++ and -- operators

class IncrementDecrementBasicsDemo {
    public static void main(String[] args) {
        System.out.println("=== INCREMENT AND DECREMENT OPERATORS ===");
        System.out.println("Quick ways to add or subtract 1\n");

        // What are increment and decrement?
        System.out.println("--- WHAT ARE THESE OPERATORS? ---");
        System.out.println("++  (increment) → adds 1 to a variable");
        System.out.println("--  (decrement) → subtracts 1 from a variable");
        System.out.println("They're shortcuts for common operations!");
        System.out.println();

        // Basic increment
        System.out.println("--- BASIC INCREMENT (++) ---");
        int counter = 5;
        System.out.println("Starting value: counter = " + counter);
        
        counter++;  // Same as: counter = counter + 1
        System.out.println("After counter++: counter = " + counter);
        System.out.println("  (This is the same as: counter = counter + 1)");
        System.out.println();

        // Basic decrement
        System.out.println("--- BASIC DECREMENT (--) ---");
        int lives = 3;
        System.out.println("Starting value: lives = " + lives);
        
        lives--;  // Same as: lives = lives - 1
        System.out.println("After lives--: lives = " + lives);
        System.out.println("  (This is the same as: lives = lives - 1)");
        System.out.println();

        // Pre-increment vs Post-increment
        System.out.println("--- PRE-INCREMENT VS POST-INCREMENT ---");
        
        int a = 10;
        System.out.println("Starting: a = " + a);
        
        // Post-increment (a++)
        System.out.println("Post-increment (a++):");
        System.out.println("  Value used in expression: " + (a++));  // Uses 10, then becomes 11
        System.out.println("  Value after increment: " + a);         // Now it's 11
        System.out.println();
        
        int b = 10;
        System.out.println("Starting fresh: b = " + b);
        
        // Pre-increment (++b)
        System.out.println("Pre-increment (++b):");
        System.out.println("  Value used in expression: " + (++b));  // Becomes 11, then uses 11
        System.out.println("  Value after increment: " + b);         // Still 11
        System.out.println();

        // Pre-decrement vs Post-decrement
        System.out.println("--- PRE-DECREMENT VS POST-DECREMENT ---");
        
        int x = 5;
        System.out.println("Starting: x = " + x);
        
        // Post-decrement (x--)
        System.out.println("Post-decrement (x--):");
        System.out.println("  Value used in expression: " + (x--));  // Uses 5, then becomes 4
        System.out.println("  Value after decrement: " + x);         // Now it's 4
        System.out.println();
        
        int y = 5;
        System.out.println("Starting fresh: y = " + y);
        
        // Pre-decrement (--y)
        System.out.println("Pre-decrement (--y):");
        System.out.println("  Value used in expression: " + (--y));  // Becomes 4, then uses 4
        System.out.println("  Value after decrement: " + y);         // Still 4
        System.out.println();

        // Real-world examples
        System.out.println("--- REAL-WORLD EXAMPLES ---");
        
        // Counting items
        int itemCount = 0;
        System.out.println("Shopping cart items: " + itemCount);
        itemCount++;  // Add item
        System.out.println("Added item: " + itemCount);
        itemCount++;  // Add another item
        System.out.println("Added another: " + itemCount);
        itemCount--;  // Remove item
        System.out.println("Removed item: " + itemCount);
        System.out.println();
        
        // Game lives
        int playerLives = 5;
        System.out.println("Player lives: " + playerLives);
        System.out.println("Player hit! Lives remaining: " + (--playerLives));
        System.out.println("Found extra life! Lives now: " + (++playerLives));
        System.out.println();

        // Loop counter preview
        System.out.println("--- USEFUL IN LOOPS ---");
        System.out.print("Counting from 1 to 5: ");
        int loopCounter = 0;
        while (loopCounter < 5) {
            loopCounter++;  // Increment first, then print
            System.out.print(loopCounter + " ");
        }
        System.out.println();
        
        System.out.println("\n💡 Remember: ++ and -- are very common in loops and counters!");
    }
}
