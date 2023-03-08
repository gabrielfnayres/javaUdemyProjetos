import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a senha:");

        int senha = input.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida! Digite outra senha:");
            senha = input.nextInt();
        }
        System.out.println("Acesso permitido :)");
        input.close();
    }
}