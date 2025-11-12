import java.util.Scanner;

public class Ex11 {


        public static void main(String[] args) {

            int tabuada;


            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o Numero da Tabuada");
            tabuada = entrada.nextInt();

            for(int n=0; n <= 10; n ++){
                System.out.println(tabuada + " X " + n + " = " +(tabuada*n) );

            }



        }
}


