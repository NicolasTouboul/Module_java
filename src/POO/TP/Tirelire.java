package POO.TP;

import java.util.Scanner;

public class Tirelire {

   private double montant;


    public double getMontant() {
        return montant;
    }



    public void afficher(){
        if(montant==0){
            System.out.println("Vous êtes le sans sou");
        }else {
            System.out.println("Vous avez "+montant+"€ dans votre tirelire");
        }

    }
    public void secouer(){
        if(montant!=0){
            System.out.println("Bing bing");
        }
    }
    public void remplir(double depot){
        if (depot>0){
            montant=montant+depot;
        }
    }



    public void vider(){
        montant=0;
    }

    public void puiser(double retrait){
        if (retrait < 0) {
            montant=montant;
        }else if (montant-retrait<=0){
            vider();
        }else{
            montant = montant-retrait;
        }


    }

    public double calculerSolde(double budget) {
        if (budget <= 0) {
            return montant;
        } else {
            return montant - budget;
        }
    }

    public void departEnVacance(double budget){
        if(calculerSolde(budget)>0){
            System.out.printf("Vous êtes assez riche pour partir en vacances ! Il vous restera "+ calculerSolde(budget)+"€ à la rentrée");
        }else{
            System.out.printf("Il vous manque "+ (budget-montant) +"€ pour partir en vacances");
        }
    }
}
class Main_3{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Tirelire montant =new Tirelire();
        montant.afficher();
        montant.afficher();
        System.out.printf("Montant à déposer: ");
        montant.remplir(input.nextDouble());
        montant.secouer();
        montant.afficher();
        System.out.printf("Montant à retirer: ");
        montant.puiser(input.nextDouble());
        montant.afficher();
        System.out.printf("Budget vacance: ");
        double budget = input.nextDouble();
        montant.departEnVacance(budget);


    }
}
