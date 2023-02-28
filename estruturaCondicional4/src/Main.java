import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x, y;
        int duracao;

        System.out.println("Informe o horário de início e de término da partida em horas:");
        x = input.nextInt();
        y = input.nextInt();

        if (x < y) {
            duracao = (y - x);
        }
        else{
            duracao = 24 - (y - x);
        }
        System.out.println("A partida durou: "+ duracao +" hora(s)");
        input.close();
    }
}