package Chapter6_Input;
// 2.3_ReadingBooleanInputDemo.java
// Focus: Reading true/false and yes/no input

import java.util.Scanner;

class ReadingBooleanInputDemo {
    public static void main(String[] args) {
        System.out.println("=== READING BOOLEAN INPUT ===");
        System.out.println("Learning to read true/false and yes/no answers\n");

        Scanner sc = new Scanner(System.in);

        // What is boolean input?
        System.out.println("--- WHAT IS BOOLEAN INPUT? ---");
        System.out.println("Boolean = Only two possible answers: true or false");
        System.out.println("Like answering Yes/No questions in real life!");
        System.out.println("Examples: Do you like pizza? Are you a student? Is it raining?");
        System.out.println();

        // Reading boolean directly
        System.out.println("--- READING TRUE/FALSE ---");
        System.out.print("Do you like programming? (type true or false): ");
        boolean likesProgramming = sc.nextBoolean();
        
        System.out.print("Are you a student? (type true or false): ");
        boolean isStudent = sc.nextBoolean();
        
        System.out.println();
        System.out.println("--- BOOLEAN RESULTS ---");
        System.out.println("Likes programming: " + likesProgramming);
        System.out.println("Is student: " + isStudent);
        System.out.println();

        // Make decisions based on boolean input
        if (likesProgramming) {
            System.out.println("🎉 Awesome! Programming is a great skill to have!");
        } else {
            System.out.println("😊 That's okay! Maybe you'll like it more as you learn!");
        }
        
        if (isStudent) {
            System.out.println("📚 Great! Keep studying hard!");
        } else {
            System.out.println("🎓 Learning is lifelong, whether you're in school or not!");
        }
        System.out.println();

        // Reading yes/no answers (more natural way)
        sc.nextLine(); // Clear the buffer
        
        System.out.println("--- READING YES/NO ANSWERS ---");
        System.out.println("Most people prefer typing 'yes' or 'no' instead of 'true' or 'false'");
        System.out.println("Let's learn how to handle that!");
        System.out.println();
        
        System.out.print("Do you have a pet? (yes/no): ");
        String petAnswer = sc.nextLine().toLowerCase();
        boolean hasPet = petAnswer.equals("yes") || petAnswer.equals("y");
        
        System.out.print("Do you like sports? (yes/no): ");
        String sportsAnswer = sc.nextLine().toLowerCase();
        boolean likesSports = sportsAnswer.equals("yes") || sportsAnswer.equals("y");
        
        System.out.print("Do you play video games? (yes/no): ");
        String gamesAnswer = sc.nextLine().toLowerCase();
        boolean playsGames = gamesAnswer.equals("yes") || gamesAnswer.equals("y");
        
        System.out.println();
        System.out.println("--- YES/NO RESULTS ---");
        System.out.println("Has pet: " + hasPet);
        System.out.println("Likes sports: " + likesSports);
        System.out.println("Plays games: " + playsGames);
        System.out.println();

        // Create a profile based on answers
        System.out.println("--- YOUR PROFILE ---");
        if (hasPet) {
            System.out.println("🐕 Pet lover - You're caring and responsible!");
        }
        if (likesSports) {
            System.out.println("⚽ Sports fan - You're active and competitive!");
        }
        if (playsGames) {
            System.out.println("🎮 Gamer - You enjoy fun and challenges!");
        }
        if (likesProgramming && playsGames) {
            System.out.println("💻 Perfect combo - Maybe you'll create games someday!");
        }
        System.out.println();

        // Quiz with multiple boolean questions
        System.out.println("--- QUICK PERSONALITY QUIZ ---");
        System.out.print("Do you like reading books? (yes/no): ");
        boolean likesReading = sc.nextLine().toLowerCase().startsWith("y");
        
        System.out.print("Do you enjoy math? (yes/no): ");
        boolean likesMath = sc.nextLine().toLowerCase().startsWith("y");
        
        System.out.print("Do you prefer indoor activities? (yes/no): ");
        boolean prefersIndoor = sc.nextLine().toLowerCase().startsWith("y");
        
        System.out.println();
        System.out.println("--- PERSONALITY ANALYSIS ---");
        
        // Calculate personality score
        int score = 0;
        if (likesReading) score++;
        if (likesMath) score++;
        if (likesProgramming) score++;
        if (prefersIndoor) score++;
        
        System.out.println("Your intellectual activity score: " + score + "/4");
        
        if (score >= 3) {
            System.out.println("🤓 You're a true intellectual! Perfect for programming!");
        } else if (score >= 2) {
            System.out.println("📖 You have a good balance of interests!");
        } else {
            System.out.println("🌟 You're more of an active, hands-on person!");
        }
        System.out.println();

        // Boolean logic examples
        System.out.println("--- BOOLEAN LOGIC EXAMPLES ---");
        System.out.println("Combining your answers with AND (&&) and OR (||):");
        System.out.println();
        
        boolean studious = likesReading && likesMath;
        System.out.println("Studious (likes reading AND math): " + studious);
        
        boolean techie = likesProgramming && playsGames;
        System.out.println("Techie (likes programming AND games): " + techie);
        
        boolean creative = likesReading || playsGames;
        System.out.println("Creative (likes reading OR games): " + creative);
        
        boolean homebody = hasPet && prefersIndoor;
        System.out.println("Homebody (has pet AND prefers indoor): " + homebody);

        sc.close();
        System.out.println("\n✅ Fantastic! You now know how to read true/false input!");
    }
}
