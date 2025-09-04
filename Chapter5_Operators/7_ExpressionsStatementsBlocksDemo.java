package Chapter5_Operators;
// 7_ExpressionsStatementsBlocksDemo.java
// Demonstrates expressions, statements, and blocks in Java with hands-on examples

class ExpressionsStatementsBlocksDemo {
    public static void main(String[] args) {
        // Expression: combines variables, operators, and values
        int length = 5, width = 3;
        int area = length * width; // Expression
        int perimeter = 2 * (length + width); // Expression
        System.out.println("Length = " + length + ", Width = " + width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        // Statement: complete instruction
        int x = 10; // Statement
        x += 5; // Statement
        System.out.println("x after statements: " + x);

        // Block: group of statements within {}
        {
            int y = 20;
            y -= 2;
            System.out.println("Inside block, y = " + y);
        }
        // System.out.println(y); // Error: y not visible outside block

        // Hands-on: Calculate area and perimeter for a rectangle from user input
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("\nEnter length: ");
        int userLength = sc.nextInt();
        System.out.print("Enter width: ");
        int userWidth = sc.nextInt();
        int userArea = userLength * userWidth;
        int userPerimeter = 2 * (userLength + userWidth);
        System.out.println("Area: " + userArea);
        System.out.println("Perimeter: " + userPerimeter);
        sc.close();
    }
}
