package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number: ");
        int number = input.nextInt();
        System.out.println("Enter account holder: ");
        String holder = input.nextLine();
        System.out.println("Is there an initial deposit (y/n)?");
        String response = String.valueOf(input.next().charAt(0));

        if (response == "y") {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = input.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account data");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = input.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = input.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);


        input.close();
    }
}
