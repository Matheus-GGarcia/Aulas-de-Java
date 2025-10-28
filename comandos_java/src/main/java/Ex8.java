import java.util.Scanner;

public class Ex8 {

    //psvm = atalho para o public\\
    public static void main(String[] args){

        int numeroLanche;
        String Lanche;

        Scanner pedido = new Scanner(System.in);

        System.out.println("Digite o Numero do Lanche: " );
        numeroLanche = pedido.nextInt();

        switch (numeroLanche){

            case 1: Lanche= "X-Salada"; break;
            case 2: Lanche= "X-Bacon"; break;
            case 3: Lanche= "X-Tudo"; break;
            case 4: Lanche= "X-EGG"; break;
            case 5: Lanche= "X-Maluco"; break;
            default: Lanche = "Não temos esse lanche";
        }

        System.out.println("O lanche Escolhido foi: "  + Lanche + " Bom Apetite 😘👌");


    }
}
