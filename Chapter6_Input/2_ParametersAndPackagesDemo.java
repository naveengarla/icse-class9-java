package Chapter6_Input;
// 2_ParametersAndPackagesDemo.java
// Demonstrates method parameters and importing packages in Java

import java.util.Random;

class ParametersAndPackagesDemo {
    // Method with parameters
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(5, 7);
        System.out.println("Sum using method with parameters: " + sum);

        // Using java.util.Random
        Random rand = new Random();
        int randomNum = rand.nextInt(100); // 0 to 99
        System.out.println("Random number (0-99): " + randomNum);
    }
}
