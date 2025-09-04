package Chapter5_Operators;
// 2.5_AmazingModulusSecretsDemo.java
// Mind-blowing: Secret powers of the modulus operator that will amaze you!

import java.util.Scanner;

class AmazingModulusSecretsDemo {
    public static void main(String[] args) {
        System.out.println("=== AMAZING MODULUS SECRETS ===");
        System.out.println("🔮 Prepare to be amazed by the secret powers of %!\n");

        Scanner sc = new Scanner(System.in);

        // Secret 1: Extracting digits like magic!
        System.out.println("🎩 SECRET 1: DIGIT EXTRACTION MAGIC");
        System.out.print("Enter any number (like 12345): ");
        int number = sc.nextInt();
        
        System.out.println("\n✨ Watch me extract digits one by one:");
        int temp = number;
        System.out.println("Original number: " + number);
        
        System.out.println("Last digit: " + number + " % 10 = " + (number % 10));
        number /= 10;
        System.out.println("Remove last digit: " + temp + " / 10 = " + number);
        
        System.out.println("Next digit: " + number + " % 10 = " + (number % 10));
        number /= 10;
        System.out.println("Remove that digit: " + number);
        
        System.out.println("🎯 Pattern: n % 10 gives LAST DIGIT, n / 10 removes it!");
        System.out.println();

        // Secret 2: Reversing numbers
        System.out.println("🔄 SECRET 2: NUMBER REVERSAL MAGIC");
        System.out.print("Enter a number to reverse (like 1234): ");
        int original = sc.nextInt();
        
        int reversed = 0;
        int working = original;
        
        System.out.println("\n🪄 Reversing " + original + " step by step:");
        while (working > 0) {
            int digit = working % 10;
            reversed = reversed * 10 + digit;
            working /= 10;
            System.out.println("  Extract " + digit + " → reversed becomes " + reversed);
        }
        
        System.out.println("🎉 Final result: " + original + " reversed is " + reversed);
        
        // Check if it's a palindrome
        if (original == reversed) {
            System.out.println("🤯 WHOA! " + original + " is a PALINDROME (reads same forwards and backwards)!");
        }
        System.out.println();

        // Secret 3: Creating cycles and patterns
        System.out.println("🎡 SECRET 3: CREATING MAGICAL CYCLES");
        System.out.print("Enter how many numbers to show in cycle: ");
        int count = sc.nextInt();
        
        System.out.println("\n🌀 Watch the pattern: numbers cycling from 0 to 4");
        for (int i = 0; i < count; i++) {
            int cycled = i % 5;  // Creates cycle: 0,1,2,3,4,0,1,2,3,4...
            System.out.println("Position " + i + " → " + i + " % 5 = " + cycled);
        }
        System.out.println("💡 This is how game levels, days of week, colors cycle!");
        System.out.println();

        // Secret 4: Password strength with modulus
        System.out.println("🔐 SECRET 4: PASSWORD STRENGTH CHECKER");
        System.out.print("Enter a number to check its 'digital strength': ");
        int password = sc.nextInt();
        
        int digitSum = 0;
        int digitCount = 0;
        int tempPass = password;
        
        while (tempPass > 0) {
            int digit = tempPass % 10;
            digitSum += digit;
            digitCount++;
            tempPass /= 10;
        }
        
        int strength = digitSum % 10;  // Final strength digit
        
        System.out.println("\n🔍 Analyzing password " + password + ":");
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Sum of all digits: " + digitSum);
        System.out.println("Strength level: " + strength + "/9");
        
        if (strength >= 7) {
            System.out.println("🛡️ SUPER STRONG password!");
        } else if (strength >= 4) {
            System.out.println("🔒 GOOD password!");
        } else {
            System.out.println("⚠️ WEAK password - try a different number!");
        }
        System.out.println();

        // Secret 5: Creating rainbow colors
        System.out.println("🌈 SECRET 5: RAINBOW COLOR GENERATOR");
        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        
        System.out.print("Enter any number to get your magic color: ");
        int colorNumber = sc.nextInt();
        
        int colorIndex = Math.abs(colorNumber) % colors.length;  // Handle negative numbers too!
        String magicColor = colors[colorIndex];
        
        System.out.println("\n🎨 Your magic color calculation:");
        System.out.println(colorNumber + " % " + colors.length + " = " + colorIndex);
        System.out.println("🌟 Your magic color is: " + magicColor + "!");
        System.out.println();

        // Secret 6: Time magic
        System.out.println("⏰ SECRET 6: TIME MACHINE");
        System.out.print("Enter hours to add to current time (like 25): ");
        int hoursToAdd = sc.nextInt();
        
        int currentHour = 10; // Let's say it's 10 AM
        int newHour = (currentHour + hoursToAdd) % 24;
        int daysLater = (currentHour + hoursToAdd) / 24;
        
        System.out.println("\n⏰ Time calculation:");
        System.out.println("Current time: " + currentHour + ":00");
        System.out.println("Adding " + hoursToAdd + " hours...");
        System.out.println("(" + currentHour + " + " + hoursToAdd + ") % 24 = " + newHour + ":00");
        
        if (daysLater > 0) {
            System.out.println("That's " + daysLater + " day(s) later!");
        }
        
        String timeOfDay;
        if (newHour < 6) timeOfDay = "Early Morning 🌅";
        else if (newHour < 12) timeOfDay = "Morning ☀️";
        else if (newHour < 17) timeOfDay = "Afternoon 🌞";
        else if (newHour < 21) timeOfDay = "Evening 🌇";
        else timeOfDay = "Night 🌙";
        
        System.out.println("New time: " + newHour + ":00 (" + timeOfDay + ")");
        System.out.println();

        // Grand finale: The ultimate modulus challenge
        System.out.println("🏆 ULTIMATE MODULUS CHALLENGE");
        System.out.print("Enter your favorite number: ");
        int favorite = sc.nextInt();
        
        System.out.println("\n🎯 Let's discover ALL the secrets of " + favorite + ":");
        System.out.println("Last digit: " + (favorite % 10));
        System.out.println("Is even: " + ((favorite % 2) == 0));
        System.out.println("Is divisible by 3: " + ((favorite % 3) == 0));
        System.out.println("Is divisible by 5: " + ((favorite % 5) == 0));
        System.out.println("Day of week (0=Sun): " + (favorite % 7));
        System.out.println("Month (1-12): " + ((favorite % 12) + 1));
        System.out.println("Dice roll (1-6): " + ((favorite % 6) + 1));
        System.out.println("Letter position (A=1): " + ((favorite % 26) + 1));

        sc.close();
        System.out.println("\n🔮 You've unlocked the secret powers of the modulus operator!");
        System.out.println("💫 Now you can create cycles, extract digits, and work magic with numbers!");
    }
}
