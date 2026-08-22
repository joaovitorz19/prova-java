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
        Estudante[] aprovados = Estudante.aprovados(estudantes);
        System.out.println("\n ---Aprovados ---");
        if(aprovados == null) {
            System.out.println("Nenhum estudante foi aprovado.");

        }
        else{
            for(int i=0; i< aprovados.length; i++){
                System.out.println(aprovados[i].getNome()
                + "- Média:"
                + aprovados[i].calculaMedia()
                );
            }
        }
        }
}
