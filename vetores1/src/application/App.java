package application;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            vect[i] = input.nextDouble();
        }

        double soma = 0;

        for (int i=0;i<n;i++) {
            soma += vect[i];
        }

        double avg = soma/n;

        System.out.println("Average: "+ avg);


        input.close();
    }
}
