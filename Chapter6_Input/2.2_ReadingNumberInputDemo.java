package Chapter6_Input;
// 2.2_ReadingNumberInputDemo.java
// Focus: Reading different types of numbers from users

import java.util.Scanner;

class ReadingNumberInputDemo {
    public static void main(String[] args) {
        System.out.println("=== READING NUMBER INPUT ===");
        System.out.println("Learning to read different types of numbers\n");

        Scanner sc = new Scanner(System.in);

        // Reading whole numbers (integers)
        System.out.println("--- READING WHOLE NUMBERS ---");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();
        
        System.out.print("How many books do you have? ");
        int books = sc.nextInt();
        
        System.out.println();
        System.out.println("--- WHOLE NUMBER RESULTS ---");
        System.out.println("Age: " + age + " years old");
        System.out.println("Birth year: " + birthYear);
        System.out.println("Books: " + books + " books");
        
        // Do some calculations
        int currentYear = 2025;
        int calculatedAge = currentYear - birthYear;
        System.out.println("Calculated age: " + calculatedAge + " (based on birth year)");
        System.out.println();

        // Reading decimal numbers (double)
        System.out.println("--- READING DECIMAL NUMBERS ---");
        System.out.print("Enter your height in feet (like 5.6): ");
        double height = sc.nextDouble();
        
        System.out.print("Enter your weight in kg (like 45.5): ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter your grade percentage (like 85.5): ");
        double grade = sc.nextDouble();
        
        System.out.println();
        System.out.println("--- DECIMAL NUMBER RESULTS ---");
        System.out.println("Height: " + height + " feet");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Grade: " + grade + "%");
        System.out.println();

        // Fun calculations with numbers
        System.out.println("--- FUN CALCULATIONS ---");
        
        // Height in different units
        double heightInInches = height * 12;
        double heightInCm = height * 30.48;
        System.out.println("Your height conversions:");
        System.out.println("  " + height + " feet = " + heightInInches + " inches");
        System.out.println("  " + height + " feet = " + String.format("%.1f", heightInCm) + " cm");
        System.out.println();
        
        // Grade analysis
        System.out.println("Grade analysis:");
        if (grade >= 90) {
            System.out.println("  🌟 Excellent! You're a star student!");
        } else if (grade >= 75) {
            System.out.println("  👍 Great job! Keep it up!");
        } else if (grade >= 60) {
            System.out.println("  ✓ Good work! You can do even better!");
        } else {
            System.out.println("  💪 Don't worry, keep practicing!");
        }
        System.out.println("  Points to 100%: " + (100 - grade));
        System.out.println();

        // Reading different number types
        System.out.println("--- DIFFERENT NUMBER TYPES ---");
        System.out.print("Enter a small number (0-127): ");
        byte smallNumber = sc.nextByte();
        
        System.out.print("Enter a large number: ");
        long largeNumber = sc.nextLong();
        
        System.out.println();
        System.out.println("--- NUMBER TYPE RESULTS ---");
        System.out.println("Small number (byte): " + smallNumber);
        System.out.println("Large number (long): " + largeNumber);
        System.out.println();

        // Calculator exercise
        System.out.println("--- SIMPLE CALCULATOR ---");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.println();
        System.out.println("Calculator Results:");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " × " + num2 + " = " + (num1 * num2));
        
        if (num2 != 0) {
            System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero!");
        }
        System.out.println();

        // Summary of number types
        System.out.println("--- SCANNER NUMBER METHODS ---");
        System.out.println("nextByte()   → Very small numbers (-128 to 127)");
        System.out.println("nextInt()    → Whole numbers (like age, count)");
        System.out.println("nextLong()   → Very large whole numbers");
        System.out.println("nextFloat()  → Decimal numbers (basic precision)");
        System.out.println("nextDouble() → Decimal numbers (high precision)");

        sc.close();
        System.out.println("\n🔢 Excellent! You can now read any type of number!");
    }
}
