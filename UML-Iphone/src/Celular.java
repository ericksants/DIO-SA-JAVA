
// Interface para um Reprodutor de Música
interface ReprodutorMusical {
    void tocar(String justinTimberlake);
    void pausar();
    void selecionarMusica();
    void avancarMusica();
    void retrocederMusica();
}

// Interface para um Aparelho Telefônico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender(String numero);
    void iniciarCorreioVoz();
    void encerrarChamada();
}

// Interface para um Navegador na Internet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
    void fecharSite();
}

// Classe iPhone que implementa os papéis das interfaces acima
class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar(String faixa) {
        // Implementação da reprodução de música
        System.out.println("Tocando " + faixa);
    }
    @Override
    public void pausar() {
        // Implementação da pausa de música
    }
    @Override
    public void selecionarMusica() {
        // Implementação da pausa de música
    }
    @Override
    public void avancarMusica() {
        // Implementação do avanço de música
    }
    @Override
    public void retrocederMusica() {
        // Implementação do retrocesso de música
    }
    @Override
    public void ligar(String numero) {
        // Implementação da realização de chamada
        System.out.println("ligando para: " + numero);
    }
    @Override
    public void atender(String numero) {
        // Implementação do recebimento de chamada
    }
    @Override
    public void iniciarCorreioVoz() {
        // Implementação do recebimento de chamada
    }
    @Override
    public void encerrarChamada() {
        // Implementação da finalização de chamada
    }
    @Override
    public void exibirPagina(String url) {
        // Implementação da abertura de site
        System.out.println("Carregando a Pagina " + url);
    }
    @Override
    public void adicionarNovaAba() {
        // Implementação da abertura de site
    }
    @Override
    public void atualizarPagina() {
        // Implementação da abertura de site
    }
    @Override
    public void fecharSite() {
        // Implementação do fechamento de site
    }

}

public class Celular {
    public static void main(String[] args) {
        // Crie uma instância de iPhone
        IPhone iphone = new IPhone();

        // Exemplos de uso das funcionalidades
        iphone.tocar("Justin Timberlake - Mirrors");
        iphone.ligar("123456789");
        iphone.exibirPagina("https://www.example.com");
    }
}
