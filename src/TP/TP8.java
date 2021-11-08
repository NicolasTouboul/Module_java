package TP;

import java.util.Scanner;

public class TP8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.printf("Entrez la première valeur a = ");
        a = input.nextInt();

        int b;
        System.out.printf("Entrez la deuxième valeur b = ");
        b = input.nextInt();

        int c;
        System.out.printf("Entrez la troisième valeur c = ");
        c = input.nextInt();

        double delta = Math.pow(b,2) - 4.0*a*c ;

        if(delta>0){
            double x1 = (-b - Math.sqrt(delta))/(2.0*a);
            double x2 = (-b + Math.sqrt(delta))/(2.0*a);
            System.out.printf("Les solutions sont : %f et %f",x1,x2);
        }else if (delta ==0){
            double x0= -b/(2.0*a);
            System.out.printf("La solution est %f",x0);
        }else {
            System.out.println("L'équation n'a pas de solution réelle");
        }

    }
}
