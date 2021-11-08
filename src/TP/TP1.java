package TP;

import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double diametre;
        System.out.print("Veuillez saisir le diamètre : ");
        diametre = input.nextDouble();

        double rayon = diametre/2;
        System.out.printf("Le rayon est de : %f\n",rayon);

        double surface= Math.pow(rayon,2)* Math.PI;
        System.out.printf("La surface est égale à : rayon² * PI = %f * %f * %f= %f",rayon,rayon,Math.PI,surface);
    }
}
