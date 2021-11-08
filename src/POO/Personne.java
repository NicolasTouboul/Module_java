package POO;

import java.util.Scanner;

public class Personne {
    String nom;
    String prenom;
    String pays;
    int age;
    boolean estMarie;
    int nombreEnfants;

    String nomComplet(){
        return prenom+" "+nom;
    }



    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPays() {
        return pays;
    }

    public int getAge() {
        return age;
    }

    public boolean isEstMarie() {
        return estMarie;
    }

    public int getNombreEnfants() {
        return nombreEnfants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEstMarie(boolean estMarie) {
        this.estMarie = estMarie;
    }

    public void setNombreEnfants(int nombreEnfants) {
        this.nombreEnfants = nombreEnfants;
    }
}


class Main {
    public static void main(String[] args) {
        Personne moi=new Personne();
        moi.setNom("Lisangola");
        moi.setPrenom("Christian");
        moi.setPays("Citoyen du Monde");
        moi.setEstMarie(false);
        moi.setNombreEnfants(0);
        System.out.println("Nom : "+moi.getNom());
        System.out.println("Prenom : "+moi.getPrenom());
        System.out.println("Nom complet : "+moi.nomComplet());
        System.out.println("Pays : "+moi.getPays());
        System.out.println("Est married : "+(moi.isEstMarie()?"Oui":"Non"));
        System.out.println("Enfants : "+moi.getNombreEnfants());

    }
}
