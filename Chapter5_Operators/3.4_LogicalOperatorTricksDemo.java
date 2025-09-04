package Chapter5_Operators;
// 3.4_LogicalOperatorTricksDemo.java
// Mind-bending: Amazing tricks with logical operators that will blow your mind!

import java.util.Scanner;

class LogicalOperatorTricksDemo {
    public static void main(String[] args) {
        System.out.println("=== LOGICAL OPERATOR TRICKS ===");
        System.out.println("🧠 Prepare for mind-bending logical operator magic!\n");

        Scanner sc = new Scanner(System.in);

        // Trick 1: Short-circuit evaluation (the lazy evaluation trick!)
        System.out.println("⚡ TRICK 1: THE LAZY EVALUATION SECRET");
        System.out.println("Did you know && and || are LAZY? They don't always check everything!");
        System.out.println();
        
        int x = 5;
        int y = 0;
        
        System.out.println("x = " + x + ", y = " + y);
        System.out.println();
        
        // This is SAFE because of short-circuit evaluation
        System.out.println("Testing: (y != 0) && (x / y > 2)");
        boolean result1 = (y != 0) && (x / y > 2);  // Won't crash!
        System.out.println("Result: " + result1);
        System.out.println("🤯 Amazing! It didn't crash even though we're dividing by zero!");
        System.out.println("Why? Because && stops checking when first part is false!");
        System.out.println();
        
        // This would crash if we wrote it wrong
        System.out.println("But if we write: (x / y > 2) && (y != 0)");
        System.out.println("💥 This would CRASH because division happens first!");
        System.out.println("Order matters with &&!");
        System.out.println();

        // Trick 2: The power of De Morgan's Laws
        System.out.println("🎭 TRICK 2: DE MORGAN'S MAGIC LAWS");
        System.out.println("There are secret rules to flip logical expressions!");
        System.out.println();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Do you have a license? (true/false): ");
        boolean hasLicense = sc.nextBoolean();
        
        // Two ways to say the same thing!
        boolean cannotDrive1 = !(age >= 18 && hasLicense);
        boolean cannotDrive2 = (age < 18) || (!hasLicense);
        
        System.out.println("\n🎯 De Morgan's Law in action:");
        System.out.println("Method 1: !(age >= 18 && hasLicense) = " + cannotDrive1);
        System.out.println("Method 2: (age < 18) || (!hasLicense) = " + cannotDrive2);
        System.out.println("Both results are IDENTICAL: " + (cannotDrive1 == cannotDrive2));
        System.out.println("🧙‍♂️ Magic rule: !(A && B) = (!A) || (!B)");
        System.out.println();

        // Trick 3: Boolean arithmetic (0s and 1s)
        System.out.println("🔢 TRICK 3: BOOLEAN ARITHMETIC MAGIC");
        System.out.println("Booleans are secret numbers! true=1, false=0");
        System.out.println();
        
        boolean a = true;
        boolean b = false;
        boolean c = true;
        
        // Convert to numbers for counting
        int countTrue = 0;
        if (a) countTrue++;
        if (b) countTrue++;
        if (c) countTrue++;
        
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Number of true values: " + countTrue);
        System.out.println();
        
        // Majority vote using boolean logic
        boolean majority = (a && b) || (a && c) || (b && c);
        System.out.println("Majority vote (2 out of 3 true): " + majority);
        System.out.println("🗳️ This is how electronic voting systems work!");
        System.out.println();

        // Trick 4: XOR (exclusive OR) simulation
        System.out.println("⚡ TRICK 4: EXCLUSIVE OR (XOR) TRICK");
        System.out.println("Sometimes you want 'either A or B, but NOT both'");
        System.out.println();
        
        System.out.print("Are you hungry? (true/false): ");
        boolean hungry = sc.nextBoolean();
        System.out.print("Are you sleepy? (true/false): ");
        boolean sleepy = sc.nextBoolean();
        
        // Simulate XOR (exclusive or)
        boolean eitherHungryOrSleepy = (hungry || sleepy) && !(hungry && sleepy);
        
        System.out.println("\n🎯 XOR Logic Analysis:");
        System.out.println("Hungry: " + hungry + ", Sleepy: " + sleepy);
        System.out.println("Either hungry OR sleepy (but not both): " + eitherHungryOrSleepy);
        
        if (hungry && sleepy) {
            System.out.println("😵 You're both hungry AND sleepy - that's confusing!");
        } else if (eitherHungryOrSleepy) {
            if (hungry) {
                System.out.println("🍕 Go eat something!");
            } else {
                System.out.println("😴 Take a nap!");
            }
        } else {
            System.out.println("😊 You're perfectly fine!");
        }
        System.out.println();

        // Trick 5: Logic gate simulation
        System.out.println("🔌 TRICK 5: COMPUTER LOGIC GATES");
        System.out.println("Your computer uses these exact operations billions of times per second!");
        System.out.println();
        
        boolean input1 = true;
        boolean input2 = false;
        
        System.out.println("Input A: " + input1 + ", Input B: " + input2);
        System.out.println();
        System.out.println("Logic Gates Results:");
        System.out.println("AND Gate:  " + input1 + " && " + input2 + " = " + (input1 && input2));
        System.out.println("OR Gate:   " + input1 + " || " + input2 + " = " + (input1 || input2));
        System.out.println("NOT Gate:  !" + input1 + " = " + (!input1));
        System.out.println("NAND Gate: !(" + input1 + " && " + input2 + ") = " + !(input1 && input2));
        System.out.println("NOR Gate:  !(" + input1 + " || " + input2 + ") = " + !(input1 || input2));
        System.out.println("💻 This is the foundation of ALL computer operations!");
        System.out.println();

        // Trick 6: Truth table generator
        System.out.println("📊 TRICK 6: TRUTH TABLE GENERATOR");
        System.out.println("Let's generate a complete truth table!");
        System.out.println();
        
        System.out.println(" A  |  B  | A&&B | A||B | !A  | A!=B");
        System.out.println("----|-----|------|------|-----|-----");
        
        boolean[] values = {false, true};
        for (boolean A : values) {
            for (boolean B : values) {
                String aStr = A ? "T" : "F";
                String bStr = B ? "T" : "F";
                String andStr = (A && B) ? "T" : "F";
                String orStr = (A || B) ? "T" : "F";
                String notAStr = (!A) ? "T" : "F";
                String xorStr = (A != B) ? "T" : "F";
                
                System.out.println(" " + aStr + "  |  " + bStr + "  |  " + andStr + "   |  " + orStr + "   |  " + notAStr + "  |  " + xorStr);
            }
        }
        System.out.println();

        // Ultimate challenge: Password strength using logic
        System.out.println("🔐 ULTIMATE CHALLENGE: LOGICAL PASSWORD CHECKER");
        sc.nextLine(); // Clear buffer
        System.out.print("Enter a password to check: ");
        String password = sc.nextLine();
        
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean isLongEnough = password.length() >= 8;
        
        // Check each character
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= 'A' && ch <= 'Z') hasUpper = true;
            if (ch >= 'a' && ch <= 'z') hasLower = true;
            if (ch >= '0' && ch <= '9') hasDigit = true;
            if (ch == '!' || ch == '@' || ch == '#' || ch == '$') hasSpecial = true;
        }
        
        System.out.println("\n🔍 Password Analysis:");
        System.out.println("Has uppercase: " + hasUpper);
        System.out.println("Has lowercase: " + hasLower);
        System.out.println("Has digit: " + hasDigit);
        System.out.println("Has special (!@#$): " + hasSpecial);
        System.out.println("Is long enough (8+): " + isLongEnough);
        System.out.println();
        
        // Complex logical evaluation
        boolean isWeak = !isLongEnough || (!hasUpper && !hasDigit);
        boolean isMedium = isLongEnough && ((hasUpper || hasLower) && hasDigit) && !isWeak;
        boolean isStrong = isLongEnough && hasUpper && hasLower && hasDigit && hasSpecial;
        
        System.out.println("🎯 Password Strength:");
        if (isStrong) {
            System.out.println("💪 STRONG - Excellent password!");
        } else if (isMedium) {
            System.out.println("🔒 MEDIUM - Good but could be stronger");
        } else {
            System.out.println("⚠️ WEAK - Please improve your password");
        }

        sc.close();
        System.out.println("\n🧠 You've mastered the advanced secrets of logical operators!");
        System.out.println("💡 You now think like a computer scientist!");
    }
}
