package TP;

import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nom;
        System.out.printf("Veuillez entrer votre nom : ");
        nom = input.nextLine();

        String prenom;
        System.out.printf("Veuillez entrer votre prénom : ");
        prenom = input.nextLine();

        int age;
        System.out.printf("Veuillez entrer votre âge : ");
        age = input.nextInt();

        System.out.printf("Vous vous appelez %s %s, et vous avez %d ans",prenom,nom,age);

    }
}
