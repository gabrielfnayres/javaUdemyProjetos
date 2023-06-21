package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.println("Enter radius: ");
        double radius = input.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);

        input.close();

    }
}