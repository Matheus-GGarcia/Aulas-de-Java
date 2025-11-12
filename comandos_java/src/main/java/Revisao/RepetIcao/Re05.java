package Revisao.RepetIcao;
import java.util.Scanner;

public class Re05 {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Quantos numeros vc quer");
            int QuantidaNumeros = input.nextInt();

            int QuantiPar=0;
            int QuantImpar=0;

            for(int i = 0; i < QuantidaNumeros; i++){
                int per = input.nextInt();


                if (per%2 == 0){
                    QuantiPar +=1;
                }else{
                    QuantImpar += 1;
                }
            }

            System.out.println("Desses "+QuantiPar+" São Par" + " E " + QuantImpar + " Impar");
        }
    }




