// declara a classe Lampada
public class Lampada {

    // atributo que vai indicar se a lâmpada está acesa ou apagada 
    private boolean acesa;

    // atributo que representa a potência da lâmpada 
    private int potencia;

    // construtor sem parâmetros.
    // define a lâmpada como apagada e com potência de 60 w.
    public Lampada() {
        this.acesa = false;
        this.potencia = 60;
    }

    // construtor que recebe a potência como parâmetro
    // A lâmpada começa apagada, mas com a potência informada
    public Lampada(int potencia) {
        this.acesa = false;
        this.potencia = potencia;
    }

    // construtor que vai receber o estado inicial
    // define a potência padrão como 60W
    public Lampada(boolean estadoInicial) {
        this.acesa = estadoInicial;
        this.potencia = 60; // valor padrão
    }

    // função que simula o interruptor 
    public void interruptor() {

        // inverte o estado atual da lâmpada
        acesa = !acesa;

        // verifica o estado e informa  uma mensagem com a potência
        if (acesa) {
            System.out.println("A lâmpada de " + potencia + " está ligada");
        } else {
            System.out.println("A lâmpada de " + potencia + " está desligada");
        }
    }

    // função que mostra o estado atual da lâmpada sem alterar nada
    public void mostrarEstado() {

        // verifica se está acesa ou apagada e imprime a mensagem
        if (acesa) {
            System.out.println("A lâmpada de " + potencia + " está ligada");
        } else {
            System.out.println("A lâmpada de " + potencia + " está desligada");
        }
    }
}