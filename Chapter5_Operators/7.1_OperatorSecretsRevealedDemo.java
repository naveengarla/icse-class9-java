package Chapter5_Operators;
// 7.1_OperatorSecretsRevealedDemo.java
// Challenge: The hidden secrets and dark arts of Java operators!

class OperatorSecretsRevealedDemo {
    public static void main(String[] args) {
        System.out.println("=== OPERATOR SECRETS REVEALED ===");
        System.out.println("🔒 Welcome to the secret world of Java operators!");
        System.out.println("Prepare to have your mind blown with programming dark arts!\n");

        // Secret 1: The Mysterious Assignment Return Value
        System.out.println("🗝️ SECRET #1: ASSIGNMENTS HAVE RETURN VALUES!");
        System.out.println("Most people don't know that assignments return values...");
        
        int a, b, c;
        System.out.println("Code: a = b = c = 42;");
        a = b = c = 42; // This works because assignment returns the assigned value!
        System.out.println("Result: a=" + a + ", b=" + b + ", c=" + c);
        
        // Even weirder - assignments in expressions
        int x = 10;
        int y = (x = 5) + 3; // x gets 5, then 5+3=8 is assigned to y
        System.out.println("After: y = (x = 5) + 3;");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("🤯 The assignment (x = 5) returns 5, which is then added to 3!\n");

        // Secret 2: Division by Zero Behavior
        System.out.println("🗝️ SECRET #2: DIVISION BY ZERO MYSTERIES!");
        System.out.println("What happens when we divide by zero?");
        
        try {
            int result = 42 / 0;
            System.out.println("Integer division by zero: " + result);
        } catch (ArithmeticException e) {
            System.out.println("❌ Integer division by zero: " + e.getMessage());
        }
        
        // But with floating point...
        double floatResult1 = 42.0 / 0.0;
        double floatResult2 = -42.0 / 0.0;
        double floatResult3 = 0.0 / 0.0;
        
        System.out.println("🌟 Float division secrets:");
        System.out.println("42.0 / 0.0 = " + floatResult1); // Infinity
        System.out.println("-42.0 / 0.0 = " + floatResult2); // -Infinity
        System.out.println("0.0 / 0.0 = " + floatResult3); // NaN (Not a Number)
        System.out.println("🤯 Floating point division by zero doesn't crash!\n");

        // Secret 3: The Sneaky Modulus with Negatives
        System.out.println("🗝️ SECRET #3: MODULUS WITH NEGATIVE NUMBERS!");
        System.out.println("The modulus operator has hidden behavior with negatives...");
        
        System.out.println("Positive modulus:");
        System.out.println("17 % 5 = " + (17 % 5)); // 2
        System.out.println("Amazing! But what about negatives?");
        
        System.out.println("\nNegative dividend:");
        System.out.println("-17 % 5 = " + (-17 % 5)); // -2 (takes sign of dividend!)
        System.out.println("17 % -5 = " + (17 % -5)); // 2
        System.out.println("-17 % -5 = " + (-17 % -5)); // -2
        
        System.out.println("🤯 The result takes the sign of the dividend (first number)!");
        System.out.println("This is different from some other programming languages!\n");

        // Secret 4: Operator Overloading for Strings
        System.out.println("🗝️ SECRET #4: STRING OPERATOR OVERLOADING!");
        System.out.println("The + operator is magical with strings...");
        
        String magic = "Java" + "Script"; // String concatenation
        System.out.println("\"Java\" + \"Script\" = " + magic);
        
        String numberMagic = "Answer: " + 42; // Auto-converts 42 to string!
        System.out.println("\"Answer: \" + 42 = " + numberMagic);
        
        // Even weirder...
        String weird = "Result: " + 10 + 20; // Left to right: "Result: 10" + 20 = "Result: 1020"
        String normal = "Result: " + (10 + 20); // Parentheses force addition first
        System.out.println("\"Result: \" + 10 + 20 = " + weird);
        System.out.println("\"Result: \" + (10 + 20) = " + normal);
        System.out.println("🤯 Order matters when mixing strings and numbers!\n");

        // Secret 5: The Invisible Casting
        System.out.println("🗝️ SECRET #5: INVISIBLE AUTOMATIC CASTING!");
        System.out.println("Java secretly converts numbers behind the scenes...");
        
        byte smallByte = 127;
        int bigInt = 1000000;
        
        // This looks like it should fail, but Java automatically casts!
        double result = smallByte + bigInt; // byte + int → int + int → double
        System.out.println("byte(127) + int(1000000) = " + result);
        
        // Character arithmetic magic
        char letter = 'A';
        int letterValue = letter + 1; // 'A' becomes 65, then 65 + 1 = 66
        char nextLetter = (char)(letter + 1); // Cast back to char = 'B'
        
        System.out.println("'A' + 1 = " + letterValue + " (ASCII value)");
        System.out.println("(char)('A' + 1) = " + nextLetter);
        System.out.println("🤯 Characters are secretly numbers in disguise!\n");

        // Secret 6: Short-Circuit Evaluation Exploitation
        System.out.println("🗝️ SECRET #6: SHORT-CIRCUIT EVALUATION TRICKS!");
        System.out.println("You can use && and || to prevent crashes...");
        
        int[] numbers = {1, 2, 3};
        int index = 5; // This would cause an array out of bounds!
        
        // Safe array access using short-circuit evaluation
        boolean safeAccess = (index >= 0 && index < numbers.length && numbers[index] > 0);
        System.out.println("Safe array check for index " + index + ": " + safeAccess);
        System.out.println("🛡️ The && operator saved us from a crash!");
        
        // Division by zero protection
        int dividend = 100;
        int divisor = 0;
        boolean safeDivision = (divisor != 0 && dividend / divisor > 10);
        System.out.println("Safe division check: " + safeDivision);
        System.out.println("🛡️ Short-circuit evaluation prevents division by zero!\n");

        // Secret 7: The Compound Assignment Mysteries
        System.out.println("🗝️ SECRET #7: COMPOUND ASSIGNMENT CASTING!");
        System.out.println("Compound operators have hidden casting powers...");
        
        byte smallNumber = 50;
        // smallNumber = smallNumber + 50; // This would be a compile error!
        smallNumber += 50; // But this works! Java automatically casts!
        
        System.out.println("byte += 50 works, but byte = byte + 50 doesn't!");
        System.out.println("Result: " + smallNumber);
        System.out.println("🤯 Compound operators include automatic casting!\n");

        // Secret 8: The Precedence Trap
        System.out.println("🗝️ SECRET #8: THE PRECEDENCE TRAP!");
        System.out.println("Operator precedence can create mind-bending results...");
        
        int trap1 = 2 + 3 * 4; // Most people expect 20, but get 14!
        int trap2 = (2 + 3) * 4; // This gives 20
        
        System.out.println("2 + 3 * 4 = " + trap1 + " (not 20!)");
        System.out.println("(2 + 3) * 4 = " + trap2);
        
        boolean logicTrap = true || false && false; // && has higher precedence!
        boolean clearLogic = (true || false) && false;
        
        System.out.println("true || false && false = " + logicTrap + " (not false!)");
        System.out.println("(true || false) && false = " + clearLogic);
        System.out.println("🤯 When in doubt, use parentheses!\n");

        // Secret 9: The Overflow Wraparound
        System.out.println("🗝️ SECRET #9: INTEGER OVERFLOW WRAPAROUND!");
        System.out.println("What happens when numbers get too big?");
        
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Maximum int value: " + maxInt);
        System.out.println("Max + 1 = " + (maxInt + 1)); // Wraps to negative!
        System.out.println("Max + 2 = " + (maxInt + 2));
        
        // This creates infinite loops if you're not careful!
        System.out.println("🚨 Overflow can create infinite loops in badly written code!");
        System.out.println("Always check for overflow in critical applications!\n");

        // Secret 10: The Ultimate Secret
        System.out.println("🗝️ SECRET #10: THE ULTIMATE OPERATOR SECRET!");
        System.out.println("The most powerful operator combination for debugging...");
        
        int debugValue = 42;
        
        // This prints the value AND returns it for further use!
        System.out.print("Debug: " + debugValue + " ");
        int result10 = debugValue; // We can't use comma operator in Java like C++
        System.out.println("→ returned: " + result10);
        
        System.out.println("\n🎭 Java doesn't have comma operator like C++, but we can");
        System.out.println("use method chaining and creative assignments!");
        System.out.println("This trick can save hours of debugging time!\n");

        // Final Mind-Blow
        System.out.println("🎆 === FINAL MIND-BLOW ===");
        System.out.println("All these secrets show that operators are more than");
        System.out.println("simple mathematical symbols - they're the hidden");
        System.out.println("language that computers use to think!");
        System.out.println();
        System.out.println("🚀 Master these secrets and you'll be unstoppable!");
        System.out.println("Remember: Every expert was once a beginner who");
        System.out.println("learned these secret arts through curiosity and practice!");
    }
}
