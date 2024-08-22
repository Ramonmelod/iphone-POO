public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar() {
        System.out.println("Reproduzindo Musica");
    };

    public void selecionarMusica(String musica) {
        System.out.println("Música: " + musica + " selecionada");
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
        System.out.println("Abrindo a página: " + URL);
    };

    public void atualizarPagina() {
        System.out.println("Atualizando");
    };

    public void adicionarNovaAba() {
        System.out.println("");
    };

}
