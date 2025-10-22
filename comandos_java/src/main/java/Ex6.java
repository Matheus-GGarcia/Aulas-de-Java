import java.util.Scanner;

public class Ex6 {
    //1\\
    public static void main (String args[]){


        float num1;
        float num2;

        Scanner total = new Scanner(System.in);
        System.out.println("Coloque o Primero numero");
        num1 = total.nextFloat();

        System.out.println("Coloque o segundo numero");
        num2 = total.nextFloat();


        float soma = (num1 + num2);
        float sub = (num1 - num2) ;
        float multi = (num1 * num2) ;
        float div = (num1 / num2) ;


        System.out.println("Seu Média final é " + soma);
        System.out.println("Seu Média final é " + sub);
        System.out.println("Seu Média final é " + multi);
        System.out.println("Seu Média final é " + div);






    }

}
