package Chapter4_ValuesAndDataTypes;
// 5.EscapeSequencesDemo.java
// Hands-on exploration of escape sequences in Java strings
// Includes newline, tab, quotes, formatted output, and practical examples

class EscapeSequencesDemo {
    public static void main(String[] args) {
        // 1. Newline (\n), Tab (\t), Quotes (\" and \\)
        System.out.println("Line1\nLine2");
        System.out.println("Column1\tColumn2\tColumn3");
        System.out.println("She said, \"Hello!\"");
        System.out.println("Backslash: \\");

        // 2. Print a formatted poem
        System.out.println("\n--- Formatted Poem ---");
        System.out.println("Roses are red,\n\tViolets are blue,\nJava is fun,\n\tAnd so are you!");

        // 3. Print a formatted timetable
        System.out.println("\n--- Timetable ---");
        System.out.println("Time\tSubject\tRoom");
        System.out.println("9:00\tMath\t101");
        System.out.println("10:00\tScience\t102");
        System.out.println("11:00\tEnglish\t103");

        // 4. Edge cases: Multiple escape sequences
        System.out.println("Mix: Tab\tNewline\nQuote: \" ");

        // 5. Unicode escape in string
        System.out.println("Unicode: \u0C95 (Kannada Ka), \u0C24 (Telugu Ta)");
    }
}
