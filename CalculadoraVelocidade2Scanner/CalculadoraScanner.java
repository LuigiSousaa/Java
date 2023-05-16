package CalculadoraVelocidade2Scanner;

import java.util.Scanner;

public class CalculadoraScanner {
    public void calcular(){
        Scanner sc = new Scanner(System.in);
 System.out.println("Informe a Distânica Percorrida");
 double distanciaPercorida = sc.nextDouble();
 System.out.println("A distâcia percorrida foi de " + distanciaPercorida +  "KM");
 System.out.println("Informe o tempo gasto na viagem ");
 double tempoGasto = sc.nextDouble();
 System.out.println("O tempo gasto da viagem foi de " + tempoGasto + "horas" ); 
 sc.close();
 double velocidadeMedia = distanciaPercorida/tempoGasto;
 System.out.println("A velocidade Média foi de " + velocidadeMedia + "km/h");
}
}
