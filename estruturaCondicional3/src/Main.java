import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x, y;

        System.out.println("Digite dois números:");
        x = input.nextInt();
        y = input.nextInt();

        if (y%x == 0 || x%y == 0 ) {
            System.out.println("São múltiplos");
        }
        else{
            System.out.println("Não são múltiplos");
        }
        input.close();
    }
}