package Chapter4_ValuesAndDataTypes;
// 2.2_IdentifiersDemo.java
// Valid and invalid Java identifiers

class IdentifiersDemo {
    public static void main(String[] args) {
        System.out.println("=== JAVA IDENTIFIERS DEMO ===");
        System.out.println("Identifiers are names for variables, methods, classes, etc.\n");

        // Valid identifiers
        int _validIdentifier = 5;
        int $anotherValid = 7;
        int valid123 = 123;
        int ValidCamelCase = 100;
        
        System.out.println("--- Valid Identifiers ---");
        System.out.println("_validIdentifier = " + _validIdentifier);
        System.out.println("$anotherValid = " + $anotherValid);
        System.out.println("valid123 = " + valid123);
        System.out.println("ValidCamelCase = " + ValidCamelCase);
        System.out.println();

        // Case sensitivity demonstration
        int Value = 1;
        int value = 2;
        int VALUE = 3;
        System.out.println("--- Case Sensitivity ---");
        System.out.println("Value = " + Value);
        System.out.println("value = " + value);
        System.out.println("VALUE = " + VALUE);
        System.out.println("All three are different identifiers!");
        System.out.println();

        System.out.println("--- Invalid Identifiers (Commented Out) ---");
        System.out.println("// int 123invalid = 10; // Cannot start with digit");
        System.out.println("// int class = 20; // 'class' is a keyword");
        System.out.println("// int my-var = 30; // '-' not allowed");
        System.out.println("// int @invalid = 5; // '@' not allowed");
    }
}
