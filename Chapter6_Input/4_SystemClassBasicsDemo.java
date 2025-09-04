package Chapter6_Input;
// 4_SystemClassBasicsDemo.java
// Demonstrates System.out, System.in, and displaying current time in Java

import java.util.Date;

class SystemClassBasicsDemo {
    public static void main(String[] args) {
        System.out.println("Hello from System.out!");
        System.out.println("Current time: " + new Date());
        // System.in is used for input (see Scanner examples)
    }
}
