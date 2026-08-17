// declaracao da classe equipe
public class Equipe {

    // atributo que armazena o nome da equipe
    private String nome;

    // atributo que armazena o ano de fundacao da equipe
    private int anoFundacao;

    // vetor que armazena os patrocinadores da equipe
    private Patrocinador[] patrocinadores;

    // construtor da classe equipe
    public Equipe(String nome, int anoFundacao, Patrocinador[] patrocinadores) {

        // atribui o nome recebido ao atributo nome
        this.nome = nome;

        // atribui o ano de fundacao recebido ao atributo anofundacao
        this.anoFundacao = anoFundacao;

        // atribui os patrocinadores recebidos ao atributo patrocinadores
        this.patrocinadores = patrocinadores;
    }

    // metodo para exibir os dados da equipe
    public void exibir() {

        // exibe o nome da equipe
        System.out.println("Equipe: " + nome);

        // exibe o ano de fundacao da equipe
        System.out.println("Ano de fundação: " + anoFundacao);

        // exibe o titulo da lista de patrocinadores
        System.out.println("Patrocinadores:");

        // percorre o vetor de patrocinadores
        for (Patrocinador p : patrocinadores) {

            // chama o metodo para exibir os dados do patrocinador
            p.exibir();
        }
    }
}