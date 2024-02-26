package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        String[] genero = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Altura da " + (i + 1) + "ª pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.println("Gênero da " + (i + 1) + "ª pessoa: ");
            genero[i] = sc.next();

        }

        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];
        double somaAlturasMulheres = 0;
        double mediaAlturasMulheres = 0;
        int numeroDeHomens = 0;
        int numeroDeMulheres =0;


        for (int i = 0; i < n; i++) {
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
        }
        System.out.printf("Menor altura = %f%n", menorAltura);

        for (int i = 0; i < n; i++) {
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
        }
        System.out.printf("Maior altura = %f%n", maiorAltura);

        for (int i = 0; i < n; i++) {
            somaAlturasMulheres += alturas[i];
            numeroDeMulheres++;

        }

        mediaAlturasMulheres = somaAlturasMulheres / numeroDeMulheres;

        System.out.printf("Media das alturas das mulheres = %f%n", mediaAlturasMulheres);

        for (int i = 0; i < n; i++) {
            if (genero[i].equalsIgnoreCase("m")) {
                numeroDeHomens++;
            }
        }
        System.out.printf("Numero de homens = %d", numeroDeHomens);
    }


}