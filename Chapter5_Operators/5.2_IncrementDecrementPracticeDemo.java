package Chapter5_Operators;
// 5.2_IncrementDecrementPracticeDemo.java
// Interactive: Practice with increment and decrement in real scenarios

import java.util.Scanner;

class IncrementDecrementPracticeDemo {
    public static void main(String[] args) {
        System.out.println("=== INCREMENT/DECREMENT PRACTICE ===");
        System.out.println("Real-world scenarios using ++ and -- operators\n");

        Scanner sc = new Scanner(System.in);

        // Exercise 1: Attendance counter
        System.out.println("--- EXERCISE 1: ATTENDANCE COUNTER ---");
        int daysPresent = 0;
        int totalDays = 5;
        
        System.out.println("Week attendance tracker (5 days):");
        System.out.println("Starting days present: " + daysPresent);
        
        for (int day = 1; day <= totalDays; day++) {
            System.out.print("Were you present on day " + day + "? (y/n): ");
            char present = sc.next().charAt(0);
            
            if (present == 'y' || present == 'Y') {
                daysPresent++;  // Increment if present
                System.out.println("  Present! Total days: " + daysPresent);
            } else {
                System.out.println("  Absent. Total days: " + daysPresent);
            }
        }
        
        System.out.println("Final attendance: " + daysPresent + "/" + totalDays + " days");
        double percentage = (daysPresent * 100.0) / totalDays;
        System.out.println("Attendance percentage: " + String.format("%.1f", percentage) + "%");
        System.out.println();

        // Exercise 2: Game lives simulator
        System.out.println("--- EXERCISE 2: GAME LIVES SIMULATOR ---");
        System.out.print("Enter starting lives: ");
        int lives = sc.nextInt();
        
        System.out.println("Starting game with " + lives + " lives");
        
        while (lives > 0) {
            System.out.println("\nCurrent lives: " + lives);
            System.out.println("1. Take damage (-1 life)");
            System.out.println("2. Find health pack (+1 life)");
            System.out.println("3. Quit game");
            System.out.print("Choose action: ");
            
            int choice = sc.nextInt();
            
            if (choice == 1) {
                lives--;  // Take damage
                if (lives > 0) {
                    System.out.println("Ouch! Lives remaining: " + lives);
                } else {
                    System.out.println("💀 Game Over! No lives remaining.");
                }
            } else if (choice == 2) {
                lives++;  // Find health
                System.out.println("❤️ Health restored! Lives now: " + lives);
            } else if (choice == 3) {
                System.out.println("Thanks for playing! Final lives: " + lives);
                break;
            } else {
                System.out.println("Invalid choice! No change in lives.");
            }
        }
        System.out.println();

        // Exercise 3: Shopping cart counter
        System.out.println("--- EXERCISE 3: SHOPPING CART ---");
        int cartItems = 0;
        double cartTotal = 0.0;
        
        System.out.println("Shopping cart manager");
        System.out.println("Starting with " + cartItems + " items, total: ₹" + cartTotal);
        
        while (true) {
            System.out.println("\nCart: " + cartItems + " items, Total: ₹" + String.format("%.2f", cartTotal));
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Checkout");
            System.out.print("Choose action: ");
            
            int action = sc.nextInt();
            
            if (action == 1) {
                System.out.print("Enter item price: ₹");
                double price = sc.nextDouble();
                cartItems++;    // Increment item count
                cartTotal += price;
                System.out.println("Added item! Cart now has " + cartItems + " items");
            } else if (action == 2) {
                if (cartItems > 0) {
                    System.out.print("Enter price of item to remove: ₹");
                    double price = sc.nextDouble();
                    cartItems--;    // Decrement item count
                    cartTotal -= price;
                    System.out.println("Removed item! Cart now has " + cartItems + " items");
                } else {
                    System.out.println("Cart is empty! Nothing to remove.");
                }
            } else if (action == 3) {
                System.out.println("🛒 Checkout completed!");
                System.out.println("Final: " + cartItems + " items, Total: ₹" + String.format("%.2f", cartTotal));
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        System.out.println();

        // Exercise 4: Number sequence generator
        System.out.println("--- EXERCISE 4: SEQUENCE GENERATOR ---");
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter how many numbers to generate: ");
        int count = sc.nextInt();
        
        System.out.print("Ascending sequence: ");
        int current = start;
        for (int i = 0; i < count; i++) {
            System.out.print(current + " ");
            current++;  // Increment for next number
        }
        System.out.println();
        
        System.out.print("Descending sequence: ");
        current = start;
        for (int i = 0; i < count; i++) {
            System.out.print(current + " ");
            current--;  // Decrement for next number
        }
        System.out.println();

        sc.close();
        System.out.println("\n🚀 Great job mastering increment and decrement operators!");
    }
}
