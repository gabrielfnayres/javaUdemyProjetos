import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        int higher = max(x, y, z);
        showResult(higher);

        input.close();

    }

    public static int max(int a, int b, int c){
        int aux;
        if ( a > b && a >c){
            aux = a;
        }
        else if (b > c){
            aux = b;
        }
        else {
            aux = c;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher=" + value);
    }

}