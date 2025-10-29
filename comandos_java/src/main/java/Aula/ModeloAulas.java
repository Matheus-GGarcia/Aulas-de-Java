package Aula;

public class ModeloAulas {

        boolean Professor;
        boolean aluno;
        String materia;
        Boolean horario;
        String periodo;
        String Local;
        String curso;
        int TempoAula = 45;
        String TipoAula;



    void Iniciar(){
        if (horario && Professor) {
            System.out.println("Aula Iniciada");
        }else {
            System.out.println("Não esta na hora de começa ou falta o Professo");
        }
    }

    void Pausa(){
        if (periodo == "Tarde")
        {
            System.out.println("Hora do Intervalo");
        }else {
            System.out.println("Não e hora ainda");
        }
    }

    void Finaliza() {
        if (horario) {
            System.out.println("Não esta na hora de Sair");
        }else {
            System.out.println("Está na hora de acaba a aula");
        }
    }

    void Trocar_aluno(){
        aluno = false;
    }


    void Estado(){
        System.out.println("Professo dentro está na sala " + Professor);
        System.out.println("Tem Aluno dentro da sala " + aluno);
        System.out.println("A Materia Agora é " + materia);
        System.out.println("Perioda é " + periodo);
        System.out.println("A escola fica na : " + Local);
        System.out.println("O curso agora é de " + curso);
        System.out.println("Hoje o tipo de aula e  " + TipoAula);
    }
}


