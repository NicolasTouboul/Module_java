package POO.TP;

public class Tirelire {
    double retrait;
    double depot;
    double montant;
    double budget;

    public double getMontant() {
        return montant;
    }
    public void afficher(){
        if(montant==0){
            System.out.printf("Vous êtes le sans sou");
        }else {
            System.out.printf("Vous avez "+montant+"€ dans votre tirelire");
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
        if (retrait<0 || montant-retrait<0){
            montant=0;
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
}
class Main_3{
    public static void main(String[] args) {

    }
}
