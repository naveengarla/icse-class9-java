package Chapter4_ValuesAndDataTypes;
// 7.1_StringBasicsDemo.java
// Introduction: Working with String data type and concatenation

class StringBasicsDemo {
    public static void main(String[] args) {
        System.out.println("=== STRING BASICS DEMO ===");
        System.out.println("Understanding String data type and operations\n");

        // String declaration and initialization
        String greeting = "Hello";
        String name = "Java";
        String fullMessage;

        System.out.println("--- String Variables ---");
        System.out.println("greeting = \"" + greeting + "\"");
        System.out.println("name = \"" + name + "\"");
        System.out.println();

        // String concatenation with + operator
        fullMessage = greeting + " " + name;
        System.out.println("--- String Concatenation ---");
        System.out.println("greeting + \" \" + name = \"" + fullMessage + "\"");
        System.out.println();

        // Concatenation with numbers
        String studentName = "Alice";
        int age = 15;
        double grade = 85.5;

        System.out.println("--- Mixing Strings and Numbers ---");
        System.out.println("Student: " + studentName);
        System.out.println("Age: " + age + " years");
        System.out.println("Grade: " + grade + "%");
        
        // Creating complete sentence
        String report = studentName + " is " + age + " years old and scored " + grade + "%.";
        System.out.println("Report: " + report);
        System.out.println();

        // String length and basic methods
        System.out.println("--- String Properties ---");
        System.out.println("Length of \"" + fullMessage + "\": " + fullMessage.length());
        System.out.println("Uppercase: " + fullMessage.toUpperCase());
        System.out.println("Lowercase: " + fullMessage.toLowerCase());
        System.out.println();

        // Character at specific position
        System.out.println("--- Character Access ---");
        String word = "Programming";
        System.out.println("Word: " + word);
        System.out.println("First character: " + word.charAt(0));
        System.out.println("Last character: " + word.charAt(word.length() - 1));
    }
}
