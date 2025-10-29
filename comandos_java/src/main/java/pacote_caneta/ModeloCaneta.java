package pacote_caneta;

public class ModeloCaneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //this = uma palavra-chave que se refere ao objeto que está executando o código,
    // e seu valor muda dependendo do contexto\\

    void rabiscar() {

        if(this.tampada == true){
            System.out.println("Erro ! A caneta está tampada");
        }else{
            System.out.println("Estou Rabiscando Meu Parceiro");
        }

    }

    void tampar(){
        this.tampada = false;
        System.out.println("Caneta Tampada!!!!");
    }

    void destampar(){
        this.tampada = true;
    }

    void desenhar() {
        if (this.tampada == false){
            if (this.carga >= 10){
                System.out.println("Desenhando!!");
            } else {
                System.out.println("Carga baixa!");
            }
        } else {
            System.out.println("A caneta esta tampada! Destampe para desenhar");
        }

    }

    void estado(){
        System.out.println("Esta caneta e do modelo " + this.modelo);
        System.out.println("Esta centa tem a cor " + this.cor);
        System.out.println("Esta caneta tem uma ponta " + this.ponta);
        System.out.println("Esta caneta esta com a carga em " + this.carga + "%");
        System.out.println("Esta caneta esta tampada ? " + this.tampada);

        //System.out.println("O total " + this.modelo  + this.cor  + this.ponta  + this.carga  + this.tampada);


    }



}
