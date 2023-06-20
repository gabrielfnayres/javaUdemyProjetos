import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int fat = 1;

        for (int i = 1;i <= N;i++){

            fat = fat * i;
        }
        System.out.println(fat);
    }

}