import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double preco = 34.5;
        double desconto;
       ///////////////////////////////////////////////////////////////



        double preco = 34.5;

        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.5;
                                                                    //Essa é a forma com if e else//
                                                                    //Fazer abaixo o modo ternário alternativo^//

        ////////////////////////////////////////////////////////////mesma coisa de formas diferentes



        if (preco <= 20.0) {
            desconto = preco * 0.1;
        }
        else {
            desconto = preco * 0.5;
        }



        input.close();
    }
}