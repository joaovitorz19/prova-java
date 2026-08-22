package exercicio5;

public class Livro extends Publicacao {
    private boolean disponivel;

    public Livro(String titulo){
        super(titulo);
        this.disponivel =true;
    }
    public void emprestar(){
        if(disponivel) {
            disponivel =false;
            System.out.println("Livro emprestado com sucesso.");
        }
        else System.out.println("Livro já esta disnopivel.");
    }
    
   public void devolver(){
    if(!disponivel){
        disponivel = true;
        System.out.println("Livro devolvido com sucesso.");

    } 
    else{
        System.out.println("Livro já esta disponivel.");

    }
   }
   public boolean isDisponivel(){
    return disponivel;
   }
}
