// declaracao da classe piloto
public class Piloto {

    // atributo que armazena o nome do piloto
    private String nome;

    // atributo que armazena a idade do piloto
    private int idade;

    // atributo que armazena a nacionalidade do piloto
    private String nacionalidade;

    // construtor da classe piloto
    public Piloto(String nome, int idade, String nacionalidade) {

        // atribui o nome recebido ao atributo nome
        this.nome = nome;

        // atribui a idade recebida ao atributo idade
        this.idade = idade;

        // atribui a nacionalidade recebida ao atributo nacionalidade
        this.nacionalidade = nacionalidade;
    }

    // metodo para exibir os dados do piloto
    public void exibir() {

        // exibe o nome do piloto
        System.out.println("Piloto: " + nome);

        // exibe a idade do piloto
        System.out.println("Idade: " + idade);

        // exibe a nacionalidade do piloto
        System.out.println("Nacionalidade: " + nacionalidade);
    }
}