package Lampada;
// Declaração da classe Lampada
public class Lampada {

    // atributo privado que indica se a lâmpada está acesa (true) ou apagada (false)
    private boolean acesa;
   
    // construtor da classe,  esse vai receber o estado inicial da lâmpada
    public Lampada(boolean estadoInicial) {
        acesa = estadoInicial; // Define o estado inicial da lâmpada
    }

    // Função que vai funcionar como um interruptor (liga/desliga)
    public void interruptor() {
        acesa = !acesa; // Inverte o estado atual (se estava ligada, desliga e vice-versa)

        // verifica o estado após a troca
        if (acesa) {
            System.out.println("A lampada esta acesa"); // mensagem se estiver ligada
        } else {
            System.out.println("A lampada está apagada"); // mensagem se estiver desligada
        }
    }

    // Função que verifica o estado atual da lâmpada
    public void estado() {
        if (acesa) {
            System.out.println("A lampada esta acesa"); // informa se está ligada
        } else {
            System.out.println("A lampada está apagada"); // informa se está desligada
        }
    }

    // Função que também exibe o estado da lâmpada 
    public void exibirEstado() {
        if (acesa) {
            System.out.println("A lampada esta acesa"); // informa se está ligada
        } else {
            System.out.println("A lampada esta apagada"); // informa se está desligada
        }
    }
}
