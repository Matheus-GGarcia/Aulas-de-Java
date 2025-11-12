package Revisao.RepetIcao;
import java.util.Scanner;

public class Re09 {

    public static void main(String[] args) {

        int e;
        int somaNumeros;

        Scanner r = new Scanner(System.in);

        System.out.println("Digite o primeiro a Quantidade:");
        int QuantidaNumeros = r.nextInt();
        int soma = 0 ;

        for (e = 0; e < QuantidaNumeros; e++){

            System.out.println("Digite o Numero:");
            somaNumeros = r.nextInt();

            soma += somaNumeros;

        }
        System.out.println("A média dos numeros é" + soma/5);
    }
}
