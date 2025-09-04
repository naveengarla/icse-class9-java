package Chapter4_ValuesAndDataTypes;
// 1.5_SurrogatePairsDemo.java
// Advanced Unicode: Surrogate pairs for extended characters

class SurrogatePairsDemo {
    public static void main(String[] args) {
        System.out.println("=== SURROGATE PAIRS DEMO (ADVANCED) ===");
        System.out.println("Some Unicode characters need two 16-bit code units\n");

        // Surrogate pairs for emojis
        String smiley = "\uD83D\uDE00"; // 😀
        String heart = "\uD83D\uDC96"; // 💖
        String rocket = "\uD83D\uDE80"; // 🚀

        System.out.println("--- Emoji Examples (Surrogate Pairs) ---");
        System.out.println("Smiley face: " + smiley + " (\\uD83D\\uDE00)");
        System.out.println("Heart: " + heart + " (\\uD83D\\uDC96)");
        System.out.println("Rocket: " + rocket + " (\\uD83D\\uDE80)");
        System.out.println();

        System.out.println("--- String Length vs Character Count ---");
        System.out.println("String: " + smiley);
        System.out.println("String length: " + smiley.length()); // Returns 2 (surrogate pair)
        System.out.println("Character count: " + smiley.codePointCount(0, smiley.length())); // Returns 1
    }
}
