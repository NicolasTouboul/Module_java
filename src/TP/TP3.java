package TP;

import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        System.out.printf("Entrez la première valeur a = ");
        a = input.nextInt();

        int b;
        System.out.printf("Entrez la deuxième valeur b = ");
        b = input.nextInt();

        int c;
        System.out.printf("Entrez la troisième valeur c = ");
        c = input.nextInt();



        System.out.printf("Les valeurs entrées sont a = %d, b = %d, c = %d\n",a,b,c);

        int inter = a;
        a=c;
        c=b;
        b=inter;

        System.out.printf("Les valeurs permutées sont a = %d, b = %d, c = %d",a,b,c);
    }
}
