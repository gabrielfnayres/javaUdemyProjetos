import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int X;
        X = input.nextInt();
         for (int i = 1; i<X; i = i +2){
             System.out.println(i+";");
         }




        input.close();


    }
}