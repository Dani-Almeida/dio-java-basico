package equipamentos;

import equipamentos.aparelho.Iphone;
import equipamentos.funcionalidades.AparelhoTelefonico;
import equipamentos.funcionalidades.NavegadorInternet;
import equipamentos.funcionalidades.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        ReprodutorMusical ipod = iphone;
        AparelhoTelefonico celular = iphone;
        NavegadorInternet internet = iphone;

        System.out.println("=== REPRODUTOR MUSICAL ===");
        ipod.selecionarMusica("Numb");
        ipod.tocar();
        ipod.pausar();

        System.out.println("\n=== APARELHO TELEFÔNICO ===");
        celular.ligar("19 99999-9999");
        celular.atender();
        celular.iniciarCorreioVoz();

        System.out.println("\n=== NAVEGADOR NA INTERNET ===");
        internet.exibirPagina("https://www.dio.me");
        internet.adicionarNovaAba();
        internet.atualizarPagina();
    }
    
}
