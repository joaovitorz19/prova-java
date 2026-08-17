package Lampada3;

// declaracao da classe Lampada
public class Lampada {

    // indica se a lampada esta acesa ou apagada
    private boolean acesa;

    // armazena a potencia da lampada
    private int potencia;

    // construtor sem parametros
    // cria uma lampada apagada com potencia padrao de 60W
    public Lampada() {
        this.acesa = false;
        this.potencia = 60;
    }

    // construtor que recebe a potencia
    // cria uma lampada apagada com a potencia informada
    public Lampada(int potencia) {
        this.acesa = false;
        setPotencia(potencia);
    }

    // construtor que recebe o estado inicial
    // utiliza a potencia padrao de 60W
    public Lampada(boolean estadoInicial) {
        this.acesa = estadoInicial;
        this.potencia = 60;
    }

    // metodo que simula o interruptor da lampada
    public void interruptor() {

        // inverte o estado atual da lampada
        acesa = !acesa;

        // mostra o novo estado
        mostrarEstado();
    }

    // retorna a potencia atual da lampada
    public int getPotencia() {
        return potencia;
    }

    // altera a potencia da lampada com validacao
    public void setPotencia(int potencia) {

        // verifica se a potencia esta dentro do intervalo permitido
        if (potencia >= 1 && potencia <= 1000) {
            this.potencia = potencia;
        } else {
            System.out.println("Potencia invalida. Informe um valor entre 1W e 1000W.");
        }
    }

    // retorna se a lampada esta acesa
    public boolean isAcesa() {
        return acesa;
    }

    // mostra o estado atual da lampada
    public void mostrarEstado() {

        if (acesa) {
            System.out.println("A lampada de " + potencia + "W esta ligada.");
        } else {
            System.out.println("A lampada de " + potencia + "W esta desligada.");
        }
    }
}