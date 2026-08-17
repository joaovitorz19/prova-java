package Lampada3;
// declaração da classe Lampada
public class Lampada {

    // indica se a lâmpada está acesa ou apagada
    private boolean acesa;

    // potência da lâmpada 
    private int potencia;

    // construtor drm nrnhum parâmetro
    public Lampada() {
        this.acesa = false;
        this.potencia = 60;
    }

    // construtor com potência definida
    public Lampada(int potencia) {
        this.acesa = false;
        this.potencia = potencia;
    }

    // construtor com estado inicial
    public Lampada(boolean estadoInicial) {
        this.acesa = estadoInicial;
        this.potencia = 60;
    }

    // função que liga/desliga a lâmpada
    public void interruptor() {
        acesa = !acesa;

        if (acesa) {
            System.out.println("A lâmpada de " + potencia + " está ligada");
        } else {
            System.out.println("A lâmpada de " + potencia + " está desligada");
        }
    }

    // getter da potência,vai pegar o valor de um atributo
    public int getPotencia() {
        return potencia;
    }

    // setter da potência com validação,vai alterar o valor de um atributo.
    public void setPotencia(int potencia) {

        // vai verificar se a potência está em um intervalo válido
        if (potencia >= 1 && potencia <= 1000) {
            this.potencia = potencia; // CORREÇÃO AQUI
        } else {
            System.out.println("Potência inválida");
        }
    }

    // função que mostra o estado atual
    public void mostrarEstado() {
        if (acesa) {
            System.out.println("A lâmpada de " + potencia + " está ligada");
        } else {
            System.out.println("A lâmpada de " + potencia + " está desligada");
        }
    }
}