import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X:");

        double aX = input.nextDouble();
        double bX = input.nextDouble();
        double cX = input.nextDouble();
        double pX = (aX + bX + cX)/2;

        double areaX = Math.sqrt(pX*(pX - aX)*(pX - bX)*(pX - cX));

        System.out.println("Enter the measures of triangle Y:");

        double aY = input.nextDouble();
        double bY = input.nextDouble();
        double cY = input.nextDouble();
        double pY = (aY + bY + cY)/2;

        double areaY = Math.sqrt(pY*(pY - aY)*(pY - bY)*(pY - cY));

        System.out.println(areaX);
        System.out.println(areaY);

        if (areaY > areaX) {
            System.out.println("Y area is larger");
        }
        else {
            System.out.println("X area is larger");
        }

    }
}