package Lampada3;
// classe principal

public class Main {

    public static void main(String[] args){

        // cria uma lâmpada com valores padrão
        Lampada l1 = new Lampada();

        // define a potência para 150 
        l1.setPotencia(150);

        // exibe a potência atual
        System.out.println("Potencia: " + l1.getPotencia());

        // mostra estado inicial
        l1.mostrarEstado();

        // liga/desliga
        l1.interruptor();

        // mostra novo estado
        l1.mostrarEstado();

        System.out.println("----------------");

        // tenta definir potência inválida
        l1.setPotencia(5000);

        // mostra a potência 
        System.out.println("Potencia: " + l1.getPotencia());
    }
}