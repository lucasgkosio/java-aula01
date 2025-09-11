import entities.Conteudo;
import services.FilmeService;
import services.JogoService;

import java.util.ArrayList;
import java.util.Scanner;

import static utils.IOUtils.println;
import static utils.IOUtils.scanInt;

public class Main {
    public static void main(String[] args) {
        var catalogo = new ArrayList<Conteudo>();
        var scan = new Scanner(System.in);
        var JogoService = new JogoService();
        var filmeService = new FilmeService();


        while (true) {
            println(MENU_PRINCIPAL);
            var conteudoOpcao = scanInt(scan);

            switch (conteudoOpcao) {
                case 0 -> System.exit(0);
                case 1 -> {
                    var voltar = false;
                    while (!voltar) {

                        System.out.println("----------------------------------------------");
                        System.out.println(JogoService.MENU_JOGOS);

                        var opcao = scanInt(scan);

                        switch (opcao) {
                            case 1 -> JogoService.AdicionarJogo(scan, catalogo);
                            case 2 -> JogoService.ListarJogos(catalogo);
                            case 3 -> JogoService.RemoverJogo(scan, catalogo);
                            case 4 -> voltar = true;
                            default -> System.out.println("Opção inválida!");
                        }
                    }
                }
                case 2 -> {
                    var voltar = false;
                    while(!voltar) {

                        println("---------------------");
                        println(filmeService.MENU_FILME);

                        var opcao = scanInt(scan);
                        switch (opcao) {
                            case 4 -> voltar = true;
                            case 1 -> println("Cadastrar novo filme - Em contrução");
                            default -> println("Opção invalida");
                        }
                    }
                }
            }
        }
    }

    public static final String MENU_PRINCIPAL = """
            Bem vindo ao sistema de gerenciamento de mídias!
            Digite o conteudo que deseja gerenciar:
            0- Sair
            1- Jogos
            2- Filmes
            3- Series       
            """;
}