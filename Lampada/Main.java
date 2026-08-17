package Lampada;
// classe main  do programa

public class Main {

    // função principal
    public static void main(String[] args) {

        // cria um objeto da classe Lampada
        // o valor 'false' é para informar que a lâmpada começa apagada
        Lampada lampada = new Lampada(false);

        // mostra o estado atual da lâmpada 
        lampada.exibirEstado(); 

        // faz o interruptor ativar 
        lampada.interruptor();   

        // informa novamente o estado da lâmpada 
        lampada.exibirEstado(); 
    }
}
  