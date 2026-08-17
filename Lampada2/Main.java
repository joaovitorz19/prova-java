// classe principal do programa
public class Main {

    // metodo principal
    public static void main(String[] args) {

        // cria uma lampada usando o construtor sem parametros
        // resultado: apagada e potencia de 60W
        Lampada l1 = new Lampada();

        // cria uma lampada com potencia definida de 100W
        // resultado: apagada e potencia de 100W
        Lampada l2 = new Lampada(100);

        // cria uma lampada com estado inicial ligado
        // resultado: acesa e potencia de 60W
        Lampada l3 = new Lampada(true);

        // testa a primeira lampada
        System.out.println("=== Lampada 1 ===");
        l1.mostrarEstado();
        l1.interruptor();

        System.out.println("----------------");

        // testa a segunda lampada
        System.out.println("=== Lampada 2 ===");
        l2.mostrarEstado();
        l2.interruptor();

        System.out.println("----------------");

        // testa a terceira lampada
        System.out.println("=== Lampada 3 ===");
        l3.mostrarEstado();
        l3.interruptor();
    }
}