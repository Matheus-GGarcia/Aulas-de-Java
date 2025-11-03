
package Teste_Banco;

import java.util.Random;
import java.util.Scanner;

public class Conta {

    int numeroConta;
    String titularConta;
    double saldo;


    Scanner entrada = new Scanner(System.in);


    public Conta (String nomeTitular , double saldoInicial) {

        this.titularConta = nomeTitular;
        this.saldo = saldoInicial;

        Random geradorNumero = new Random();
        numeroConta = geradorNumero.nextInt(1000); // Gerador randomico de numeros \\
    }

    public void verSaldo(){
        System.out.println("O numero da conta é: " + numeroConta);
        System.out.println("O nome do titular é :" + titularConta);
        System.out.println("O saldo da conta é:" + saldo);
    }

    public void Saque (double valorSaque){
        if(saldo >= valorSaque){
            saldo = saldo - valorSaque;
            System.out.println("Seu saldo atual :" + saldo);
        }else {
            System.out.println("Seu saldo insulficiente!");
        }
    }

    public void Depositar(double valorDeposito){
        if (valorDeposito <= 0){
            System.out.println("Deposito Invalido, valor menor que 0!");
        }else {
            saldo += valorDeposito; //saldo = saldo + valorDeposito\\
            System.out.println("Seu saldo agora de:" + saldo);
        }
    }
    public void iniciar(){
        int opcao;
        do{
            Exibirmenu();
            opcao = entrada.nextInt();
            EscolherFuncao(opcao);

        }while (opcao != 5);
    }
    public void Emprestimo(){
        if (this.saldo >= 1000 ){
            System.out.println("Digite o valor desejado:");
            int emprestimo = entrada.nextInt();
            System.out.println("Emprestimo de: " +  emprestimo + " Aprovado!!!");
        }else{
            System.out.println("Não Podemos te dar o Emprestimo");
        }

    }
    public void Exibirmenu(){
        System.out.println("Bem Vindo ao Banco Roubamos o seu Dinhero");
        System.out.println("Escolha sua Opcao");
        System.out.println("1 - ver saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Finalizar");
        System.out.println("5 - Imprestimo");

    }

    public void EscolherFuncao(int opcao){
        double saque;
        double deposito;

        switch(opcao){

            case 1: verSaldo();
            break;

            case 2:
                System.out.println("Digite o valor a ser sacado");
                saque = entrada.nextDouble();
                Saque(saque);
                break;

            case 3:
                System.out.println("Digite o valor a ser Depositado:");
                deposito = entrada.nextDouble();
                Depositar(deposito);
                break;

            case 4:
                System.out.println("Operação Finalizada");
                break;

            case 5:
                Emprestimo();
                break;


            default:
                System.out.println("Opção Inválida");
        }
    }
}
