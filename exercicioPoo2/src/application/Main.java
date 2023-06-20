package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Employee x = new Employee();

        System.out.print("Name:");
        x.name = input.nextLine();
        System.out.println();
        System.out.print("Gross salary:");
        x.grossSalary = input.nextDouble();
        System.out.println();
        System.out.print("Tax: ");
        x.tax = input.nextDouble();

        System.out.println();
        System.out.println("Employee: " +x);
        System.out.println();
        System.out.println("Which percentage to increase salaray?");
        double percentage = input.nextDouble();
        x.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + x);

        input.close();


    }
}