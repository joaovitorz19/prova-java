package exercicio5;

public class Main {
    public static void main(String[] args){
        Livro livro = new Livro("Dom Casmurro");
        Periodico periodico = new Periodico("Revista de tecnologia",15);
        System.out.println("Livro:" + livro.getTitulo());
        System.out.println("Disponivel:" + livro.isDisponivel());

        livro.empresta();
        System.out.println("Livro:" + livro.getTitulo());
        System.out.println("Disponivel:" + livro.isDisponivel());
        
    }
}
