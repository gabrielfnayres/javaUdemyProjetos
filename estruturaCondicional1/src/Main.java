import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x;

        System.out.println("Digite um número inteiro:");
        x = input.nextInt();

        if ( x >= 0) {
            System.out.println("É um número positivo");
        }
        else {
            System.out.println("É um número negativo");
        }
        input.close();
    }
}