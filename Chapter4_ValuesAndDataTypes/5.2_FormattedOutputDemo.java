package Chapter4_ValuesAndDataTypes;
// 5.2_FormattedOutputDemo.java
// Creating formatted output using escape sequences

class FormattedOutputDemo {
    public static void main(String[] args) {
        System.out.println("=== FORMATTED OUTPUT DEMO ===");
        System.out.println("Using escape sequences for beautiful formatting\n");

        // Formatted poem
        System.out.println("--- Formatted Poem ---");
        System.out.println("Roses are red,");
        System.out.println("\tViolets are blue,");
        System.out.println("Java is awesome,");
        System.out.println("\tAnd so are you!");
        System.out.println();

        // Formatted timetable
        System.out.println("--- Class Timetable ---");
        System.out.println("Time\t\tSubject\t\tRoom");
        System.out.println("--------------------------------");
        System.out.println("9:00 AM\t\tMath\t\t101");
        System.out.println("10:00 AM\tScience\t\t102");
        System.out.println("11:00 AM\tEnglish\t\t103");
        System.out.println("12:00 PM\tHindi\t\t104");
        System.out.println();

        // Box drawing with text
        System.out.println("--- Formatted Box ---");
        System.out.println("*************************");
        System.out.println("*\tStudent Report\t*");
        System.out.println("*\t--------------\t*");
        System.out.println("*\tName: Ravi\t*");
        System.out.println("*\tClass: 9th\t*");
        System.out.println("*\tMarks: 95%\t*");
        System.out.println("*************************");
    }
}
