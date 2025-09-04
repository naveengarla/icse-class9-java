package Chapter4_ValuesAndDataTypes;
// 1.1_AsciiCharactersDemo.java
// Basic ASCII characters and their values

class AsciiCharactersDemo {
    public static void main(String[] args) {
        System.out.println("=== ASCII CHARACTER SET DEMO ===");
        System.out.println("ASCII stands for American Standard Code for Information Interchange");
        System.out.println("It uses 7 bits to represent 128 characters (0-127)\n");
        
        System.out.println("--- Printable ASCII Characters (32-126) ---");
        char c=49;
        System.out.println(c);


        /*
        for (char c = 32; c < 127; c++) { // Printable ASCII range
            System.out.print(c + " ");
            if ((c - 31) % 20 == 0) System.out.println(); // New line every 20 chars
        }
        System.out.println("\n");

        System.out.println("--- ASCII Values for Common Characters ---");
        char[] samples = {'A', 'Z', 'a', 'z', '0', '9', ' ', '!', '@'};
        for (char sample : samples) {
            System.out.println("Character: '" + sample + "' -> ASCII Value: " + (int)sample);
        }*/
    }
}
