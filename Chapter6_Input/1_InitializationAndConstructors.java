package Chapter6_Input;
// 1_InitializationAndConstructors.java
// Demonstrates variable initialization and constructors in Java

class Student {
    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() { return name; }
    int getAge() { return age; }
}

class InitializationAndConstructors {
    public static void main(String[] args) {
        // Variable initialization
        int x = 10;
        double y = 3.14;
        String greeting = "Hello";
        System.out.println("x = " + x + ", y = " + y + ", greeting = " + greeting);

        // Using constructor
        Student s1 = new Student("Ravi", 18);
        Student s2 = new Student("Priya", 20);
        System.out.println("Student 1: " + s1.getName() + ", Age: " + s1.getAge());
        System.out.println("Student 2: " + s2.getName() + ", Age: " + s2.getAge());
    }
}
