package Chapter7_MathLibrary;
// 2_CommonMathFunctionsDemo.java
// Demonstrates common Math functions: abs, round, floor, ceil, currency rounding

class CommonMathFunctionsDemo {
    public static void main(String[] args) {
        double num = -7.8;
        System.out.println("Number: " + num);
        System.out.println("Absolute: " + Math.abs(num));
        System.out.println("Round: " + Math.round(num));
        System.out.println("Floor: " + Math.floor(num));
        System.out.println("Ceil: " + Math.ceil(num));

        // Currency rounding
        double price = 123.4567;
        double rounded = Math.round(price * 100.0) / 100.0;
        System.out.println("Original price: " + price);
        System.out.println("Rounded to 2 decimals: " + rounded);
    }
}
