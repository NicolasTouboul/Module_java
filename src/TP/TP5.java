package TP;

import java.util.Scanner;

public class TP5 {
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

        double x;
        System.out.printf("Entrez la variable x = ");
        x = input.nextDouble();

        double valeur = (((double)a+(double)b)/2) * Math.pow(x,3) + Math.pow((a+b),2) * Math.pow(x,2) + a + b + c;

        System.out.printf("La valeur du polynôme est : %f", valeur);
    }
}
