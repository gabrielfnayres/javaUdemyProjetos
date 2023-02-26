import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double a;
        double b;
        double c;

        System.out.println("Informe três números: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double pi = 3.14159;
        double areaT = (a * c)/2;
        double areaC = pi * Math.pow(c, 2);
        double areaTz = (a + b)*c/2;
        double areaQ = Math.pow(b, 2);
        double areaR = a * b;

        System.out.printf("TRIÂNGULO: %.3f%n", areaT);
        System.out.printf("CIRCULO: %.3f%n", areaC);
        System.out.printf("TRAPÉZIO: %.3f%n", areaTz);
        System.out.printf("QUADRADO: %.3f%n", areaQ);
        System.out.printf("RETÂNGULO: %.3f%n", areaR);

        sc.close();
    }
}