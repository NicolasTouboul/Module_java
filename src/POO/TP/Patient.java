package POO.TP;

import java.util.Scanner;

public class Patient {
    private int taille;
    private int poids;


    public void setTaille(int taille) {
        this.taille = taille;
    }


    public void setPoids(int poids) {
        this.poids = poids;
    }

    public double calculIMC() {
        return poids / Math.pow(taille / 100.0, 2);
    }

    public String afficher() {
        return "Vous pesez " + poids + "kg, vous faites " + taille + "cm, votre IMC est de " + calculIMC();
    }

}

class Main_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Patient patient = new Patient();
        System.out.printf("Entrez votre poids : ");
        patient.setPoids(input.nextInt());
        System.out.printf("Entrez votre taille : ");
        patient.setTaille(input.nextInt());

        System.out.printf(patient.afficher());

    }
}
