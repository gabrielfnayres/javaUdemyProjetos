import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double x;

        System.out.println("Informe um valor: ");

        x = input.nextDouble();

        if (x >= 0 && x < 25) {
            System.out.println("Intervalo: [0,25]");
        }
        if (x >= 25 && x < 50) {
            System.out.println("Intervalo: [25,50]");
        }
        if (x >= 50 && x < 75) {
            System.out.println("Intervalo: [50,75]");
        }
        if (x >= 75 && x < 100) {
            System.out.println("Intervalo: [0,25]");
        }
        else {
            System.out.println("Fora do intervalo");
        }

        input.close();


    }
}