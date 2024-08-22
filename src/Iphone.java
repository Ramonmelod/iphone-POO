public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musica = null;
    private String URL = null;

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
        System.out.println("Pause");
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

    public void exibirPagina(String URL) {
        this.URL = URL;

        System.out.println("Abrindo a página: " + URL);

    };

    public void atualizarPagina() {

        if (URL != null) {
            System.out.println("Atualizando a página: " + URL);
        } else {
            System.out.println("Ação não permitida - Sem página para atualizar");
        }
    };

    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada");
    };

}
