package Lampada3;

// classe principal do programa
public class Main {

    // metodo principal
    public static void main(String[] args) {

        // cria uma lampada com valores padrao
        Lampada l1 = new Lampada();

        // define a potencia para 150W
        l1.setPotencia(150);

        // exibe a potencia atual
        System.out.println("Potencia: " + l1.getPotencia() + "W");

        // mostra o estado inicial da lampada
        l1.mostrarEstado();

        // altera o estado da lampada
        l1.interruptor();

        System.out.println("----------------");

        // tenta definir uma potencia invalida
        l1.setPotencia(5000);

        // mostra a potencia depois da tentativa
        System.out.println("Potencia atual: " + l1.getPotencia() + "W");

        // verifica se a lampada esta acesa
        System.out.println("Lampada acesa: " + l1.isAcesa());
    }
}