package Chapter6_Input;
// 3.1_InputPracticeProjectsDemo.java
// Practice: Real-world projects using input

import java.util.Scanner;

class InputPracticeProjectsDemo {
    public static void main(String[] args) {
        System.out.println("=== INPUT PRACTICE PROJECTS ===");
        System.out.println("Real-world projects to practice your input skills!\n");

        Scanner sc = new Scanner(System.in);
        
        // Project 1: Student ID Card Generator
        System.out.println("📋 PROJECT 1: STUDENT ID CARD GENERATOR");
        System.out.println("Let's create your student ID card!");
        System.out.println();
        
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        
        System.out.print("Enter your class (like 9th, 10th): ");
        String studentClass = sc.nextLine();
        
        System.out.print("Enter your roll number: ");
        int rollNumber = sc.nextInt();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        sc.nextLine(); // Clear buffer
        
        System.out.print("Enter your school name: ");
        String schoolName = sc.nextLine();
        
        System.out.print("Are you a day scholar? (yes/no): ");
        boolean isDayScholar = sc.nextLine().toLowerCase().startsWith("y");
        
        System.out.println();
        System.out.println("🎓 === STUDENT ID CARD ===");
        System.out.println("═══════════════════════════");
        System.out.println("Name: " + fullName.toUpperCase());
        System.out.println("Class: " + studentClass);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Age: " + age + " years");
        System.out.println("School: " + schoolName);
        System.out.println("Type: " + (isDayScholar ? "Day Scholar" : "Boarding"));
        System.out.println("═══════════════════════════");
        System.out.println();
        
        // Project 2: Simple Shopping Calculator
        System.out.println("🛒 PROJECT 2: SHOPPING CALCULATOR");
        System.out.println("Calculate your shopping bill!");
        System.out.println();
        
        double totalBill = 0;
        int itemCount = 0;
        
        System.out.print("Enter price of item 1: ₹");
        double item1 = sc.nextDouble();
        totalBill += item1;
        itemCount++;
        
        System.out.print("Enter price of item 2: ₹");
        double item2 = sc.nextDouble();
        totalBill += item2;
        itemCount++;
        
        System.out.print("Enter price of item 3: ₹");
        double item3 = sc.nextDouble();
        totalBill += item3;
        itemCount++;
        
        System.out.print("Do you have a discount coupon? (yes/no): ");
        sc.nextLine(); // Clear buffer
        boolean hasDiscount = sc.nextLine().toLowerCase().startsWith("y");
        
        double discount = 0;
        if (hasDiscount) {
            System.out.print("Enter discount percentage (like 10 for 10%): ");
            double discountPercent = sc.nextDouble();
            discount = totalBill * (discountPercent / 100);
            totalBill -= discount;
        }
        
        System.out.println();
        System.out.println("🧾 === SHOPPING BILL ===");
        System.out.println("Item 1: ₹" + item1);
        System.out.println("Item 2: ₹" + item2);
        System.out.println("Item 3: ₹" + item3);
        System.out.println("────────────────────");
        System.out.println("Subtotal: ₹" + (item1 + item2 + item3));
        if (hasDiscount) {
            System.out.println("Discount: -₹" + String.format("%.2f", discount));
        }
        System.out.println("Total: ₹" + String.format("%.2f", totalBill));
        System.out.println("Items: " + itemCount);
        System.out.println("════════════════════");
        System.out.println();
        
        // Project 3: Grade Calculator
        System.out.println("📊 PROJECT 3: GRADE CALCULATOR");
        System.out.println("Calculate your overall grade!");
        System.out.println();
        
        System.out.print("Enter your name: ");
        sc.nextLine(); // Clear buffer
        String studentName = sc.nextLine();
        
        System.out.print("Enter Math marks (out of 100): ");
        int mathMarks = sc.nextInt();
        
        System.out.print("Enter Science marks (out of 100): ");
        int scienceMarks = sc.nextInt();
        
        System.out.print("Enter English marks (out of 100): ");
        int englishMarks = sc.nextInt();
        
        System.out.print("Enter Hindi marks (out of 100): ");
        int hindiMarks = sc.nextInt();
        
        System.out.print("Enter Social Studies marks (out of 100): ");
        int socialMarks = sc.nextInt();
        
        int totalMarks = mathMarks + scienceMarks + englishMarks + hindiMarks + socialMarks;
        double percentage = totalMarks / 5.0;
        
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        System.out.println();
        System.out.println("📈 === GRADE REPORT ===");
        System.out.println("Student: " + studentName);
        System.out.println("─────────────────────");
        System.out.println("Math:          " + mathMarks + "/100");
        System.out.println("Science:       " + scienceMarks + "/100");
        System.out.println("English:       " + englishMarks + "/100");
        System.out.println("Hindi:         " + hindiMarks + "/100");
        System.out.println("Social Studies:" + socialMarks + "/100");
        System.out.println("─────────────────────");
        System.out.println("Total:         " + totalMarks + "/500");
        System.out.println("Percentage:    " + String.format("%.1f", percentage) + "%");
        System.out.println("Grade:         " + grade);
        
        if (percentage >= 60) {
            System.out.println("Result:        PASS ✅");
        } else {
            System.out.println("Result:        FAIL ❌");
        }
        System.out.println("═════════════════════");

        sc.close();
        System.out.println("\n🚀 Congratulations! You've completed 3 amazing projects!");
        System.out.println("You're now ready to create your own interactive programs!");
    }
}
