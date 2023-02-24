public class Main {
    public static void main(String[] args) {

        int a, b;                                //são variáveis inteiras portanto o resultado será inteiro//
        double resultado;

        a=5;
        b=2;

        resultado = (double) a / b;             // colocar (double) antes para que seja compilado ou (int) caso necessário// **isso é CASTING**

        System.out.println(resultado);
    }
}