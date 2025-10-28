import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
       int numero;
        int soma = 0;

        Scanner n = new Scanner(System.in);

        for (int i=1 ; i<=5; i++){
            System.out.println("Digite o numero " + i + " Numero inteiro");
            numero = n.nextInt();

            soma = soma + numero;
        }

        double media = soma / 5;
        System.out.println("A aritmetica é : " + media);
    }
}
