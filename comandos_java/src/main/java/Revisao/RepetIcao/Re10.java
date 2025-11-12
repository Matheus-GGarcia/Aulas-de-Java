package Revisao.RepetIcao;
import java.util.Scanner;

public class Re10 {
    public static void main(String[] args) {

        int e = 0;
        int somaNumeros;

        Scanner r = new Scanner(System.in);

        System.out.println("Digite o primeiro a Quantidade:");
        int QuantidaNumeros = r.nextInt();
        int soma = 0 ;

        do {

            System.out.println("Digite o Numero:");
            somaNumeros = r.nextInt();

            soma += somaNumeros;

            e++;

        }  while (e < QuantidaNumeros);

        System.out.println("A média dos numeros é" + soma/5);
        
    }
}
