package operadores;

import java.util.Scanner;

public class NotaFrequencia {
    Scanner sc = new Scanner(System.in);

    public void calculate(){
        System.out.println("Informe a primeira nota: ");
        Double nota1 = sc.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();
        double mediaAluno = (nota1 + nota2) / 2;
        System.out.println("A sua média é de: " + mediaAluno);

        boolean mediaAprovada = mediaAluno>=50;
        System.out.println("O aluno está aprovado por nota? " + mediaAprovada);
        System.out.println("Informe a frequência do aluno: ");
        int FrequenciaAluno = sc.nextInt();
        boolean frequenciaAprovada = FrequenciaAluno>=75;
        System.out.println("O aluno está aprovado por frequência? " + frequenciaAprovada);

        boolean resultadoFinal = (mediaAprovada==true) && (frequenciaAprovada==true);
        System.out.println("O aluno está aprovado no curso? " + resultadoFinal);
    }
}
