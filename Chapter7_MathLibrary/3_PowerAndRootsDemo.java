package Chapter7_MathLibrary;
// 3_PowerAndRootsDemo.java
// Demonstrates Math.pow(), Math.sqrt(), area and volume calculations

class PowerAndRootsDemo {
    public static void main(String[] args) {
        double radius = 5.0;
        double areaCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle (r=5): " + areaCircle);

        double side = 3.0;
        double volumeCube = Math.pow(side, 3);
        System.out.println("Volume of cube (side=3): " + volumeCube);

        double num = 49.0;
        System.out.println("Square root of 49: " + Math.sqrt(num));
    }
}
