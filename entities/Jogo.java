package entities;

import java.time.LocalDate;

public class Jogo extends Conteudo {
    public String titulo;
    public String plataforma;
    public LocalDate dataLancamento;

    @Override
    public String toString() {
        return "entities.Jogo{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", dataLancamento=" + dataLancamento +
                '}';
    }
}
