package TP;

import java.util.Scanner;

public class TP6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        System.out.printf("Entrez x = ");
        x = input.nextInt();

        int y;
        System.out.printf("Entrez y = ");
        y = input.nextInt();

        int inter = x;
        x=y;
        y=inter;

    }
}
