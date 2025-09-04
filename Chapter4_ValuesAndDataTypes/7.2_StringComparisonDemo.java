package Chapter4_ValuesAndDataTypes;
// 7.2_StringComparisonDemo.java
// Practice: Comparing strings correctly in Java

import java.util.Scanner;

class StringComparisonDemo {
    public static void main(String[] args) {
        System.out.println("=== STRING COMPARISON DEMO ===");
        System.out.println("Learning correct ways to compare strings\n");

        Scanner sc = new Scanner(System.in);

        // Predefined strings for comparison
        String password = "java123";
        String username = "student";

        System.out.println("--- Login System Example ---");
        System.out.print("Enter username: ");
        String inputUsername = sc.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = sc.nextLine();

        // WRONG way to compare (using ==)
        System.out.println("\n--- Wrong Comparison (using ==) ---");
        if (inputUsername == username) {
            System.out.println("Username match (==): true");
        } else {
            System.out.println("Username match (==): false");
        }

        // CORRECT way to compare (using .equals())
        System.out.println("\n--- Correct Comparison (using .equals()) ---");
        if (inputUsername.equals(username)) {
            System.out.println("Username match (.equals()): true");
        } else {
            System.out.println("Username match (.equals()): false");
        }

        if (inputPassword.equals(password)) {
            System.out.println("Password match (.equals()): true");
        } else {
            System.out.println("Password match (.equals()): false");
        }

        // Complete login check
        System.out.println("\n--- Login Result ---");
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("✓ Login successful!");
        } else {
            System.out.println("✗ Login failed!");
        }

        // Case-insensitive comparison
        System.out.println("\n--- Case-Insensitive Comparison ---");
        String color1 = "RED";
        String color2 = "red";
        String color3 = "Red";

        System.out.println("color1: " + color1);
        System.out.println("color2: " + color2);
        System.out.println("color3: " + color3);

        System.out.println("color1.equals(color2): " + color1.equals(color2));
        System.out.println("color1.equalsIgnoreCase(color2): " + color1.equalsIgnoreCase(color2));
        System.out.println("color1.equalsIgnoreCase(color3): " + color1.equalsIgnoreCase(color3));

        sc.close();
    }
}
