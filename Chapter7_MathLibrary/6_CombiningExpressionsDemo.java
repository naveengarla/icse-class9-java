package Chapter7_MathLibrary;
// 6_CombiningExpressionsDemo.java
// Demonstrates combining Math methods and quadratic equation solver

class CombiningExpressionsDemo {
    public static void main(String[] args) {
        // Example: Quadratic equation solver ax^2 + bx + c = 0
        double a = 1, b = -3, c = 2;
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Quadratic equation: x^2 - 3x + 2 = 0");
        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots: " + root1 + ", " + root2);
        } else {
            System.out.println("No real roots.");
        }

        // Combining Math methods: Calculate distance between (x1, y1) and (x2, y2)
        double x1 = 2, y1 = 3, x2 = 7, y2 = 11;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance between (2,3) and (7,11): " + distance);
    }
}
