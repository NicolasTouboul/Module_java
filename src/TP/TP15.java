package TP;

import java.util.Scanner;

public class TP15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Veuillez entrer la taille du premier tableau : ");
        int taille_1 = input.nextInt();
        int matrice_1[]=new int [taille_1];
        int sum_1=0;

        System.out.printf("Veuillez entrer la taille du deuxième tableau : ");
        int taille_2 = input.nextInt();
        int matrice_2[]=new int [taille_2];
        int sum_2=0;

        System.out.printf("Veuillez entrer la taille du troisième tableau : ");
        int taille_3 = input.nextInt();
        int matrice_3[]=new int [taille_3];
        int sum_3=0;

        System.out.println("Veuillez entrer les valeurs du premier tableau : ");
        for(int i=0;i<matrice_1.length;i++){
            matrice_1[i]=input.nextInt();
        }
        System.out.print("Matrice 1 :[");
        for(int i=0;i<matrice_1.length;i++){
            System.out.printf("%d,",matrice_1[i]);
        }
        System.out.print("]");
        for (int val : matrice_1){
            if(val %3==0) {
                sum_1 += val;
            }
        }
        System.out.printf("la somme des éléments multiple de 3 de ce tableau vaut : %d",sum_1);


        System.out.printf("\n=========\n");

        System.out.println("Veuillez entrer les valeurs du deuxième tableau : ");
        for(int i=0;i<matrice_2.length;i++){
            matrice_2[i]=input.nextInt();
        }

        System.out.print("Matrice 2 :[");
        for(int i=0;i<matrice_2.length;i++){
            System.out.printf("%d |",matrice_2[i]);
        }
        System.out.print("]");

        for (int val : matrice_2) {
            if (val % 3 == 0) {
                sum_2 += val;
            }
        }
        System.out.printf("la somme des éléments multiple de 3 de ce tableau vaut : %d",sum_2);



        System.out.printf("\n=========\n");


        System.out.println("Veuillez entrer les valeurs du troisième tableau : ");
        for(int i=0;i<matrice_3.length;i++){
            matrice_3[i]=input.nextInt();
        }
        System.out.print("Matrice 3 :[");
        for(int i=0;i<matrice_3.length;i++){
            System.out.printf("%d |",matrice_3[i]);
        }
        System.out.print("]");

        for (int val : matrice_3) {
            if (val % 3 == 0) {
                sum_3 += val;
            }
        }
        System.out.printf("la somme des éléments multiple de 3 de ce tableau vaut : %d",sum_3);

        int total;
        total = sum_1 + sum_2 + sum_3;
        System.out.printf("la somme total des multiples de 3 de ce tableau vaut : %d",total);
    }

}
