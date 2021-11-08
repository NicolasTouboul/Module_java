package cours;

import java.util.Scanner;

public class Fonction {
    static double calculSomme(double nombre1,double nombre2){
        return nombre1+nombre2;
    }

    static double calculSurface(double rayon){
        return Math.pow(rayon,2) * Math.PI
;    }
    static double calculPerimetre(double longueur, double largeur){
        return calculSomme(longueur,largeur)*2;
    }

    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.println("Nombre 1 : ");
        double nb1=clavier.nextInt();
        System.out.println("Nombre 2 : ");
        double nb2=clavier.nextInt();
        double somme=calculSomme(nb1,nb2);
        System.out.printf("%f + %f = %f",nb1,nb2,somme);
    }
}
