import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N =  input.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i<N; i++) {

            int x = input.nextInt();

            if (x >= 10 && x <=20) {
                in = in+1;
            }
            else {
                out = out+1;
            }
        }
            System.out.println(in+" in");
            System.out.println(out+" out");


        input.close();
    }
}