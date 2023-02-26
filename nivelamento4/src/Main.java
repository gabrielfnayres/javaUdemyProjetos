import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numero;
        double hora;
        double valor;

        System.out.println("Digite seu número, quantas horas trabalhou e qual o valor por hora:");

        numero = sc.nextInt();
        hora = sc.nextInt();
        valor = sc.nextDouble();

        double salario =  hora * valor;

        System.out.println("Esse é o seu número: " + numero);
        System.out.printf("Seu salário é: %.2f%n ", salario);

        sc.close();



    }
}