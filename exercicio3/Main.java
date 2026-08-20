package exercicio3;

public class Main {
        public static void main(String[] args){
            Estudante[] estudantes = new Estudante[3];

        
            estudantes[0] = new Estudante("João");
            estudantes[1] = new Estudante("Maria");
            estudantes[2] = new Estudante("Pedro");

            for ( int i=0;i < estudantes.length; i++) {
                System.out.println(" \n Notas de " + estudantes[i].getNome());
                estudantes[i].insereNotas();
            }
       
        }
}
