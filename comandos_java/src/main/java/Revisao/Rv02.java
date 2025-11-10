package Revisao;
import java.util.Scanner;

public class Rv02 {
    public static void main(String[] args) {



        int idade;
        String nacionalidade;

        System.out.println("Sistema para Votar");
        Scanner n = new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        idade = n.nextInt();

        System.out.println("Digite a sua nacionalidade ");
        nacionalidade = n.next();


        if (!nacionalidade.equalsIgnoreCase("BR")) {
            System.out.println("Você não pode votar pois não é brasileiro.");
        }
        else {

            if (idade < 16) {
                System.out.println("Você não pode votar ainda.");
            } else if (idade >= 18 && idade < 60) {
                System.out.println("Voto obrigatório.");
            } else {
                System.out.println("Voto opcional.");
            }

        }
    }
}
