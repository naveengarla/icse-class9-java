package Chapter5_Operators;
// 2.3_ModulusOperatorDemo.java
// Focus: Understanding the remainder operator (modulus)

class ModulusOperatorDemo {
    public static void main(String[] args) {
        System.out.println("=== MODULUS OPERATOR (%) ===");
        System.out.println("Finding the remainder after division\n");

        // What is modulus?
        System.out.println("--- WHAT IS MODULUS? ---");
        System.out.println("Modulus (%) gives you the REMAINDER after division");
        System.out.println("Example: 7 ÷ 3 = 2 remainder 1");
        System.out.println("So: 7 % 3 = 1");
        System.out.println();

        // Basic examples
        System.out.println("--- BASIC EXAMPLES ---");
        int num1 = 15;
        int num2 = 4;
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        
        System.out.println(num1 + " ÷ " + num2 + " = " + quotient + " remainder " + remainder);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
        System.out.println("Modulus: " + num1 + " % " + num2 + " = " + remainder);
        System.out.println();

        // Real-world example: Sharing candies
        System.out.println("--- SHARING CANDIES EXAMPLE ---");
        int totalCandies = 17;
        int children = 5;
        int candiesPerChild = totalCandies / children;
        int leftoverCandies = totalCandies % children;
        
        System.out.println("Total candies: " + totalCandies);
        System.out.println("Number of children: " + children);
        System.out.println("Each child gets: " + candiesPerChild + " candies");
        System.out.println("Leftover candies: " + leftoverCandies + " candies");
        System.out.println();

        // Checking even and odd numbers
        System.out.println("--- EVEN AND ODD NUMBERS ---");
        int[] numbers = {2, 3, 8, 11, 16, 19, 24};
        
        System.out.println("Number | Divided by 2 | Remainder | Even/Odd");
        System.out.println("-------|--------------|-----------|----------");
        
        for (int number : numbers) {
            int remainder2 = number % 2;
            String evenOdd = (remainder2 == 0) ? "Even" : "Odd";
            System.out.println("   " + number + "   |      " + (number/2) + "       |     " + remainder2 + "     |   " + evenOdd);
        }
        System.out.println();

        // Clock arithmetic (time calculation)
        System.out.println("--- TIME CALCULATION EXAMPLE ---");
        int currentHour = 10;
        int hoursToAdd = 15;
        int newHour = (currentHour + hoursToAdd) % 12; // 12-hour format
        
        System.out.println("Current time: " + currentHour + ":00");
        System.out.println("Add " + hoursToAdd + " hours");
        System.out.println("Calculation: (" + currentHour + " + " + hoursToAdd + ") % 12 = " + newHour);
        System.out.println("New time: " + newHour + ":00");
        System.out.println();

        // Pattern recognition
        System.out.println("--- USEFUL PATTERNS ---");
        System.out.println("• Any number % 2 = 0 means the number is EVEN");
        System.out.println("• Any number % 2 = 1 means the number is ODD");
        System.out.println("• Any number % 10 gives the LAST DIGIT");
        System.out.println("• Any number % 100 gives the LAST TWO DIGITS");
        
        int testNumber = 12345;
        System.out.println("\nExample with " + testNumber + ":");
        System.out.println("Last digit: " + testNumber + " % 10 = " + (testNumber % 10));
        System.out.println("Last two digits: " + testNumber + " % 100 = " + (testNumber % 100));
    }
}
