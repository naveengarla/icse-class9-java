package Chapter5_Operators;
// 1.2_TypesOfOperatorsDemo.java
// Overview: Categories of operators in Java with examples

class TypesOfOperatorsDemo {
    public static void main(String[] args) {
        System.out.println("=== TYPES OF OPERATORS IN JAVA ===");
        System.out.println("Different categories for different purposes\n");

        // 1. Arithmetic Operators
        System.out.println("1. ARITHMETIC OPERATORS (for math calculations)");
        System.out.println("   Symbol | Purpose      | Example");
        System.out.println("   -------|--------------|--------");
        System.out.println("   +      | Addition     | 5 + 3 = 8");
        System.out.println("   -      | Subtraction  | 5 - 3 = 2");
        System.out.println("   *      | Multiplication| 5 * 3 = 15");
        System.out.println("   /      | Division     | 6 / 3 = 2");
        System.out.println("   %      | Remainder    | 7 % 3 = 1");
        System.out.println();

        // 2. Relational Operators
        System.out.println("2. RELATIONAL OPERATORS (for comparisons)");
        System.out.println("   Symbol | Purpose           | Example");
        System.out.println("   -------|-------------------|--------");
        System.out.println("   ==     | Equal to          | 5 == 5 → true");
        System.out.println("   !=     | Not equal to      | 5 != 3 → true");
        System.out.println("   >      | Greater than      | 5 > 3 → true");
        System.out.println("   <      | Less than         | 5 < 3 → false");
        System.out.println("   >=     | Greater or equal  | 5 >= 5 → true");
        System.out.println("   <=     | Less or equal     | 5 <= 3 → false");
        System.out.println();

        // 3. Logical Operators
        System.out.println("3. LOGICAL OPERATORS (for combining conditions)");
        System.out.println("   Symbol | Purpose    | Example");
        System.out.println("   -------|------------|--------");
        System.out.println("   &&     | AND        | true && false → false");
        System.out.println("   ||     | OR         | true || false → true");
        System.out.println("   !      | NOT        | !true → false");
        System.out.println();

        // 4. Assignment Operators
        System.out.println("4. ASSIGNMENT OPERATORS (for storing values)");
        System.out.println("   Symbol | Purpose        | Example");
        System.out.println("   -------|----------------|--------");
        System.out.println("   =      | Simple assign  | x = 5");
        System.out.println("   +=     | Add and assign | x += 3 (same as x = x + 3)");
        System.out.println("   -=     | Sub and assign | x -= 2 (same as x = x - 2)");
        System.out.println();

        // 5. Special Operators
        System.out.println("5. SPECIAL OPERATORS (for specific tasks)");
        System.out.println("   Symbol | Purpose           | Example");
        System.out.println("   -------|-------------------|--------");
        System.out.println("   ++     | Increment by 1    | x++ or ++x");
        System.out.println("   --     | Decrement by 1    | x-- or --x");
        System.out.println();

        System.out.println("📚 Next: We'll explore each type with hands-on examples!");
    }
}
