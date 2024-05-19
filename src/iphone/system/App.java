package iphone.system;
public class App{
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        System.out.println("Aparelho telefonico");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();

        System.out.println("Navegador de internet");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("Reprodutor musical");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
