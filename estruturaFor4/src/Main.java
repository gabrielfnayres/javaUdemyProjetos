import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 0; i<N; i++) {

            int x = input.nextInt();
            int y = input.nextInt();

            if (y == 0 ) {
                System.out.println("divisão impossível");
            }
            else{
                double div = (double) x/y;
                System.out.printf("%.1f%n", div);
            }

        }
        input.close();
    }
}