package Revisao;
import java.util.Scanner;

public class Rv01 {

    public static void main(String[] args) {

        float num1 ;
        float num2 ;


        Scanner n = new Scanner(System.in);

        System.out.println("escolha o primeiro numero");
        num1 = n.nextInt();

        System.out.println("escolha o segundo numero");
        num2 = n.nextInt();


        if (num1 > num2){
            System.out.println("O numero maior é :"  + num1 );
        }else if (num1 == num2){
            System.out.println("Os numeros são iguais");
        }else{
            System.out.println("Não é maior, o maior é o :" + num2);
        }

       //System.out.println("boa boa ");
    }
}
