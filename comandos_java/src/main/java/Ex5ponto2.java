import java.util.Scanner;

public class Ex5ponto2 {

    public static void main (String args[]){

        float num1;
        float num2;
        float num3;
        float num4;


        Scanner total = new Scanner(System.in);
        System.out.println("Coloque sua Primeira nota:");
        num1 = total.nextFloat();

        System.out.println("Coloque sua Segunda nota:");
        num2 = total.nextFloat();

        System.out.println("Coloque sua Terceira nota:");
        num3 = total.nextFloat();

        System.out.println("Coloque sua Quarta nota:");
        num4 = total.nextFloat();

        float media = (num1 + num2 + num3 + num4) /4 ;

        System.out.println("Seu Média final é " + media);

        if(media >= 6){
            System.out.println("Você está aprovado " + media);
        }else if(media >= 5){
            System.out.println("Voce está de recuperação " + media);
        }else{
            System.out.println("Sua Nota é Vermelha " + media);
        }
    }
}
