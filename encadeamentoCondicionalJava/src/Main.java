import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int hora;

        System.out.println("Quantas horas?");

        hora = input.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        } else {
            if (hora < 18) {
                System.out.println("Boa tarde");
            } else {
                System.out.println("Boa noite");
            }
        }
        input.close();
    }
}
