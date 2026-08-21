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
    }

}
