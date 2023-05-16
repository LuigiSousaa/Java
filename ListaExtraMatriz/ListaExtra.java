package ListaExtraMatriz;

import java.util.Random;
import java.util.Scanner;

public class ListaExtra {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("=====");
        System.out.println("Exercício 1");
        System.out.println(" ");
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");

        }
        System.out.println("=====");
        System.out.println(" ");
    }

    public void exercicio2() {

        System.out.println("=====");
        System.out.println("Exercício 2");
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
            System.out.println(" ");
        }
        int maior = 0;
        int posi[] = new int[2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] >= maior) {
                    maior = matriz[i][j];
                    posi[0] = i;
                    posi[1] = j;
                }
            }
        }
        System.out.println("O maior valor é: " + maior + " e sua posição é: " + pos[0] + "," + pos[1]);
        System.out.println("======");
        System.out.println(" ");
    }

    public void exercicio3() {
        System.out.println("=====");
        System.out.println("Exercício 3");
        System.out.println(" ");
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }

        System.out.println(" ");
        System.out.println("Digite um valor: ");
        int verificar = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == verificar) {
                    System.out.println("Valor foi encontrado na posição " + i + "," + j);
                } else {
                    System.out.println("Valor não encontrado na posição " + i + "," + j);
                }
            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public void exercicio4() {
        System.out.println("=====");
        System.out.println("Exercício 4");
        System.out.println("Não consegui =(");
    }

    public void exercicio5() {
        System.out.println("=====");
        System.out.println("Exercício 5");

        int matriz[][] = new int[5][4];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o n° da matrícula do " + (i + 1) + "° aluno:");
            int matricula = sc.nextInt();
            matriz[i][0] = matricula; 
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " "); 
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a média das provas da mxtricula " + matriz[i][0]);
            int mediaProvas = sc.nextInt();
            matriz[i][1] = mediaProvas;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a média dos trabalhos da mxtricula " + matriz[i][0]);
            int mediaTrabalhos = sc.nextInt();
            matriz[i][2] = mediaTrabalhos; 
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][3] = (matriz[i][2] + matriz[i][1]) / 2; 
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

        int maior = 0;
        int matriculaMaior = 0; 
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[j][3] > maior) {
                    maior = matriz[j][3];
                    matriculaMaior = matriz[j][0]; 
                }
            }
            System.out.println(
                    "O aluno que teve a maior nota foi a mtrícula " + matriculaMaior + " e sua nota foi: " + maior);
        }

        int mediaTodosAlunos = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                mediaTodosAlunos += matriz[j][3]; 
            }
            mediaTodosAlunos = mediaTodosAlunos / 5; 
        }
        System.out.println(" ");
        System.out.println("A média da nota final de todos os alunos é de " + mediaTodosAlunos);
        System.out.println("=====");
        System.out.println("");
    }

    public void exercicio6() {
        System.out.println("Exercício 6");
        int ma[][] = new int[3][3];
        int mab[][] = new int[3][3];
        int mac[][] = new int[3][3];



        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma[i].length; j++) {
                ma[i][j] = rd.nextInt(9);
            }
        }
        
        for (int i = 0; i < mab.length; i++) {
            for (int j = 0; j < mab[i].length; j++) {
                mab[i][j] = rd.nextInt(9);
            }
        }




        // cálculo da multiplicação de matrizes
        for (int i = 0; i < mab.length; i++) {
            for (int j = 0; j < mab[i].length; j++) {
                for (int k = 0; k < ma[i].length; k++) {
                    mab[i][j] += ma[i][k] * mab[k][j];
                }
            }
        }
        System.out.println("Matriz A:");
        for (int i = 0; i < ma.length; i++) {
            for (int j = 0; j < ma.length; j++) {
                System.out.print(ma[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz B:");
        for (int i = 0; i < mab.length; i++) {
            for (int j = 0; j < mab.length; j++) {
                System.out.print(mab[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz C:");
        for (int i = 0; i < mab.length; i++) {
            for (int j = 0; j < mab.length; j++) {
                System.out.print(mab[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}