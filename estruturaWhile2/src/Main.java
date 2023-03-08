import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x, y;

        x = input.nextInt();
        y = input.nextInt();




        while ( x != 0 && y != 0) {



            if (x >= 1 && y >= 1) {
                System.out.println("Primeiro");
            }
            else if (x <= (-1) && y >= 1) {
                System.out.println("Segundo");
            }
            else if (x <= (-1) && y <= 1) {
                System.out.println("Terceiro");
            }
            else if (x >=1 && y <= (-1)) {
                System.out.println("Quarto");
            }

            x = input.nextInt();
            y = input.nextInt();




        }



        input.close();
    }
}