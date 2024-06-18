package metodos;

public class depurador {
    public static void main (String[] args) {
        iphone iphone = new iphone();

        iphone.ligar("");
        iphone.atender();
        iphone.iniciarCorreioVoz();

System.out.println(" ");
        iphone.selecionarMusica("");
        iphone.tocar();
        iphone.pausar();
        
System.out.println(" ");
        iphone.exibirPagina("");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

    }
}
