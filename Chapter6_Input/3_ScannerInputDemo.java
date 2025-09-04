package Chapter6_Input;
// 3_ScannerInputDemo.java
// Demonstrates using Scanner for input in Java and building a Student Info Form

import java.util.Scanner;

class ScannerInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter your grade: ");
        double grade = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter your city: ");
        String city = sc.nextLine();

        System.out.println("\n--- Student Info ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("City: " + city);
        sc.close();
    }
}
