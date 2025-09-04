package Chapter5_Operators;
// 6_SpecialOperatorsDemo.java
// Demonstrates special operators: new, dot operator, object creation/use

class SpecialOperatorsDemo {
    public static void main(String[] args) {
        // 'new' operator: creating objects
        String str = new String("Hello, Java!");
        System.out.println("String object: " + str);

        // Dot operator: accessing fields and methods
        int length = str.length();
        System.out.println("Length of string: " + length);
        System.out.println("Uppercase: " + str.toUpperCase());

        // Hands-on: Create and use a simple object
        Student s = new Student("Alice", 21);
        System.out.println("Student name: " + s.getName());
        System.out.println("Student age: " + s.getAge());
    }
}

// Simple Student class for demonstration
class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String getName() { return name; }
    int getAge() { return age; }
}
