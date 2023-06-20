package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Product x;

        x = new Product();

        System.out.println("Enter product data");

        System.out.print("Name:");
        x.name = input.nextLine();
        System.out.print("Price:");
        x.price = input.nextDouble();
        System.out.print("Quantity in Stock:");
        x.quantity = input.nextInt();

        System.out.println();
        System.out.println("Enter the number of products to be added");
        int quantity = input.nextInt();
        x.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: "+ x);

        System.out.println();
        System.out.println("Enter the number of products do be removed");
        quantity = input.nextInt();
        x.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: "+ x);


        input.close();
    }
}