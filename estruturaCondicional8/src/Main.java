import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double x;
        double imposto;

        System.out.println("Informe seu salário: ");
        x = input.nextDouble();

        if (x <= 2000) {
            System.out.println("Isento de imposto");
        } else if (x <= 3000) {
            imposto =  (x - 2000) * 0.08;
            System.out.println("IMPOSTO = "+imposto);
        } else if (x <= 4500) {
            imposto = (x - 3000) * 0.18 + 1000* 0.08;
            System.out.println("IMPOSTO = "+imposto);
        } else if (x >= 4500) {
            imposto = (x - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            System.out.println("IMPOSTO = "+imposto);
        }


        input.close();
    }
}