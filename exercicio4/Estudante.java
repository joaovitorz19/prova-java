package exercicio4;
import java.util.Scanner;

public class Estudante {
    private String nome;
    private double[] notas;

    public Estudante(String nome) {
        this.nome = nome;
        this.notas= new double[5];
    }
    public void insereNotas() {
        Scanner scanner = new Scanner(System.in);
        for(int i =0;i< notas.length; i++){
            System.out.print("Digite a nota" + (i+1) + ":");
            notas[i] = scanner.nextDouble();

        }
    }
    public double calculaMedia() {
        double soma=0;
        for(double nota : notas){
            soma +=nota;
        }
        return soma/ notas.length;
    }
public double calculaMedia(int[] pesos){
    double soma = 0;
    int somapesos =0;
    for(int i =0;i <notas.length;i++){
        soma =+ notas[i] * pesos[i];
      

    }
      return soma/ somapesos;
}
}
