package Matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo() {
        // declarar matriz
        int matriz[][] = new int[10][9]; // vetor de 2 dimensões
        // preencher a minha matriz
        for (int i = 0; i < 10; i++) { // referente a primeira dimensão
            for (int j = 0; j < 9; j++) { // refenrente a segunda dimensão
                matriz[i][j] = rd.nextInt(10); // preenche de forma aleatória
            }
        }
        // imprimindo os elementos da matriz individualmente
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("matriz[" + i + "][" + j + "]=" + matriz[i][j]);
            }
        }
        // imprimindo e formato de matriz
        for (int i = 0; i < 10; i++) {
            System.out.print("|");
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }
        int somaLinha = 0;
        int somaColuna = 0;
        for (int i = 0; i < 9; i++) {
            somaLinha += matriz[3][i];
        }
        for (int i = 0; i < 10; i++) {
            somaColuna += matriz[i][3];
        }
        System.out.println(somaColuna);
        System.out.println("");
        System.out.println(somaLinha);
    }

    public void exercicio1() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == i) {
                    matriz[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void exercicio2() {
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("=======");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
    }

    public void exercicio3() {
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        System.out.println("A soma é " + soma);
    }
}