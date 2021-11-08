package TP;
import java.util.Arrays;
import java.util.Scanner;

public class TP20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String texte_1;
        String texte_2;

        System.out.printf("Entrez un premier texte : ");
        texte_1 = input.nextLine();
        texte_1=texte_1.replaceAll("\\s","");
        char [] chars_1 = texte_1.toCharArray();

        System.out.printf("Entrez un deuxième texte : ");
        texte_2 = input.nextLine();
        texte_2=texte_2.replaceAll("\\s","");
        char [] chars_2 = texte_2.toCharArray();

        Arrays.sort(chars_1);
        Arrays.sort(chars_2);

       // System.out.println(Arrays.equals(chars_1,chars_2));

        if(Arrays.equals(chars_1,chars_2)){
            System.out.println("C'est un anagramme");
        }else{
            System.out.println("Ce n'est pas un anagramme");
        }
    }
}
