package TP;

import java.util.ArrayList;

public class TP25 {
    public static void main(String[] args) {
        ArrayList<String> adressesMail=new ArrayList<>();
        adressesMail.add("christian.lisangola@gmail.com");
        adressesMail.add("jean.paul@gmail.com");
        adressesMail.add("alain@gmail.com");
        adressesMail.add("lydie@yahoo.fr");
        adressesMail.add("josephine.lajoie@yahoo.com");
        adressesMail.add("luise@hotmail.fr");
        adressesMail.add("philemon.turion@gmail.com");
        adressesMail.add("jules.cesar@hotmail.fr");

        int comptGmail=0;
        int comptYahoo=0;
        int comptHotmail=0;

        for (int i =0; i<adressesMail.size(); i++){
            if (adressesMail.get(i).contains("gmail")){
                comptGmail = comptGmail +1;
            }
            else if (adressesMail.get(i).contains("yahoo")){
                comptYahoo = comptYahoo +1;
            }
            else if (adressesMail.get(i).contains("hotmail")){
                comptHotmail = comptHotmail +1;
            }
        }
        double tauxGmail = 100 *((double)comptGmail/adressesMail.size());
        double tauxYahoo = 100 *((double)comptYahoo/adressesMail.size());
        double tauxHotmail = 100 *((double)comptHotmail/adressesMail.size());

        System.out.println("Le taux d'adresse mail gmail est de "+ tauxGmail+"% \n");
        System.out.println("Le taux d'adresse mail yahoo est de "+ tauxYahoo+"% \n");
        System.out.println("Le taux d'adresse mail hotmail est de "+ tauxHotmail+"%");
    }
}
