// declaracao da classe principal
public class Main {

    // metodo principal do programa
    public static void main(String[] args) {

        // cria o primeiro patrocinador da equipe
        Patrocinador patrocinador1 = new Patrocinador("Shell", 5000000);

        // cria o segundo patrocinador da equipe
        Patrocinador patrocinador2 = new Patrocinador("Santander", 3000000);

        // cria um vetor contendo os patrocinadores da ferrari
        Patrocinador[] patrocinadoresFerrari = {
            patrocinador1,
            patrocinador2
        };

        // cria a equipe ferrari com nome, ano de fundacao e patrocinadores
        Equipe ferrari = new Equipe(
            "Ferrari",
            1929,
            patrocinadoresFerrari
        );

        // cria o piloto da equipe
        Piloto pilotoFerrari = new Piloto(
            "Charles Leclerc",
            26,
            "Monegasco"
        );

        // cria o carro de formula 1 com numero, posicao, equipe e piloto
        CarroF1 carroFerrari = new CarroF1(
            16,
            1,
            ferrari,
            pilotoFerrari
        );

        // exibe todas as informacoes do carro, piloto e equipe
        carroFerrari.exibir();
    }
}