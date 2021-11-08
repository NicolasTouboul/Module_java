package POO.TP;

import java.util.Scanner;

public class Rectangle {

    private double longueur;
    private double largeur;


    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double calculPerimetre() {
        return 2 * (largeur + longueur);
    }

    public double calculAire() {
        return largeur * longueur;
    }

}

class Main_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.printf("Entrez la longueur : ");
        rectangle.setLongueur(input.nextDouble());
        System.out.printf("Entrez la largeur : ");
        rectangle.setLargeur(input.nextDouble());

        System.out.printf("Le rectangle a un perimètre de " + rectangle.calculPerimetre() + "cm et une aire de " + rectangle.calculAire() + "cm²");
    }

}
