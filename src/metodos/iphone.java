package metodos;

import java.util.Scanner;

public class iphone implements aparelhoTelefonico, navegadorInternet, reprodutorMusical {

    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);

    @Override
    public void tocar() {
        System.out.println("Musica tocando");
    }

    @Override
    public void pausar() { 
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {   
        System.out.println("Digite a musica a ser reproduzida");
        musica = scanner.nextLine();
        System.out.println("Musica selecionada");
    }

    @Override
    public void atualizarPagina() {   
        System.out.println("Pagina atualizada");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void exibirPagina(String url) {
    System.out.println("Digite a url da aba a ser exibida");
    url = scanner.nextLine();
    System.out.println("A pagina foi exibida");
    }

    @Override
    public void ligar(String Numero) {
        System.out.println("Digite o numero que deseja ligar");
        Numero = scanner.nextLine();
        System.out.println("Ligacao realizada");
    }

    @Override
    public void atender() {
    System.out.println("Ligacao atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz ativo");
    }
    
}
