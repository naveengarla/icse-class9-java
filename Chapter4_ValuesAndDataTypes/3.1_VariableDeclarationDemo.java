package Chapter4_ValuesAndDataTypes;
// 3.1_VariableDeclarationDemo.java
// Declaring and initializing variables

class VariableDeclarationDemo {
    public static void main(String[] args) {
        System.out.println("=== VARIABLE DECLARATION DEMO ===");
        System.out.println("Variables store data values\n");

        // Declaring variables without initialization
        int age;
        double salary;
        String name;
        boolean isStudent;

        // Initializing variables
        age = 20;
        salary = 50000.50;
        name = "Ravi";
        isStudent = true;

        System.out.println("--- Variable Values ---");
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Name: " + name);
        System.out.println("Is Student: " + isStudent);
        System.out.println();

        // Declaration with initialization
        int marks = 95;
        double pi = 3.14159;
        char grade = 'A';

        System.out.println("--- Variables with Initial Values ---");
        System.out.println("Marks: " + marks);
        System.out.println("Pi: " + pi);
        System.out.println("Grade: " + grade);
    }
}
