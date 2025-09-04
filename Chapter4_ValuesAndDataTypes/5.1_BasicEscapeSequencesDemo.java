package Chapter4_ValuesAndDataTypes;
// 5.1_BasicEscapeSequencesDemo.java
// Basic escape sequences: newline, tab, quotes

class BasicEscapeSequencesDemo {
    public static void main(String[] args) {
        System.out.println("=== BASIC ESCAPE SEQUENCES DEMO ===");
        System.out.println("Escape sequences represent special characters\n");

        System.out.println("--- Newline (\\n) ---");
        System.out.println("Line 1\nLine 2\nLine 3");
        System.out.println();

        System.out.println("--- Tab (\\t) ---");
        System.out.println("Column1\tColumn2\tColumn3");
        System.out.println("Name\tAge\tCity");
        System.out.println("Ravi\t20\tBangalore");
        System.out.println();

        System.out.println("--- Double Quotes (\\\") ---");
        System.out.println("She said, \"Hello World!\"");
        System.out.println("The book title is \"Java Programming\"");
        System.out.println();

        System.out.println("--- Single Quote (\\') ---");
        System.out.println("Character: \'A\'");
        System.out.println("Grade: \'A+\'");
        System.out.println();

        System.out.println("--- Backslash (\\\\) ---");
        System.out.println("File path: C:\\Users\\Student\\Documents");
        System.out.println("Escape sequence: \\n means newline");
    }
}
