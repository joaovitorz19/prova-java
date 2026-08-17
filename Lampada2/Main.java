
// classe main do programa
public class Main {

    // função principal
    public static void main(String[] args){

       // cria uma lâmpada usando o construtor sem parâmetro
       // resultado: apagada, potência = 60 w
       Lampada l1 = new Lampada();

       // Ccia uma lâmpada com potência definida de 100 w
       // resultado: apagada, potência = 100 w
       Lampada l2 = new Lampada(100);

       // cria uma lâmpada com estado inicial ligado (true)
       // resultado: acesa, potência = 60 w
       Lampada l3 = new Lampada(true);

       // mostra o estado inicial da lâmpada l1
       l1.mostrarEstado();

       // liga/desliga a lâmpada l1 (troca o estado)
       l1.interruptor();

     
       System.out.println("----------------");

       // mostra o estado inicial da lâmpada l2
       l2.mostrarEstado();

       // liga/desliga a lâmpada l2
       l2.interruptor();

    
       System.out.println("----------------");

       // mostra o estado inicial da lâmpada l3
       l3.mostrarEstado();

       // liga/desliga a lâmpada l3
       l3.interruptor();
    }
}