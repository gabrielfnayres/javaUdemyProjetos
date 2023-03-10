import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = input.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool = alcool + 1;
            }
            else if (tipo == 2) {
                gasolina += 1;
            }
            else if (tipo == 3) {
                diesel += 1;
            }
            tipo = input.nextInt();
        }
        System.out.println("Muito Obrigado!");
        System.out.println("Álcool: " +alcool );
        System.out.println("Gasolina: " +gasolina);
        System.out.println("Diesel: " +diesel);

        input.close();
    }
}