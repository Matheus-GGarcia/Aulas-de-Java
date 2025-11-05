package Alura;

public class al2 {

    //Condicional//

    public static void main(String[] args) {

        int ano = 2022;
        boolean incluindonoPlano = true;
        double notadoFilme = 3.1;
        String tipoPlano = "plus";

        if( ano >= 2022){
            System.out.println("Lançamento que os clinete estão curtindo");
        }else {
            System.out.println("Filme retro que vale a pena assistir");
        }

        if(incluindonoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        }else{
            System.out.println("deve pagar a assinatura meu parceiro");
        }

    }
}
