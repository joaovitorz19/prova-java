// declaracao da classe Lampada
public class Lampada {

    // atributo que indica se a lampada esta acesa ou apagada
    private boolean acesa;

    // atributo que representa a potencia da lampada
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
        this.potencia = potencia;
    }

    // construtor que recebe o estado inicial
    // utiliza a potencia padrao de 60W
    public Lampada(boolean estadoInicial) {
        this.acesa = estadoInicial;
        this.potencia = 60;
    }

    // metodo que simula o interruptor da lampada
    public void interruptor() {

        // inverte o estado atual
        acesa = !acesa;

        // mostra o novo estado da lampada
        mostrarEstado();
    }

    // metodo que mostra o estado atual da lampada
    public void mostrarEstado() {

        if (acesa) {
            System.out.println("A lampada de " + potencia + "W esta ligada.");
        } else {
            System.out.println("A lampada de " + potencia + "W esta desligada.");
        }
    }

    // retorna o estado atual da lampada
    public boolean isAcesa() {
        return acesa;
    }

    // retorna a potencia da lampada
    public int getPotencia() {
        return potencia;
    }
}