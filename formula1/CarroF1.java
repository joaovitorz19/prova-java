// declaracao da classe carrof1
public class CarroF1 {

    // atributo que armazena o numero do carro
    private int numero;

    // atributo que armazena a posicao do carro
    private int posicao;

    // atributo que armazena a equipe do carro
    private Equipe equipe;

    // atributo que armazena o piloto do carro
    private Piloto piloto;

    // construtor da classe carrof1
    public CarroF1(int numero, int posicao, Equipe equipe, Piloto piloto) {

        // atribui o numero recebido ao atributo numero
        this.numero = numero;

        // atribui a posicao recebida ao atributo posicao
        this.posicao = posicao;

        // atribui a equipe recebida ao atributo equipe
        this.equipe = equipe;

        // atribui o piloto recebido ao atributo piloto
        this.piloto = piloto;
    }

    // metodo para exibir os dados do carro
    public void exibir() {

        // exibe o numero do carro
        System.out.println("Número do carro: " + numero);

        // Exibe a posicao do carro
        System.out.println("Posição: " + posicao);

        // exibe os dados do piloto
        System.out.println("\nDados do piloto:");
        piloto.exibir();

        // Exibe os dados da equipe
        System.out.println("\nDados da equipe:");
        equipe.exibir();
    }
}