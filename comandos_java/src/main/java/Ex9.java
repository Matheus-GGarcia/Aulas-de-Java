import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        int prato;
        int sobremesa;
        int bebida;
        int caloriasPrato;
        int caloriasSobremesa;
        int caloriasBebida;
        int totalCalorias;
        String Nome;
        String Nome1;
        String Nome2;

        Scanner pedido = new Scanner(System.in);

        System.out.println("Digite o Prato:");
        prato = pedido.nextInt();

        switch (prato) {
            case 1: Nome = "Vegetariano"; caloriasPrato = 180; break;
            case 2: Nome = "Peixe"; caloriasPrato = 230; break;
            case 3: Nome = "Frango"; caloriasPrato = 250; break;
            case 4: Nome = "Carne"; caloriasPrato = 350; break;
            default: Nome = "Não tem"; caloriasPrato = 0;
        }


        System.out.println("Digite a sua Sobremesa:");
        sobremesa = pedido.nextInt();


        switch (sobremesa) {
            case 1: Nome1 = "Abacaxi"; caloriasSobremesa = 75; break;
            case 2: Nome1 = "Sorvete diet"; caloriasSobremesa = 110; break;
            case 3: Nome1 = "Mouse diet"; caloriasSobremesa = 170; break;
            case 4: Nome1 = "Mouse chocolate"; caloriasSobremesa = 200; break;
            default: Nome1 = "Não tem"; caloriasSobremesa = 0;
        }


        System.out.println("Digite sua Bebida");
        bebida = pedido.nextInt();


        switch (bebida) {
            case 1: Nome2 = "Chá"; caloriasBebida = 20; break;
            case 2: Nome2 = "Suco de Laranja"; caloriasBebida = 70; break;
            case 3: Nome2 = "Suco de Melão"; caloriasBebida = 100; break;
            case 4: Nome2 = "Refrigerante diet"; caloriasBebida = 65; break;
            default: Nome2 = "Não tem"; caloriasBebida = 0;
        }

        totalCalorias = caloriasPrato + caloriasSobremesa + caloriasBebida;

        System.out.println("O prato que você escolheu foi " + Nome +
                ", a sua sobremesa foi " + Nome1 +
                ", e a sua bebida é " + Nome2 + ".");
        System.out.println("Total de calorias da refeição: " + totalCalorias + " cal");

    }
}
