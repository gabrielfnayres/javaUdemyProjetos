import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x;

        System.out.println("Digite um número");
        x = input.nextInt();

        if ( x%2 == 0 ) {
            System.out.println("É um número par");
        }
        else {
            System.out.println("É um número ímpar");
        }


        input.close();
    }
}