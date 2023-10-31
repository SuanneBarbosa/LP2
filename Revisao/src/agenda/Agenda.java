package agenda;

import java.util.List;

public class Agenda {
    public static void main(String[] args) {
        GerenciadorAcontecimentos gerenciador = new GerenciadorAcontecimentos();

        Evento evento1 = new Evento("Aniversário", "2023-10-29 15:00", "2023-10-29 17:00", true, "Casa", "Aniversário de João");
        Tarefa tarefa1 = new Tarefa("Compras", "2023-10-30 10:00", false, "Comprar mantimentos");
        Lembrete lembrete1 = new Lembrete("Reunião", "2023-11-01 14:00", "Reunião de equipe");

        gerenciador.adicionarAcontecimento(evento1);
        gerenciador.adicionarAcontecimento(tarefa1);
        gerenciador.adicionarAcontecimento(lembrete1);

        List<Acontecimento> acontecimentos = gerenciador.consultarAcontecimentos();
        for (Acontecimento acontecimento : acontecimentos) {
            System.out.println(acontecimento.toString());
            System.out.println("----------");
        }
    }
}
