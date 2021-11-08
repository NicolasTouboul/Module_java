package TP;

import java.util.Scanner;

public class TP19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nombre;
        System.out.printf("Entrez un nombre : ");
        nombre = input.nextInt();
        int reverse = 0;

        while(nombre!=0){
            int reste = nombre % 10;
            reverse = reverse *10 + reste;
            nombre = nombre/10;
        }
        System.out.println("Le nombre à envers est : " + reverse);
    }
}
