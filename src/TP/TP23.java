package TP;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TP23 {
    public static void main(String[] args) {

        ArrayList<String> listeLangages=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.printf("Combien de langages voulez vous saisir ? ");
        int nbreLangage=input.nextInt();


        for(int i=0;i<nbreLangage;i++){
            System.out.printf("Entrez le langage numéro %d : ",(i+1));
            String langage= input.next();
            listeLangages.add(langage);
        }
        System.out.println(listeLangages);


        System.out.printf("Combien de langages voulez vous supprimer ? ");
        int nbrsupp=input.nextInt();

        System.out.printf("Quels langages voulez vous supprimer ? ");
        System.out.println(listeLangages);

        for(int j=0;j<listeLangages.size();j++){
            String supp = input.next();
            listeLangages.removeIf(langage -> Objects.equals(langage, supp));
        }


        System.out.println(listeLangages);

        }
    }

