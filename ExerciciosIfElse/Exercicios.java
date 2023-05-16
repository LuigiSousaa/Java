package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exe1() {
        System.out.println("Informe o primeiro valor: ");
        double valorUm = sc.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double valorDois = sc.nextDouble();
        if (valorUm > valorDois) {
            System.out.println(valorUm + " Este é o maior valor");
        } else if (valorDois > valorUm) {
            System.out.println(valorDois + " Este é o maior valor");
        } else {
            System.out.println("Os valores são iguais");
        }
    }

    public void exe2() {
        System.out.println("Digite o ano de nascimento: ");
        int data = sc.nextInt();
        if (data <= 2007) {
            System.out.println("Sim, pode votar esse ano!");
        } else {
            System.out.println("Ela não pode votar esse ano!");
        }
    }

    public void exe3() {
        System.out.println("Escreva sua senha: ");
        int senha = sc.nextInt();
        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }

    }

    public void exe4() {
        System.out.println("Quantas maçãs você quer comprar? ");
        int macas = sc.nextInt();
        double preco = 0.30;
        if (macas >= 12) {
            preco = 0.25;
        }
        double compra = macas * preco;
        System.out.println("O valor gasto será de R$" + compra);
    }

    public void exe5() {
        System.out.println("Digite o priemiro valor: ");
        int valorum = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valordois = sc.nextInt();
        System.out.println("Digite o terceiro valor:");
        int valortres = sc.nextInt();
        if (valorum < valordois && valordois < valortres) {
            System.out.println(valorum + " " + valordois + " " + valortres);

        } else if (valorum < valortres && valortres < valordois) {
            System.out.println(valorum + " " + valortres + " " + valordois);

        } else if (valordois < valortres && valortres < valorum) {
            System.out.println(valordois + " " + valortres + " " + valorum);

        } else if (valordois < valorum && valorum < valortres) {
            System.out.println(valordois + " " + valorum + " " + valortres);
        } else if (valortres < valorum && valorum < valordois) {
            System.out.println(valortres + " " + valorum + " " + valordois);

        } else if (valortres < valordois && valordois < valorum) {
            System.out.println(valortres + " " + valordois + " " + valorum);

        }

    }

    public void exe6() {
        System.out.println("Escreva a sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite 1 para masculino e 2 para feminino");
        int sexo = sc.nextInt();
        double pesoideal;
        if (sexo == 1) {
            pesoideal = (72.7 * altura) - 58;
            System.out.println("O seu peso ideal deve ser de: " + pesoideal + "KG");
        } else if (sexo == 2) {
            pesoideal = (62.1 * altura) - 44.7;
            System.out.println("O seu peso ideal deve ser de: " + pesoideal + "KG");
        }
    }

    public void exe7() {
        System.out.println("Digite a primeira nota: ");
        double notaum = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double notadois = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double notatres = sc.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double notaquatro = sc.nextDouble();
        double notafinal = (notaum + notadois + notatres + notaquatro) / 4;
        if (notafinal >= 5) {
            System.out.println("Você foi aprovado com a nota de " + notafinal);
        } else if (notafinal < 5) {
            System.out.println("Você foi reprovado com a nota de " + notafinal);
        }
        System.out.println("Faltas");
        double faltas = sc.nextDouble();
        double aulas = 100;
        double frequencia = (aulas - faltas) / 100;
        if (frequencia >= 0.75) {
            System.out.println("Aprovado. " + frequencia + "% de presença");
        } else {
            System.out.println("Reprovado. " + frequencia + "% de presença");
        }

    }
}
