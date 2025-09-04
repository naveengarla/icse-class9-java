package Chapter6_Input;
// 5_ErrorHandlingBasicsDemo.java
// Demonstrates error handling for input in Java

import java.util.Scanner;

class ErrorHandlingBasicsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();
            System.out.println("You entered: " + num);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        sc.close();
    }
}
