package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Triangle X,Y;

        X = new Triangle();
        Y = new Triangle();

        System.out.println("Enter the measures of triangle X:");

        X.a = input.nextDouble();
        X.b = input.nextDouble();
        X.c = input.nextDouble();
        double pX = (X.a + X.b + X.c)/2;

        double areaX = Math.sqrt(pX*(pX - X.a)*(pX - X.b)*(pX - X.c));

        System.out.println("Enter the measures of triangle Y:");

        Y.a = input.nextDouble();
        Y.b = input.nextDouble();
        Y.c = input.nextDouble();
        double pY = (Y.a + Y.b + Y.c)/2;

        double areaY = Math.sqrt(pY*(pY - Y.a)*(pY - Y.b)*(pY - Y.c));

        System.out.println(areaX);
        System.out.println(areaY);

        if (areaY > areaX) {
            System.out.println("Y area is larger");
        }
        else {
            System.out.println("X area is larger");
        }

    }
}