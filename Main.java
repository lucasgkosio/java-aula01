import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        var catalogo = new ArrayList<Conteudo>();
        var scan = new Scanner(System.in);
        var JogoService = new JogoService();


        while (true) {
            System.out.println("""
                    Bem vindo ao sistema de gerenciamento de mídias!
                    Digite o conteudo que deseja gerenciar:
                    1- Jogos
                    2- Filmes
                    3- Series
                    """);
            var conteudoOpcao = scan.nextInt();
            if (conteudoOpcao == 1) {
                System.out.println("----------------------------------------------");
                System.out.println("""
                        Digite a opção desejada:
                        1 - Cadastrar novo jogo
                        2 - Listar jogos cadastrados
                        3 - Remover jogo
                        4 - Sair
                        """);

                var opcao = scan.nextInt();
                scan.nextLine();

                switch (opcao) {
                    case 1 -> JogoService.AdicionarJogo(scan, catalogo);
                    case 2 -> JogoService.ListarJogos(catalogo);
                    case 3 -> JogoService.RemoverJogo(scan, catalogo);
                    case 4 -> System.exit(0);
                    default -> System.out.println("Opção inválida!");
                }
            }
        }
    }
}