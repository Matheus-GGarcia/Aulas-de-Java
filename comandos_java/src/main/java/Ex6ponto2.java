import java.util.Scanner;

public class Ex6ponto2 {
    public static void main(String[] args) {
        float num1;
        float num2;
        String opa;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextFloat();

        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextFloat();

        System.out.print("Digite qual a operação (+, -, *, /): ");
        opa = entrada.next();

        if (opa.equals("+")) {
            float fimopera = num1 + num2;
            System.out.println("A soma dos números é: " + fimopera);
        } else if (opa.equals("-")) {
            float fimopera = num1 - num2;
            System.out.println("A subtração dos números é: " + fimopera);
        } else if (opa.equals("*")) {
            float fimopera = num1 * num2;
            System.out.println("A multiplicação dos números é: " + fimopera);
        } else if (opa.equals("/")) {
            if (num2 != 0) {
                float fimopera = num1 / num2;
                System.out.println("A divisão dos números é: " + fimopera);
            } else {
                System.out.println("Erro: divisão por zero!");
            }
        } else {
            System.out.println("Operação inválida!");
        }

        entrada.close();
    }
}

