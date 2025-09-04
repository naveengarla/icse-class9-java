package Chapter6_Input;
// 1.2_ScannerIntroductionDemo.java
// Introduction: What is Scanner and how to set it up

import java.util.Scanner;

class ScannerIntroductionDemo {
    public static void main(String[] args) {
        System.out.println("=== INTRODUCING SCANNER ===");
        System.out.println("Your tool for getting input from users\n");

        // What is Scanner?
        System.out.println("--- WHAT IS SCANNER? ---");
        System.out.println("Scanner is like a 'listener' that waits for you to type something");
        System.out.println("Think of it as a helpful assistant that asks questions and remembers your answers");
        System.out.println();

        // How to create Scanner
        System.out.println("--- HOW TO CREATE SCANNER ---");
        System.out.println("Step 1: Import Scanner");
        System.out.println("  import java.util.Scanner;  (at the top of your file)");
        System.out.println();
        System.out.println("Step 2: Create Scanner object");
        System.out.println("  Scanner sc = new Scanner(System.in);");
        System.out.println("  Think: 'sc' is your assistant's name");
        System.out.println();
        System.out.println("Step 3: Use Scanner to get input");
        System.out.println("  String name = sc.nextLine();  (for text)");
        System.out.println("  int age = sc.nextInt();       (for numbers)");
        System.out.println();

        // Let's try it!
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- LET'S TRY IT! ---");
        System.out.print("What's your first name? ");
        String firstName = sc.nextLine();
        
        System.out.print("What's your favorite number? ");
        int favoriteNumber = sc.nextInt();
        
        // Show what we got
        System.out.println();
        System.out.println("--- WHAT I LEARNED ABOUT YOU ---");
        System.out.println("Your name is: " + firstName);
        System.out.println("Your favorite number is: " + favoriteNumber);
        System.out.println();

        // Fun with the input
        System.out.println("--- FUN FACTS ---");
        System.out.println("Your name has " + firstName.length() + " letters!");
        System.out.println("Your favorite number doubled is: " + (favoriteNumber * 2));
        System.out.println("Your favorite number plus 10 is: " + (favoriteNumber + 10));
        System.out.println();

        // Common Scanner methods
        System.out.println("--- SCANNER METHODS YOU'LL USE ---");
        System.out.println("nextLine()    → Reads a whole line of text (like 'Hello World')");
        System.out.println("next()        → Reads one word (like 'Hello')");
        System.out.println("nextInt()     → Reads a whole number (like 42)");
        System.out.println("nextDouble()  → Reads a decimal number (like 3.14)");
        System.out.println("nextBoolean() → Reads true or false");
        System.out.println();

        // Important tip
        System.out.println("--- IMPORTANT TIP ---");
        System.out.println("Always close your Scanner when done:");
        System.out.println("  sc.close();");
        System.out.println("Think of it like saying 'Thank you' to your assistant!");
        
        sc.close();
        System.out.println("\n🎉 Great! You just learned how to use Scanner!");
        System.out.println("Now your programs can talk with users!");
    }
}
