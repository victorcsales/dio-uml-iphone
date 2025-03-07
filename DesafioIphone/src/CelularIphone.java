import br.com.cursodiojava.app.Celular;

public class CelularIphone {
    public static void main(String[] args) {
        Celular iphone = new Celular();
        System.out.println("Funcionalidades do Telefone:");
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorrioVoz();
        System.out.println("\nFuncionalidades do Navegador:");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println("\nFuncionalidades de Musicas:");
        iphone.tocar();
        iphone.pause();
        iphone.selecionarMusica();
    }
}