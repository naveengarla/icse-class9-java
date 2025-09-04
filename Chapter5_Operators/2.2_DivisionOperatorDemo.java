package Chapter5_Operators;
// 2.2_DivisionOperatorDemo.java
// Focus: Division operator and its special behavior in Java

class DivisionOperatorDemo {
    public static void main(String[] args) {
        System.out.println("=== DIVISION OPERATOR (/) ===");
        System.out.println("Understanding different types of division in Java\n");

        // Basic division with integers
        System.out.println("--- INTEGER DIVISION ---");
        int cookies = 15;
        int friends = 4;
        int cookiesPerFriend = cookies / friends;
        
        System.out.println("Total cookies: " + cookies);
        System.out.println("Number of friends: " + friends);
        System.out.println("Cookies per friend: " + cookies + " ÷ " + friends + " = " + cookiesPerFriend);
        System.out.println("Note: Each friend gets " + cookiesPerFriend + " cookies (fractional part ignored)");
        System.out.println();

        // Division with exact results
        System.out.println("--- EXACT DIVISION ---");
        int totalStudents = 20;
        int groupSize = 4;
        int numberOfGroups = totalStudents / groupSize;
        
        System.out.println("Total students: " + totalStudents);
        System.out.println("Students per group: " + groupSize);
        System.out.println("Number of groups: " + totalStudents + " ÷ " + groupSize + " = " + numberOfGroups);
        System.out.println();

        // Floating-point division
        System.out.println("--- FLOATING-POINT DIVISION ---");
        double totalDistance = 15.0;
        double time = 4.0;
        double speed = totalDistance / time;
        
        System.out.println("Distance: " + totalDistance + " km");
        System.out.println("Time: " + time + " hours");
        System.out.println("Speed: " + totalDistance + " ÷ " + time + " = " + speed + " km/h");
        System.out.println();

        // Mixing integers and decimals
        System.out.println("--- MIXED DIVISION ---");
        int intNum = 7;
        double doubleNum = 2.0;
        double result = intNum / doubleNum;
        
        System.out.println("Integer: " + intNum);
        System.out.println("Double: " + doubleNum);
        System.out.println("Result: " + intNum + " ÷ " + doubleNum + " = " + result);
        System.out.println();

        // Common examples
        System.out.println("--- PRACTICAL EXAMPLES ---");
        
        // Price per item
        int totalPrice = 150;
        int items = 6;
        double pricePerItem = totalPrice / (double)items; // Convert to double for accuracy
        
        System.out.println("Total price: ₹" + totalPrice);
        System.out.println("Number of items: " + items);
        System.out.println("Price per item: ₹" + pricePerItem);
        System.out.println();

        // Division by zero warning
        System.out.println("--- IMPORTANT WARNING ---");
        System.out.println("⚠️  Never divide by zero!");
        System.out.println("   Division by zero causes program to crash");
        System.out.println("   Always check if divisor is not zero before dividing");
        
        // Safe division example
        int dividend = 10;
        int divisor = 0;
        
        if (divisor != 0) {
            System.out.println("Result: " + (dividend / divisor));
        } else {
            System.out.println("Cannot divide " + dividend + " by " + divisor);
        }
    }
}
