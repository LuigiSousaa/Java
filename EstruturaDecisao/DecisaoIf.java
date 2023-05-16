package EstruturaDecisao;

import java.util.Scanner;

public class DecisaoIf {
    public void desconto() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe o preço do produto:");
            double precoProduto = sc.nextDouble();
            double desconto = 0.0;
            if (precoProduto >= 100 && precoProduto < 200) {
                desconto = 5.0;
            }
            if (precoProduto >= 200 && precoProduto < 300) {
                desconto = 10.0;
            }
            if (precoProduto >= 300) {
                desconto = 15.0;
            }
            double valorDesconto = precoProduto * desconto / 100;
            double precoFinal = precoProduto - valorDesconto;
            System.out.println("O valor do produto é de R$ " + precoFinal);
        }

    }

    public void descontoIfElse() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe o preço do produto:");
            double precoProduto = sc.nextDouble();
            double desconto;
            if (precoProduto >= 300) {
                desconto = 15.0;
            } else if (precoProduto >= 200) {
                desconto = 10.0;
            } else if (precoProduto >= 100) {
                desconto = 5.0;
            } else {
                desconto = 0.0;
            }
            double valorDesconto = precoProduto * desconto / 100;
            double precoFinal = precoProduto - valorDesconto;
            System.out.println("O valor final do produto é de R$ " + precoFinal);
        }

    }
}
