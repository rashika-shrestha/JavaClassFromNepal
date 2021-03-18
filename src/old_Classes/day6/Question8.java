package old_Classes.day6;

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        fahrenHeitToCelsius(input);
        celsiusToFahrenheit(input);

    }

    public static void fahrenHeitToCelsius(Scanner input) {
        System.out.println("Please enter fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Fahrenheit to celsius is: " + celsius);
    }

    public static void celsiusToFahrenheit(Scanner input) {
        System.out.println("Please enter celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = celsius * (9 / 5) + 32;
        System.out.println("Celsius to fahrenheit is: " + fahrenheit);
    }
}
