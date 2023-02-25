import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("Digite 4 números:");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int diferença = ((a*b) - (c*d));

        System.out.printf("A diferença dos produtos é: %d", diferença);

        sc.close();
    }
}