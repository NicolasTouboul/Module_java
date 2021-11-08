package TP;


import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        System.out.printf("Quel âge avez vous ? ");
        age = input.nextInt();

        int today;
        System.out.printf("On est en quelle année ? ");
        today = input.nextInt();

        int annee = today - age;
        System.out.printf("Votre année de naissance : %d",annee);
    }
}
