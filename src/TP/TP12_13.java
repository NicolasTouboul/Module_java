package TP;

import java.util.Objects;
import java.util.Scanner;

public class TP12_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String login;
        String mdp;
        System.out.printf("Enregistrez une adresse mail : ");
        login = input.nextLine();
        System.out.printf("Enregistrez un mot de passe : ");
        mdp = input.nextLine();

        int tentativerest = 5;
        String logintent;
        System.out.printf("Entrez votre adresse mail : ");
        logintent = input.nextLine();

        String mdptent;
        System.out.printf("Entrez votre mot de passe : ");
        mdptent = input.nextLine();
        if (Objects.equals(login, logintent) && Objects.equals(mdp, mdptent)) {
            System.out.println("Bienvenue");
        } else{
            while (!Objects.equals(login, logintent) || !Objects.equals(mdp, mdptent)) {
                tentativerest = tentativerest - 1;
                System.out.printf("Erreur ! Il vous reste %d tentatives. Entrez une adresse mail et un mot de passe valide \n", tentativerest);
                System.out.printf("Adresse mail : ");
                logintent = input.nextLine();
                System.out.printf("Mot de passe : ");
                mdptent = input.nextLine();
                if (tentativerest == 1) {
                    System.out.println("Trop de mauvaises tentatives. Compte bloqué");
                    break;
                } else if (Objects.equals(login, logintent) && Objects.equals(mdp, mdptent)) {
                    System.out.println("Bienvenue");
                }
            }
        }
    }
        }



