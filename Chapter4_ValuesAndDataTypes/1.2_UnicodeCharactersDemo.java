package Chapter4_ValuesAndDataTypes;
// 1.2_UnicodeCharactersDemo.java
// Unicode characters demonstration

class UnicodeCharactersDemo {
    public static void main(String[] args) {
    // === UNICODE CHARACTER SET DEMO ===
    // This program shows how computers can display letters and symbols from many languages using Unicode.
    // Unicode is a system that gives every character (from any language) a unique number called a 'code point'.
    // For example, English, Kannada, Telugu, Chinese, Arabic, and even emojis!

    System.out.println("=== UNICODE CHARACTER SET DEMO ===");
    System.out.println("Unicode is a universal character encoding standard.");
    System.out.println("It can represent characters from all writing systems, not just English!\n");

    // Let's see some examples from different languages:
    System.out.println("--- Unicode Characters from Different Languages ---");

    // Each character below is written using its Unicode code point.
    // The code point is written as '\uXXXX', where XXXX is a hexadecimal number.

    // Kannada letter: ಕ (Unicode: \u0C95)
    char kannada = '\u0C95'; // This is the Kannada letter 'ka'
    // Telugu letter: త (Unicode: \u0C24)
    char telugu = '\u0C24'; // This is the Telugu letter 'ta'
    // Chinese character: 中 (Unicode: \u4E2D)
    char chinese = '\u4E2D'; // This is the Chinese character for 'middle'
    // Arabic letter: ا (Unicode: \u0627)
    char arabic = '\u0627'; // This is the Arabic letter 'alif'
    // Emoji: ☺ (Unicode: \u263A)
    char emoji = '\u263A'; // This is a smiley face emoji

    // Now let's print these characters with their descriptions:
    System.out.println("Kannada letter: " + kannada + " (Unicode: \\u0C95)");
    System.out.println("Telugu letter: " + telugu + " (Unicode: \\u0C24)");
    System.out.println("Chinese character: " + chinese + " (Unicode: \\u4E2D)");
    System.out.println("Arabic letter: " + arabic + " (Unicode: \\u0627)");
    System.out.println("Emoji: " + emoji + " (Unicode: \\u263A)");

    // Why is this important?
    // Unicode lets us write programs that work for people all over the world, in any language!
    // You can use Unicode to display your name, your favorite emoji, or words from your mother tongue.

    // Try changing the code points above to see other characters from Kannada (\u0C80 to \u0CFF) or Telugu (\u0C00 to \u0C7F).
    // For example, '\u0C85' is Kannada letter 'ಅ', '\u0C05' is Telugu letter 'అ'.

    // Unicode makes programming more fun and inclusive!
    }
}
