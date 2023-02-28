import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo;
        int quantidade;
        double total;

        System.out.println("Informe o código do produto e sua quantidade:");

        codigo = input.nextInt();
        quantidade = input.nextInt();

        if (codigo == 1) {
            total = (quantidade * 4.00);
            System.out.printf("TOTAL: %.2f%n",total);
        }
        if (codigo == 2) {
            total = (quantidade * 4.50);
            System.out.printf("TOTAL: %.2f%n",total);
        }
        if (codigo == 3) {
            total = (quantidade * 5.00);
            System.out.printf("TOTAL: %.2f%n",total);
        }
        if (codigo == 4) {
            total = (quantidade * 2.00);
            System.out.printf("TOTAL: %.2f%n",total);
        }
        if (codigo == 5) {
            total = (quantidade * 1.50);
            System.out.printf("TOTAL: %.2f%n",total);
        }
        else {
            System.out.println("Esse produto não existe ou não está disponível.");
        }



        input.close();


    }
}