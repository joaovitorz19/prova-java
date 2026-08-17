package exercicio2;

public class Main {
     public static void main (String[]args){
        Estudante estudante1 = new Estudante("João");
        Estudante estudante2 =new estudante("Maria");
     }
     System.out.println("Digite as notas de ") + estudante1.getNome());
     estudante1.insereNotas();

     System.out.println("\nDigite as notas de " + estudante2.getNome());
     estudante2.insereNotas();

     System.out.println("\n--- RESULTADOS ---");
     
     System.out.println ("ALuno:" + estudante1.getNome());
     System.out.println("Média" + estudante1.calculaMedia());
     System.out.println ("Menor nota:" + estudante1.menorNota());

     System.out.println();

     
}
