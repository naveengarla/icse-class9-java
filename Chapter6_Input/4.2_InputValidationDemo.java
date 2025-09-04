package Chapter6_Input;
// 4.2_InputValidationDemo.java
// Practice: Making programs robust with input validation

import java.util.Scanner;

class InputValidationDemo {
    public static void main(String[] args) {
        System.out.println("=== INPUT VALIDATION ===");
        System.out.println("Making your programs handle any input correctly!\n");

        Scanner sc = new Scanner(System.in);

        // Example 1: Age validation
        System.out.println("--- EXAMPLE 1: AGE VALIDATION ---");
        System.out.println("Let's get your age with proper validation");
        
        int age = 0;
        boolean validAge = false;
        
        while (!validAge) {
            System.out.print("Enter your age (1-120): ");
            
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                
                if (age >= 1 && age <= 120) {
                    validAge = true;
                    System.out.println("✅ Valid age: " + age);
                } else {
                    System.out.println("❌ Age must be between 1 and 120. Try again.");
                }
            } else {
                System.out.println("❌ Please enter a valid number. Try again.");
                sc.next(); // Clear invalid input
            }
        }
        sc.nextLine(); // Clear buffer
        System.out.println();

        // Example 2: Grade validation
        System.out.println("--- EXAMPLE 2: GRADE VALIDATION ---");
        System.out.println("Enter your test score with validation");
        
        double score = 0;
        boolean validScore = false;
        
        while (!validScore) {
            System.out.print("Enter your test score (0.0-100.0): ");
            
            if (sc.hasNextDouble()) {
                score = sc.nextDouble();
                
                if (score >= 0.0 && score <= 100.0) {
                    validScore = true;
                    System.out.println("✅ Valid score: " + score + "%");
                } else {
                    System.out.println("❌ Score must be between 0.0 and 100.0. Try again.");
                }
            } else {
                System.out.println("❌ Please enter a valid decimal number. Try again.");
                sc.next(); // Clear invalid input
            }
        }
        sc.nextLine(); // Clear buffer
        System.out.println();

        // Example 3: Text validation (non-empty)
        System.out.println("--- EXAMPLE 3: NAME VALIDATION ---");
        System.out.println("Enter your name with validation");
        
        String name = "";
        boolean validName = false;
        
        while (!validName) {
            System.out.print("Enter your full name (cannot be empty): ");
            name = sc.nextLine().trim();
            
            if (!name.isEmpty() && name.length() >= 2) {
                validName = true;
                System.out.println("✅ Valid name: " + name);
            } else {
                System.out.println("❌ Name must be at least 2 characters long. Try again.");
            }
        }
        System.out.println();

        // Example 4: Yes/No validation
        System.out.println("--- EXAMPLE 4: YES/NO VALIDATION ---");
        System.out.println("Answer a yes/no question with validation");
        
        boolean answer = false;
        boolean validAnswer = false;
        
        while (!validAnswer) {
            System.out.print("Do you like programming? (yes/no/y/n): ");
            String response = sc.nextLine().toLowerCase().trim();
            
            if (response.equals("yes") || response.equals("y")) {
                answer = true;
                validAnswer = true;
                System.out.println("✅ You answered: Yes");
            } else if (response.equals("no") || response.equals("n")) {
                answer = false;
                validAnswer = true;
                System.out.println("✅ You answered: No");
            } else {
                System.out.println("❌ Please answer 'yes', 'no', 'y', or 'n'. Try again.");
            }
        }
        System.out.println();

        // Example 5: Menu choice validation
        System.out.println("--- EXAMPLE 5: MENU CHOICE VALIDATION ---");
        System.out.println("Choose from a menu with validation");
        
        int choice = 0;
        boolean validChoice = false;
        
        while (!validChoice) {
            System.out.println("Choose your favorite subject:");
            System.out.println("1. Mathematics");
            System.out.println("2. Science");
            System.out.println("3. English");
            System.out.println("4. History");
            System.out.print("Enter choice (1-4): ");
            
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                
                if (choice >= 1 && choice <= 4) {
                    validChoice = true;
                    String[] subjects = {"", "Mathematics", "Science", "English", "History"};
                    System.out.println("✅ You chose: " + subjects[choice]);
                } else {
                    System.out.println("❌ Please choose 1, 2, 3, or 4. Try again.");
                }
            } else {
                System.out.println("❌ Please enter a valid number. Try again.");
                sc.next(); // Clear invalid input
            }
        }
        sc.nextLine(); // Clear buffer
        System.out.println();

        // Real-world example: Student registration
        System.out.println("--- REAL-WORLD EXAMPLE: STUDENT REGISTRATION ---");
        System.out.println("Complete student registration with full validation");
        System.out.println();

        // Get student ID
        int studentId = 0;
        boolean validId = false;
        
        while (!validId) {
            System.out.print("Enter student ID (1000-9999): ");
            if (sc.hasNextInt()) {
                studentId = sc.nextInt();
                if (studentId >= 1000 && studentId <= 9999) {
                    validId = true;
                } else {
                    System.out.println("❌ Student ID must be 4 digits (1000-9999). Try again.");
                }
            } else {
                System.out.println("❌ Please enter a valid number. Try again.");
                sc.next();
            }
        }
        sc.nextLine(); // Clear buffer

        // Get email
        String email = "";
        boolean validEmail = false;
        
        while (!validEmail) {
            System.out.print("Enter email address (must contain @): ");
            email = sc.nextLine().trim();
            
            if (email.contains("@") && email.length() > 5) {
                validEmail = true;
            } else {
                System.out.println("❌ Please enter a valid email with @. Try again.");
            }
        }

        // Final registration summary
        System.out.println();
        System.out.println("🎉 === REGISTRATION SUCCESSFUL ===");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Test Score: " + score + "%");
        System.out.println("Likes Programming: " + (answer ? "Yes" : "No"));
        System.out.println("═══════════════════════════════════");

        sc.close();
        System.out.println("\n🛡️ Excellent! You now know how to validate all types of input!");
        System.out.println("Your programs will be robust and user-friendly!");
    }
}
