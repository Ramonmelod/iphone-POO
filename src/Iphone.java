public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musica = null;
    private String url = null;

    public void selecionarMusica(String musica) {
        this.musica = musica;
        System.out.println("Música: " + musica + " selecionada");
    };

    public void tocar() {
        if (musica != null) {
            System.out.println("Reproduzindo: " + musica);
        } else {
            System.out.println("Nenhuma musica selecionada! Por favor selecione uma musica");
        }

    };

    public void pausar() {
        if (musica != null) {
            System.out.println("Pausando: " + musica);
        } else {
            System.out.println("Nenhuma musica tocando para ser pausada!");
        }
    };

    public void ligar(String numero) {
        System.out.println("Discando para: " + numero);
    };

    public void atender() {
        System.out.println("Atendendo ligação");
    };

    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo correio de voz");
    };

    public void exibirPagina(String url) {
        this.url = url;

        System.out.println("Abrindo a página: " + url);

    };

    public void atualizarPagina() {

        if (url != null) {
            System.out.println("Atualizando a página: " + url);
        } else {
            System.out.println("Ação não permitida - Sem página para atualizar");
        }
    };

    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada");
    };

}
