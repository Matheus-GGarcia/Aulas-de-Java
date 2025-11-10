package Revisao;
import java.util.Scanner;
public class Rv03 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o seu peso (kg): ");
         float peso = entrada.nextFloat();

        System.out.print("Entre com a sua altura (m): ");
        float altura = entrada.nextFloat();

        float imc = peso / (altura * altura);



        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("Você está no peso ideal.");
        } else if (imc >= 25.0 && imc < 30.0) {
            System.out.println("Você está levemente acima do peso.");
        } else if (imc >= 30.0 && imc < 35.0) {
            System.out.println("Obesidade grau 1.");
        } else if (imc >= 35.0 && imc < 40.0) {
            System.out.println("Obesidade grau 2.");
        } else {
            System.out.println("Obesidade grau 3.");
        }

        entrada.close();
    }

}
