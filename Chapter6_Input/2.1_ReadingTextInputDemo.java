package Chapter6_Input;
// 2.1_ReadingTextInputDemo.java
// Focus: Reading different types of text input

import java.util.Scanner;

class ReadingTextInputDemo {
    public static void main(String[] args) {
        System.out.println("=== READING TEXT INPUT ===");
        System.out.println("Learning to read words and sentences from users\n");

        Scanner sc = new Scanner(System.in);

        // Reading single words with next()
        System.out.println("--- READING SINGLE WORDS ---");
        System.out.print("Enter your first name: ");
        String firstName = sc.next();
        System.out.print("Enter your last name: ");
        String lastName = sc.next();
        
        System.out.println("Hello " + firstName + " " + lastName + "!");
        System.out.println("Note: next() reads only ONE WORD at a time");
        System.out.println();

        // Clear the buffer before reading full lines
        sc.nextLine(); // This consumes the leftover newline
        
        // Reading full sentences with nextLine()
        System.out.println("--- READING FULL SENTENCES ---");
        System.out.print("What's your favorite movie? ");
        String favoriteMovie = sc.nextLine();
        System.out.print("Tell me about your hobby: ");
        String hobby = sc.nextLine();
        
        System.out.println();
        System.out.println("--- YOUR PROFILE ---");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Favorite Movie: " + favoriteMovie);
        System.out.println("Hobby: " + hobby);
        System.out.println();

        // Demonstrating the difference
        System.out.println("--- NEXT() VS NEXTLINE() ---");
        System.out.println("next()     → Reads until space or Enter");
        System.out.println("           → Good for: single words, names");
        System.out.println("           → Example: 'Harry' from 'Harry Potter'");
        System.out.println();
        System.out.println("nextLine() → Reads entire line until Enter");
        System.out.println("           → Good for: sentences, addresses");
        System.out.println("           → Example: 'Harry Potter' (full phrase)");
        System.out.println();

        // Fun text operations
        System.out.println("--- FUN WITH TEXT ---");
        System.out.print("Enter a word to analyze: ");
        String word = sc.next();
        
        System.out.println();
        System.out.println("Word Analysis for '" + word + "':");
        System.out.println("• Length: " + word.length() + " characters");
        System.out.println("• First letter: " + word.charAt(0));
        System.out.println("• Last letter: " + word.charAt(word.length() - 1));
        System.out.println("• Uppercase: " + word.toUpperCase());
        System.out.println("• Lowercase: " + word.toLowerCase());
        System.out.println();

        // Quiz about favorite things
        sc.nextLine(); // Clear buffer
        System.out.println("--- QUICK QUIZ ABOUT YOU ---");
        
        System.out.print("1. What's your favorite color? ");
        String color = sc.nextLine();
        
        System.out.print("2. What's your favorite subject in school? ");
        String subject = sc.nextLine();
        
        System.out.print("3. What's your dream job? ");
        String dreamJob = sc.nextLine();
        
        System.out.println();
        System.out.println("--- QUIZ RESULTS ---");
        System.out.println("🌈 Favorite color: " + color);
        System.out.println("📚 Favorite subject: " + subject);
        System.out.println("💼 Dream job: " + dreamJob);
        
        // Create a fun sentence
        System.out.println();
        System.out.println("--- STORY ABOUT YOU ---");
        System.out.println(firstName + " loves the color " + color + " and enjoys studying " + 
                         subject + ". One day, " + firstName + " wants to become a " + dreamJob + 
                         " and watch " + favoriteMovie + " while doing " + hobby + "!");

        sc.close();
        System.out.println("\n🎨 Amazing! You can now read any text from users!");
    }
}
