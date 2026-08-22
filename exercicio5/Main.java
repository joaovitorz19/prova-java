package exercicio5;

public class Main {
    public static void main(String[] args){
        Livro livro = new Livro("Dom Casmurro");
        Periodico periodico = new Periodico("Revista de tecnologia",15);
        System.out.println("Livro:" + livro.gettitulo());
        System.out.println("Disponivel:" + livro.isDisponivel());

        livro.emprestar();
        System.out.println("Livro:" + livro.gettitulo());
        System.out.println("Disponivel:" + livro.isDisponivel());

        livro.devolver();
        System.out.println("Disponivel:" + livro.isDisponivel());
        System.out.println("-----------");

        System.out.println("Periodico :" + periodico.gettitulo());
        System.out.println("Volume :" + periodico.getNumeroVolume());
        

    }
}
