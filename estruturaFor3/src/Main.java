import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        for (int i = 0;i<N;i++ ){

            double x = input.nextDouble();
            double y = input.nextDouble();
            double z = input.nextDouble();

            double media = (x * 2.0 + y * 3.0 + z * 5.0)/10.0;

            System.out.printf("%.1f%n", media);
        }

        input.close();



    }
}