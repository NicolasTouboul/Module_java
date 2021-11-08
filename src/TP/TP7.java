package TP;

import java.util.Scanner;

public class TP7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entrez un nombre : ");
        int nbr = input.nextInt();

        if(nbr>0 && nbr % 2 ==0){
            System.out.println("Le nombre est positif et pair");
        }else if(nbr<0 && nbr % 2 == 0){
            System.out.println("Le nombre est négatif et pair");
        }else if(nbr> 0 && nbr % 2 != 0){
            System.out.println("Le nombre est positif et impair");
        }else if(nbr < 0 && nbr % 2 != 0){
            System.out.println("Le nombre est négatif et impair");
        }else{
            System.out.println("Le nombre est zéro et il est pair");
        }
    }
}
