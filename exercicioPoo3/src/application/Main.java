package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Result;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Result x = new Result();

        x.name = input.nextLine();
        x.grade1 = input.nextDouble();
        x.grade2 = input.nextDouble();
        x.grade3 = input.nextDouble();

        double finalGrade = x.finalGrade();
        double missingPoints = x.missingPoints();
        System.out.println("Final grade: "+finalGrade);

        if (finalGrade < 60.0) {
            System.out.println("FAILED");
            System.out.println("MISSING "+missingPoints+ " POINTS");
        }
        else {
            System.out.println("PASS");
        }





        input.close();
    }
}