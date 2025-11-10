package Revisao;
import java.util.Scanner;

public class Rv04 {

    public static void main(String[] args) {
        int mes;
        String nomeMes;

        Scanner n = new Scanner(System.in);

        System.out.println("Selecione o mes: ");
        mes = n.nextInt();

        switch (mes){
            case 1: nomeMes = "Janeiro"; break;
            case 2: nomeMes = "Fevereiro"; break;
            case 3: nomeMes = "Marco"; break;
            case 4: nomeMes = "Abril"; break;
            case 5: nomeMes = "Maio"; break;
            case 6: nomeMes = "Junho"; break;
            case 7: nomeMes = "Julho"; break;
            case 8: nomeMes = "Agosto"; break;
            case 9: nomeMes = "Setembro"; break;
            case 10: nomeMes = "Outubro"; break;
            case 11: nomeMes = "Novembro"; break;
            case 12: nomeMes = "Dezembro"; break;
            default:nomeMes ="Mes Invalido";
        }

        System.out.println("O mes escolhido foi: " + nomeMes);
    }
}
