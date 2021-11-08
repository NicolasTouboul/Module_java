package TP;

import java.util.Scanner;

public class TP18 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String texte;
            System.out.printf("Entrez un texte : ");
            texte = input.nextLine();

            String reverse="";

            for (int i = texte.length() -1; i>=0; i--){
                reverse = reverse + texte.charAt(i);
            }
            System.out.printf("Le texte à l'envers est : %s \n",reverse);

            if(texte.equals(reverse)){
                System.out.println("Ce mot est un palindrome");
            }else{
                System.out.println("Ce n'est pas un palindrome");
            }
        }


}
