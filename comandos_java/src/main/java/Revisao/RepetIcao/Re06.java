package Revisao.RepetIcao;
import java.util.Scanner;

public class Re06 {

    public static void main(String[] args) {


        int QuantiPar=0;
        int QuantImpar=0;
        int i = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos numeros vc quer");
        int QuantidaNumeros = input.nextInt();

        while(i < QuantidaNumeros){

            int per = input.nextInt();

            i ++;
            if (per%2 == 0){
                QuantiPar +=1;
                System.out.println("Esse numero é Par" +  per);
            }else{
                QuantImpar += 1;
                System.out.println("Esse numero é Impar" +  per);
            }
            System.out.println("Desses "+ QuantiPar+" São Par" + " E " + QuantImpar + " Impar");

        }

    }
}
