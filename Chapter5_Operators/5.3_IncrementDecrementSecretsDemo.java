package Chapter5_Operators;
// 5.3_IncrementDecrementSecretsDemo.java
// Amazing: Mind-blowing secrets of ++ and -- that will shock you!

import java.util.Scanner;

class IncrementDecrementSecretsDemo {
    public static void main(String[] args) {
        System.out.println("=== INCREMENT/DECREMENT SECRETS ===");
        System.out.println("🤯 Prepare to be shocked by the hidden powers of ++ and --!\n");

        Scanner sc = new Scanner(System.in);

        // Secret 1: The pre vs post increment mystery
        System.out.println("🕵️ SECRET 1: THE PRE VS POST MYSTERY");
        System.out.println("Watch this carefully - your mind will be blown!");
        System.out.println();
        
        int a = 5;
        int b = 5;
        
        System.out.println("Starting: a = " + a + ", b = " + b);
        System.out.println();
        
        int result1 = ++a + ++a;  // Pre-increment both
        System.out.println("++a + ++a:");
        System.out.println("  First ++a: a becomes " + 6 + ", uses " + 6);
        System.out.println("  Second ++a: a becomes " + 7 + ", uses " + 7);
        System.out.println("  Result: 6 + 7 = " + result1);
        System.out.println("  Final a = " + a);
        System.out.println();
        
        int result2 = b++ + b++;  // Post-increment both
        System.out.println("b++ + b++:");
        System.out.println("  First b++: uses " + 5 + ", then b becomes " + 6);
        System.out.println("  Second b++: uses " + 6 + ", then b becomes " + 7);
        System.out.println("  Result: 5 + 6 = " + result2);
        System.out.println("  Final b = " + b);
        System.out.println();
        
        System.out.println("🤯 MIND = BLOWN! Same variables, different results!");
        System.out.println("result1 = " + result1 + ", result2 = " + result2);
        System.out.println();

        // Secret 2: Chain increment madness
        System.out.println("⛓️ SECRET 2: CHAIN INCREMENT MADNESS");
        System.out.print("Enter a starting number: ");
        int start = sc.nextInt();
        
        int x = start;
        System.out.println("\n🎢 Riding the increment roller coaster:");
        System.out.println("Starting x = " + x);
        
        // Create a crazy chain of operations
        int step1 = x++;
        System.out.println("Step 1: x++ returns " + step1 + ", x is now " + x);
        
        int step2 = ++x;
        System.out.println("Step 2: ++x returns " + step2 + ", x is now " + x);
        
        int step3 = x++ + ++x;
        System.out.println("Step 3: x++ + ++x = " + step3 + ", x is now " + x);
        
        int step4 = --x + x--;
        System.out.println("Step 4: --x + x-- = " + step4 + ", x is now " + x);
        
        System.out.println("🎯 From " + start + " to " + x + " in 4 wild steps!");
        System.out.println();

        // Secret 3: Multiple variable dance
        System.out.println("💃 SECRET 3: THE VARIABLE DANCE");
        System.out.println("Watch multiple variables dance together!");
        System.out.println();
        
        int p = 1, q = 2, r = 3;
        System.out.println("Starting: p=" + p + ", q=" + q + ", r=" + r);
        
        // The dance begins
        int dance1 = p++ + q++ + r++;
        System.out.println("Dance 1: p++ + q++ + r++ = " + dance1);
        System.out.println("         Now: p=" + p + ", q=" + q + ", r=" + r);
        
        int dance2 = ++p + ++q + ++r;
        System.out.println("Dance 2: ++p + ++q + ++r = " + dance2);
        System.out.println("         Now: p=" + p + ", q=" + q + ", r=" + r);
        
        int dance3 = p-- + --q + r++;
        System.out.println("Dance 3: p-- + --q + r++ = " + dance3);
        System.out.println("         Final: p=" + p + ", q=" + q + ", r=" + r);
        System.out.println("🕺 What a dance!");
        System.out.println();

        // Secret 4: Loop counter wizardry
        System.out.println("🧙‍♂️ SECRET 4: LOOP COUNTER WIZARDRY");
        System.out.print("Enter how many magic numbers to generate: ");
        int count = sc.nextInt();
        
        System.out.println("\n✨ Generating " + count + " magic numbers:");
        
        int i = 0;
        int sum = 0;
        while (i < count) {
            int magic = ++i * i--;  // Super confusing but legal!
            sum += magic;
            System.out.println("Magic " + (i + 1) + ": ++i * i-- = " + magic);
        }
        
        System.out.println("🎩 Total magic: " + sum);
        System.out.println("💫 You just witnessed increment/decrement wizardry!");
        System.out.println();

        // Secret 5: The assignment trick
        System.out.println("🎯 SECRET 5: THE ASSIGNMENT TRICK");
        System.out.println("Did you know you can increment while assigning?");
        System.out.println();
        
        int score = 0;
        System.out.println("Starting score: " + score);
        
        // Multiple ways to add points
        score += ++score;  // Tricky!
        System.out.println("After score += ++score: " + score);
        
        score *= score--;  // Even trickier!
        System.out.println("After score *= score--: " + score);
        
        System.out.println("🤯 These operations are legal but very confusing!");
        System.out.println("💡 In real programs, keep it simple!");
        System.out.println();

        // Secret 6: Speed test challenge
        System.out.println("🏃‍♂️ SECRET 6: SPEED TEST CHALLENGE");
        System.out.println("Let's see how fast increment really is!");
        System.out.println();
        
        long startTime = System.currentTimeMillis();
        
        int speedTest = 0;
        for (int j = 0; j < 10000000; j++) {  // 10 million increments!
            speedTest++;
        }
        
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime - startTime;
        
        System.out.println("⚡ Performed 10 million increments!");
        System.out.println("Time taken: " + timeTaken + " milliseconds");
        System.out.println("Final value: " + speedTest);
        System.out.println("🚀 Increment is LIGHTNING FAST!");
        System.out.println();

        // Secret 7: The overflow surprise
        System.out.println("💥 SECRET 7: THE OVERFLOW SURPRISE");
        System.out.println("What happens when numbers get TOO BIG?");
        System.out.println();
        
        int maxInt = 2147483647;  // Maximum int value
        System.out.println("Maximum int value: " + maxInt);
        System.out.println("Adding 1 to maximum...");
        
        maxInt++;
        System.out.println("After increment: " + maxInt);
        System.out.println("🤯 It became NEGATIVE! This is called integer overflow!");
        System.out.println("💡 It's like a car odometer rolling over from 999999 to 000000");
        System.out.println();

        // Ultimate challenge: The increment puzzle
        System.out.println("🧩 ULTIMATE CHALLENGE: THE INCREMENT PUZZLE");
        System.out.println("Can you predict the final value?");
        System.out.println();
        
        int puzzle = 10;
        System.out.println("Starting puzzle = " + puzzle);
        
        puzzle = puzzle++ + ++puzzle - puzzle-- + --puzzle;
        
        System.out.println("After: puzzle = puzzle++ + ++puzzle - puzzle-- + --puzzle");
        System.out.println("Final puzzle = " + puzzle);
        System.out.println();
        System.out.println("🎓 If you understood this, you're a true programmer!");
        System.out.println("💡 Remember: In real code, keep it simple and readable!");

        sc.close();
        System.out.println("\n🌟 You've mastered the deepest secrets of ++ and --!");
        System.out.println("🚀 You're ready for advanced programming challenges!");
    }
}
