import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        char resp;
        do {
            double celsius = input.nextDouble();
            double f = (9*celsius)/5 +32;

            System.out.printf("%.1f%n", f);

            System.out.println("Deseja repetir (s/n)?:");
            resp = input.next().charAt(0);
        } while (resp != 'n');
    }
}