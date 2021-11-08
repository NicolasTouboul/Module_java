package TP;

import java.util.Scanner;

public class TP16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Veuillez entrer la taille du premier tableau : ");
        int taille= input.nextInt();
        int tableau[]=new int [taille];


        System.out.println("Veuillez entrer les valeurs du tableau : ");
        for(int i=0;i<tableau.length;i++){
            tableau[i]=input.nextInt();
        }
        int max=tableau[0];
        int min =tableau[0];

        for (int i = 0; i<tableau.length; i++){
            if(tableau[i] > max){
                max = tableau[i];
            }
        }
        System.out.println("La plus grande valeur est: " + max);

        for (int i = 0; i<tableau.length; i++){
            if(tableau[i] <= min){
                min = tableau[i];
            }
        }
        System.out.println("La plus petite valeur est: " + min);

        System.out.print("Tableau : [ ");
        for(int i = 0; i<tableau.length; i++){
            System.out.printf("%d ", tableau[i]);
        }
        System.out.printf("Tb : [%d",tableau[0]);
        if (tableau[0] == min){System.out.print("(PP)");}
        else if (tableau[0] == max){System.out.print("(PG)");}
        for (int i = 1; i<tableau.length; i++) {
            System.out.printf(", %d",tableau[i]);
            if (tableau[i] == min){System.out.print("(PP)");}
            else if (tableau[i] == max){System.out.print("(PG)");}
        }
    }



}
