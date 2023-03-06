import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int minutos;

        System.out.println("Informe quantos minutos: ");
        minutos = input.nextInt();

        double valorTotal;

        if (minutos > 100){
            valorTotal = (minutos - 100) * 2;
            System.out.printf("total a pagar: %.2f%n", valorTotal);
         }
        else {
            System.out.println("total a pagar: 50");
        }



        input.close();
    }
}