package exercicio3;

import java.util.Scanner;

public class Estudante {
    private String nome;
    private double[] notas;
  public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
    }

    
    public void insereNotas() {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
    }

   
    public double calculaMedia() {

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }
        public static Estudante[] aprovados(Estudante[] estudantes) {
        int quantidadeAprovados = 0;
       
        for(int i =0; i<estudantes.length; i++){
            if(estudantes[i].calculaMedia() >= 6){
                quantidadeAprovados ++;
            }
        }
        if(quantidadeAprovados ==0){
            return null;
        }
        Estudante[] aprovados = new Estudante[quantidadeAprovados];

        int posicao =0;
  for(int i=0; i<estudantes.length; i++){
    if(estudantes[i].calculaMedia() >=6){
        aprovados[posicao] = estudantes[i];
        posicao ++;
    }
  }
}
