package TP;

import java.util.ArrayList;
import java.util.Scanner;

public class TP24 {
    public static void main(String[] args) {
        ArrayList<Integer> listeNombre=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.print("Combien de nombres : ");
        int combienNombre=input.nextInt();

        for(int i=0;i<combienNombre;i++){
            System.out.printf("Entrez le nombre %d : ",(i+1));
            int nbr= input.nextInt();
            listeNombre.add(nbr);
        }
        System.out.println(listeNombre);

        System.out.print("Quel nombre à retirer : ");
        int supp=input.nextInt();
        for(int j=0; j<=combienNombre;j++){
            listeNombre.removeIf(nbr-> nbr == supp);
            }
        System.out.println(listeNombre);
        }

    }


