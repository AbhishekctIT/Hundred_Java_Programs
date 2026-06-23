package toper_world;

import java.util.Scanner;

public class FahrenheitToCelsius_5 {
    public static void main(String[] args) {
        float fahrenheit;
        float celsius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter temperature in fahrenheit: ");
        fahrenheit = scanner.nextFloat();
        System.out.println("temperature in fahrenheit: " + fahrenheit);
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("temperature in celsius: " + celsius);
    }
}
