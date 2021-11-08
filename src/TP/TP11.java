package TP;

import java.util.Scanner;

public class TP11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nbr;
        int fact = 1;
        System.out.printf("Entrez un nombre : ");
        nbr = input.nextInt();
        for (int i=2; i<=nbr; i++){
            fact = fact*i;
        }
        System.out.printf("Le factorielle de %d est %d",nbr,fact);
    }
}
