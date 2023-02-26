import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo1, codigo2;
        double numeroDePecas1, numeroDePecas2;
        double valorDePecas1, valorDePecas2;

        System.out.print("Coloque o codigo da primeira peça: ");
        codigo1 = sc.nextInt();
        System.out.print("Informe o número de peças: ");
        numeroDePecas1 = sc.nextInt();
        System.out.print("Informe o valor da peça: ");
        valorDePecas1 = sc.nextDouble();
        System.out.print("Coloque o codigo da segunda peça: ");
        codigo2 = sc.nextInt();
        System.out.print("Informe o número de peças: ");
        numeroDePecas2 = sc.nextInt();
        System.out.print("Informe o valor da peça: ");
        valorDePecas2 = sc.nextDouble();

        double valorPagar = (valorDePecas1*numeroDePecas1) + (valorDePecas2*numeroDePecas2);

        System.out.printf("O valor a se pagar é: %.2f%n", valorPagar);



        sc.close();


    }
}