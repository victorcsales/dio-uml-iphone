package br.com.cursodiojava.app;
import br.com.cursodiojava.func.AparelhoTelefone;
import br.com.cursodiojava.func.NavegadorInternet;
import br.com.cursodiojava.func.ReproduzirMusica;

public class Celular implements ReproduzirMusica, AparelhoTelefone, NavegadorInternet {
    @Override
    public void ligar() {
        System.out.println("Fazendo uma Ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma Ligação");
    }

    @Override
    public void iniciarCorrioVoz() {
        System.out.println("Eviando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina do navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba do navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina do navegador");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar musica");
    }

    @Override
    public void pause() {
        System.out.println("Pausar musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar musica");
    }
}
