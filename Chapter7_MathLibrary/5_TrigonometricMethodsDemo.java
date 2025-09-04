package Chapter7_MathLibrary;
// 5_TrigonometricMethodsDemo.java
// Demonstrates Math.sin(), Math.cos(), Math.tan(), right-angle triangle calculations

class TrigonometricMethodsDemo {
    public static void main(String[] args) {
        double angleDegrees = 30.0;
        double angleRadians = Math.toRadians(angleDegrees);
        System.out.println("Angle: " + angleDegrees + " degrees = " + angleRadians + " radians");
        System.out.println("sin: " + Math.sin(angleRadians));
        System.out.println("cos: " + Math.cos(angleRadians));
        System.out.println("tan: " + Math.tan(angleRadians));

        // Right-angle triangle: given sides a, b, find hypotenuse
        double a = 3.0, b = 4.0;
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Sides: a = " + a + ", b = " + b);
        System.out.println("Hypotenuse: " + hypotenuse);
    }
}
