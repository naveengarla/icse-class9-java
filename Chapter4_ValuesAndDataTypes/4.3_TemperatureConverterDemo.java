package Chapter4_ValuesAndDataTypes;
// 4.3_TemperatureConverterDemo.java
// Practice: Temperature converter (Celsius ↔ Fahrenheit)

import java.util.Scanner;

class TemperatureConverterDemo {
    public static void main(String[] args) {
        System.out.println("=== TEMPERATURE CONVERTER DEMO ===");
        System.out.println("Converting between Celsius and Fahrenheit\n");

        Scanner sc = new Scanner(System.in);

        // Celsius to Fahrenheit
        System.out.println("--- Celsius to Fahrenheit ---");
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9.0/5.0) + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        System.out.println();

        // Fahrenheit to Celsius
        System.out.println("--- Fahrenheit to Celsius ---");
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahr = sc.nextDouble();
        double celsi = (fahr - 32) * 5.0/9.0;
        System.out.println(fahr + "°F = " + celsi + "°C");
        System.out.println();

        // Common temperature examples
        System.out.println("--- Common Temperature Examples ---");
        System.out.println("Water freezing: 0°C = 32°F");
        System.out.println("Water boiling: 100°C = 212°F");
        System.out.println("Normal body temperature: 37°C = 98.6°F");
        System.out.println("Room temperature: 20°C = 68°F");

        sc.close();
    }
}
