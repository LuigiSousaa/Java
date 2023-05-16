package Iteracaofor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);
    public void exemplo1() {
        for(int i=0; i<10; i++){
            System.out.println("O nº da iteração é "+i);
        }
    }
    public void exemplo2() {//carrinho de compra
        //vetor com os produtos
        double carrinhoCompra[] = new double[]{25.50, 55.90, 69.90, 95.75};
        double valorFinalCompra=0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinalCompra+=carrinhoCompra[i];       
        }
        System.out.println("O valor final da compra é R$ "+valorFinalCompra);
    }
}
