package Iteracaofor;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor "+i);
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor["+i+"]="+vetor[i]);
        }
    }
    public void exercicio2() {
        double vetor[]=new double [10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor["+i+"]=");
            vetor[i]=sc.nextDouble();
        }
        System.out.println("====================");
        for (int i = vetor.length-1;i>=0;i--){
            System.out.println("vetor["+i+"]="+vetor[i]);
        }
    }
    public void exercicio3() {
        //criar um vetor para guardar as notas
        double notas[]= new double[4];//{nota[0],nota[1],notas[2],nota[3]}
        //preencher o vetor com as notas digitadas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota "+(i+1)+" do aluno");
            notas[i]=sc.nextDouble();
        }
        //mostrar as notas e calcular a média
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota "+(i+1)+"="+notas[i]);
            media+=notas[i]; //acumular o valor das notas do vetor
        }
        //dividir a média pelo nº de notas do vetor
        media/=notas.length;
        System.out.println("A média do aluno é "+media);
    }
    public void exercicio4() {
        //criar um vetor de 10 carcateres
        String letras[] = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        //percorrer (ler um por por um) o vetor para achar as consoantes
        int cont=0;
        for (int i = 0; i < letras.length; i++) {
            //tomada de decisão: vogal ou consoante
            if (letras[i]=="a" && letras[i]!="e" && letras[i]!="i" && letras[i]!="o" && letras[i]!="u") {
                System.out.println(letras[i]+" é consoante");
                cont++;
            }
        }
        //mostrar o número de consoantes
        System.out.println("O número de consoantes é"+ cont);

    }
    public void exercicio4bonus() {
        //Usuário irá digitar a palavra
        System.out.println("Digite uma palavra");
        String letras = sc.next();
        letras = letras.toLowerCase();
        //percorrer (ler um por por um) o vetor para achar as consoantes
        int cont=0; //contador para consoantes
        for (int i = 0; i < letras.length(); i++) {
            char c = letras.charAt(i); 
            //tomada de decisão: vogal ou consoante
            if (c !='a' && c !='e' && c !='i' && c !='o' && c !='u') {
                System.out.println(c +" é consoante");
                cont++;
            }
        }
        //mostrar o número de consoantes
        System.out.println("O número de consoantes é"+ cont);

    }
    public void exercicio5() {
        int vetorNumeros[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int contPar=0;
        int contImpar=0;
        //percorrer o meu vetor e conta os meus números pares e ímpares
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i]/2==0) {
                contPar++;
            }
            else{
                contImpar++;
            }
        }
        int nPar[]=new int[contPar];
        int nImpar[]=new int[contImpar];
        //distribuir os nº nos vetores pares e ímpares
        contPar=0;
        contImpar=0;
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i]%2==0) {
                nPar[contPar]=vetorNumeros[i];
                contPar++;
            }
            else{
                nImpar[contImpar]=vetorNumeros[i];
                contImpar++;
            }
        }
        //imprimindo os vetores
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Vetor["+i+"]="+vetorNumeros);
        }
        for (int i = 0; i < nPar.length; i++) {
            System.out.println("VetorPar["+i+"]="+nPar);
        }
        for (int i = 0; i < nImpar.length; i++) {
            System.out.println("VetorImpar["+i+"]="+nImpar);
        }
    }
    public void exercicio5GB() {
        int numeros[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int nPar[] = new int[numeros.length];
        int nImpar[] = new int[numeros.length];
    }
    public void exercicio6() {
        
    }
}




