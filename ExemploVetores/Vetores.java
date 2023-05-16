package ExemploVetores;

public class Vetores {
    public void exemplo1() {
        double[] valores = new double[] { 10.5, 20.7, 30.6, 40.4 };
        System.out.println("1º Posição- Índice[0]: " + valores[0]);
        System.out.println("2º Posição- Índice[1]: " + valores[1]);
        System.out.println("3º Posição- Índice[2]: " + valores[2]);
        System.out.println("4º Posição- Índice[3]: " + valores[3]);
        valores[0] = 15.6;
        System.out.println("1º Posição- Índice[0]: " + valores);
    }

    public void exemplo2() {
        int[] novosValores = new int[5];
        novosValores[0] = 10;
        novosValores[1] = 20;
        novosValores[2] = 35;
        novosValores[3] = 67;
        novosValores[4] = 98;
        System.out.println("O vetor é : posiçao [0]= " + novosValores[0]);
        System.out.println("O vetor é : posiçao [1]= " + novosValores[1]);
        System.out.println("O vetor é : posiçao [2]= " + novosValores[2]);
        System.out.println("O vetor é : posiçao [3]= " + novosValores[3]);
        System.out.println("O vetor é : posiçao [4]= " + novosValores[4]);
    }
}
