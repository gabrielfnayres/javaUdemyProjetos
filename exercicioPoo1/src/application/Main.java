package application;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input =  new Scanner(System.in);

        Rectangle x = new Rectangle();

        System.out.println("Enter rectangle width and height:");

        x.width = input.nextDouble();
        x.height = input.nextDouble();
        double area = x.area();
        double perimeter = x.perimeter();
        double diagonal = x.diagonal();

        System.out.println("Area "+ area);
        System.out.println("Perimeter "+perimeter);
        System.out.println("Diagonal "+diagonal);

        input.close();
    }
}