package cours;

import java.util.Scanner;

public class LectureClavier {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String nom;
        System.out.print("Votre nom : ");
        nom = keyboard.nextLine();

        System.out.print("Votre age : ");
        int age = keyboard.nextInt();

        System.out.print("Votre genre : ");
        char genre = keyboard.next().charAt(0);

        System.out.print("Votre poids : ");
        double poids = keyboard.nextDouble();

        System.out.print("Etes-vous marié(e)s : ");
        boolean estMarie=keyboard.nextBoolean();

        System.out.printf("Nom complet : %s\n",nom);
        System.out.printf("Age : %d\n",age);
        System.out.printf("Etat marital %s: \n",estMarie?"Marié":"Célibataie");
        System.out.printf("Genre : %c\n",genre);
        System.out.printf("Poids : %f\n",poids);
    }
}
