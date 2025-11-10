package Revisao;
import java.util.Scanner;

public class Rv05 {

    public static void main(String[] args) {
        int estrela;
        String nomeEstre;
        int Filme;
        String nomeFilme;


        Scanner n = new Scanner(System.in);
        System.out.println("Escolha o Filme");
        Filme = n.nextInt();

        System.out.println("Qual a sua nota Para o filme");
        estrela = n.nextInt();

        switch (Filme){
            case 1: nomeFilme = "Carros 1"; break;
            case 2: nomeFilme= "The House"; break;
            case 3: nomeFilme = "Carros 2"; break;
            case 4: nomeFilme = "Vingadores"; break;
            case 5: nomeFilme = "Tropa de Elite"; break;
            default: nomeFilme = "Nunhuma das anteriores";

        }
        switch (estrela){
            case 1: nomeEstre = "Pessimo!!!"; break;
            case 2: nomeEstre = "Ruimm"; break;
            case 3: nomeEstre = "Legalzinho"; break;
            case 4: nomeEstre = "Muito BOMM"; break;
            case 5: nomeEstre = "Execelenteeee"; break;
            default: nomeEstre = "Nunhuma das anteriores";
        }

        System.out.println( "Seu Filme Foi "+  nomeFilme + "Sua nota foi " + nomeEstre);
    }
}
