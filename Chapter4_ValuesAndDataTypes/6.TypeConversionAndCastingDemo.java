package Chapter4_ValuesAndDataTypes;
// 6.TypeConversionAndCastingDemo.java
// Hands-on exploration of type conversion and casting in Java
// Includes implicit conversion, explicit casting, average calculation, and boundary cases

class TypeConversionAndCastingDemo {
    public static void main(String[] args) {
        // 1. Implicit type conversion (widening)
        int intVal = 100;
        double doubleVal = intVal; // int to double (widening)
        System.out.println("Implicit conversion: int " + intVal + " to double " + doubleVal);

        // 2. Explicit casting (narrowing)
        double pi = 3.14159;
        int intPi = (int) pi; // double to int (narrowing)
        System.out.println("Explicit casting: double " + pi + " to int " + intPi);

        // 3. Practice: Calculating average with int vs double
        int sum = 7 + 8 + 9;
        int avgInt = sum / 3; // Integer division
        double avgDouble = sum / 3.0; // Floating-point division
        System.out.println("Average (int): " + avgInt);
        System.out.println("Average (double): " + avgDouble);

        // 4. Edge cases: Loss of precision
        int largeInt = 123456789;
        float floatVal = largeInt; // May lose precision
        System.out.println("Large int: " + largeInt + ", as float: " + floatVal);

        // 5. Casting between char and int
        char ch = 'A';
        int chInt = ch;
        System.out.println("Char 'A' as int: " + chInt);
        int num = 66;
        char numChar = (char) num;
        System.out.println("Int 66 as char: " + numChar);

        // 6. Boolean cannot be cast to other types
        boolean flag = true;
        // int boolInt = (int) flag; // Invalid: cannot cast boolean to int
    }
}
