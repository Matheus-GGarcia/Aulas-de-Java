package Revisao.RepetIcao;
import java.util.Scanner;

public class Re04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite qualquer numero");

        int p = entrada.nextInt();

        if (p%2 ==0){
            System.out.println("Seu numero é par");

            System.out.println("\t");
        }else {
            System.out.println("È IMparrr");
        }

    }
}
