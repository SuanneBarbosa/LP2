package agenda;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAcontecimentos {
    private List<Acontecimento> acontecimentos;

    public GerenciadorAcontecimentos() {
        acontecimentos = new ArrayList<>();
    }


    public void adicionarAcontecimento(Acontecimento acontecimento) {
        acontecimentos.add(acontecimento);
    }

    public void atualizarAcontecimento(int indice, Acontecimento novoAcontecimento) {
        if (indice >= 0 && indice < acontecimentos.size()) {
            acontecimentos.set(indice, novoAcontecimento);
        }
    }

    public void removerAcontecimento(int indice) {
        if (indice >= 0 && indice < acontecimentos.size()) {
            acontecimentos.remove(indice);
        }
    }

    public List<Acontecimento> consultarAcontecimentos() {
        return acontecimentos;
    }
}
