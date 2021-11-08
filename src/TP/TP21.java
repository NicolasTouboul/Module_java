package TP;

import java.util.Scanner;

public class TP21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String texte;
        System.out.printf("Entrez un premier texte : ");
        texte = input.nextLine();

        char[] modif = texte.toCharArray();
      //  modif[0]= Character.toUpperCase(modif[0]);

        for(int i = 0; i< modif.length; i++){
            if(i==0)
            {
                modif[0]= Character.toUpperCase(modif[0]);
            }else if(Character.isWhitespace(modif[i])){
                modif[i+1]= Character.toUpperCase(modif[i+1]);
            }
        }
        System.out.println(modif);
    }
}
