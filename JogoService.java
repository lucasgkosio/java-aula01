import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class JogoService {
    public void AdicionarJogo(Scanner scan, ArrayList<Conteudo> catalogo) {
        System.out.println("Digite o conteudo que deseja gerenciar:");
        var titulo = scan.nextLine();
        System.out.println("Digite a plataforma do jogo: ");
        var plataforma = scan.nextLine();
        System.out.println("Digite a data de lançamento do jogo (YYYY-MM-DD): ");
        var dataLancamento = scan.nextLine();

        var jogo = new Jogo();
        jogo.titulo = titulo;
        jogo.plataforma = plataforma;
        jogo.dataLancamento = LocalDate.parse(dataLancamento);

        catalogo.add(jogo);
        System.out.println("Jogo " + jogo.titulo + " cadastrado com sucesso!");
    }

    public void ListarJogos(ArrayList<Conteudo> catalogo) {
        System.out.println("Listando jogos cadastrados: ");
        var index = 1;
        for (var jogo : catalogo) {
            System.out.println(index + " - " + jogo);
            index++;
        }
    }
    public void RemoverJogo(Scanner scan, ArrayList<Conteudo> catalogo) {
        System.out.println("Digite o número do jogo que deseja remover:");
        var numJogo = scan.nextInt();
        scan.nextLine();
        catalogo.remove(numJogo - 1);
    }
}
