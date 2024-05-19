package iphone.system;

import iphone.apps.aparelhotelefonico;
import iphone.apps.navegadordeinternet;
import iphone.apps.reprodutormusical;

public class Iphone implements aparelhotelefonico, navegadordeinternet, reprodutormusical{
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }
    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    @Override
    public void atender() {
        System.out.println("Atendo telefone");
    }


    @Override
    public void tocar() {
        System.out.println("Tocando");
    }
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionado música");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }



    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }
}
