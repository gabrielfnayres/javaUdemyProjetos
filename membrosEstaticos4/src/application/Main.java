package application;

import java.util.Locale;
import java.util.Scanner;

import dollar.CurrencyConverter;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("What is the dollar price? ");

        double priceDollar = input.nextDouble();


        System.out.println("How man dollars will be bought?");
        double amount = input.nextDouble();


        System.out.printf("Amount to be paid: %.2f%n", CurrencyConverter.realAmount(priceDollar,amount));


        input.close();
    }
}