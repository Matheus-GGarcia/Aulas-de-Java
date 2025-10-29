package pacote_caneta;

public class Caneta1 {
    public static void main(String[] args) {

        ModeloCaneta Caneta1 = new ModeloCaneta ();

        Caneta1.modelo="Bic Crystal";
        Caneta1.cor="Azul";
        Caneta1.ponta=0.5f;
        Caneta1.carga=10;
        Caneta1.tampada=true;

            //Caneta1.estado();
            //Caneta1.rabiscar();
            //Caneta1.destampar();
            //Caneta1.desenhar();
            Caneta1.tampar();
    }
}
