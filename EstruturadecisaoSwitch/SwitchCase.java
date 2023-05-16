package EstruturadecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);

    public void letra() {
        System.out.println("Digite sua letra");
        String letra = sc.nextLine();
        String tipoletra = "";
        switch (letra) {
            case "a":
                tipoletra = "vogal";
                break;
            case "e":
                tipoletra = "vogal";
                break;
            case "i":
                tipoletra = "vogal";
                break;
            case "o":
                tipoletra = "vogal";
                break;
            case "u":
                tipoletra = "vogal";
                break;

            default:
                tipoletra = "consoante";
                break;
        }
        System.out.println(letra + " sua letra é " + tipoletra);
    }

    public void mes() {
        System.out.println("Digite o número do mês");
        int numeroMes = sc.nextInt();
        String mes = "";
        switch (numeroMes) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;

            default:
                mes = "Este número não corresponde a nenhum mês";
                break;
        }
        System.out.println(numeroMes + " corresponde ao mês de " + mes);
    }
}
