package TP;

import java.util.Scanner;

public class TP9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mois;
        System.out.printf("Entrez un numéros entre 1 et 12 : ");
        mois = input.nextInt();

        if(mois==1){
            System.out.println("c'est le mois de janvier");
        }else if(mois == 2){
            System.out.println("c'est le mois de février");
        }else if(mois == 3){
            System.out.println("c'est le mois de mars");
        }else if(mois == 4){
            System.out.println("c'est le mois de avril");
        }else if(mois == 5){
            System.out.println("c'est le mois de mai");
        }else if(mois == 6){
            System.out.println("c'est le mois de juin");
        }else if(mois == 7){
            System.out.println("c'est le mois de juillet");
        }else if(mois == 8){
            System.out.println("c'est le mois de août");
        }else if(mois == 9){
            System.out.println("c'est le mois de septembre");
        }else if(mois == 10){
            System.out.println("c'est le mois de octobre");
        }else if(mois == 11){
            System.out.println("c'est le mois de novembre");
        }else if(mois == 12){
            System.out.println("c'est le mois de décembre");
        }else{
            System.out.println("Aucun mois ne correspond");
        }
    }
}
