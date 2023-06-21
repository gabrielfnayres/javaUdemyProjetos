package program;

import java.util.Locale;
import java.util.Scanner;

import encapsulation.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Encapsulation X = new Encapsulation();

        X.setName("Computer;-");
        X.setPrice(900);


    }
}