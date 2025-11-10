package Revisao;

import java.util.Scanner;

public class Rv06 {

    public static void main(String[] args) {

         int num;

        Scanner n = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 10");
        num = n.nextInt();

        int divisivel10 = num % 10;
        int divisivel5 = num % 5;
        int divisivel2 = num % 2;

        if(divisivel10 == 0){
            System.out.println("Esse numero é divisivel por 10:" );
        }else if(divisivel5 == 0){
            System.out.println("Esse numero é divisivel por 5:");
        } else if (divisivel2 == 0) {
            System.out.println("Esse numero é divisivel por 2:");
        }else{
            System.out.println("ERROOOOO");
        }



    }
}
