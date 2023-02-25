import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Coloque o dois números inteiros:");
        x = sc.nextInt();
        y = sc.nextInt();

       int  z = x + y;

        System.out.println("A soma dos números é "+ z);

        sc.close();
    }
}