import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i<=n; i++){
            int primeiro = i;
            int segundo = i*i;
            int terceiro = i*i*i;

            System.out.printf("%d %d %d%n",primeiro,segundo,terceiro);

        }
        input.close();
    }
}