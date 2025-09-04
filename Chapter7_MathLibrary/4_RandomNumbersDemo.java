package Chapter7_MathLibrary;
// 4_RandomNumbersDemo.java
// Demonstrates Math.random(), dice roller, and random password generator

class RandomNumbersDemo {
    public static void main(String[] args) {
        // Math.random() returns a double between 0.0 and 1.0
        double rand = Math.random();
        System.out.println("Random double (0.0-1.0): " + rand);

        // Dice roller (1-6)
        int dice = (int)(Math.random() * 6) + 1;
        System.out.println("Dice roll: " + dice);

        // Random password generator (6 chars)
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int idx = (int)(Math.random() * chars.length());
            password.append(chars.charAt(idx));
        }
        System.out.println("Random password: " + password);
    }
}
