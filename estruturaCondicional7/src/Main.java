import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double x;
        double y;

        System.out.println("Informe dois números:");
        x = input.nextDouble();
        y = input.nextDouble();

        if (x >= 1 && y >= 1) {
            System.out.println("Primeiro quadrante");
        }
        if (x <= (-1) && y >= 1) {
            System.out.println("Segundo quadrante");
        }
        if (x <= (-1) && y <= (-1)) {
            System.out.println("Terceiro quadrante");
        }
        if (x >= 1 && y <= -1) {
            System.out.println("Quarto quadrante");
        }
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }





        input.close();
    }
}