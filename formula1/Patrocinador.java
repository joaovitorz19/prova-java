// declaracao da classe patrocinador
public class Patrocinador {

    // atributo que armazena o nome do patrocinador
    private String nome;

    // atributo que armazena o valor do patrocinio
    private double valorPatrocinio;

    // construtor da classe patrocinador
    public Patrocinador(String nome, double valorPatrocinio) {

        // atribui o nome recebido ao atributo nome
        this.nome = nome;

        // atribui o valor recebido ao atributo valorpatrocinio
        this.valorPatrocinio = valorPatrocinio;
    }

    // metodo que retorna o nome do patrocinador
    public String getNome() {

        // retorna o nome do patrocinador
        return nome;
    }

    // metodo que retorna o valor do patrocinio
    public double getValorPatrocinio() {

        // retorna o valor do patrocinio
        return valorPatrocinio;
    }

    // metodo para exibir os dados do patrocinador
    public void exibir() {

        // exibe o nome e o valor do patrocinio
        System.out.println("Patrocinador: " + nome + " - Valor: " + valorPatrocinio);
    }
}