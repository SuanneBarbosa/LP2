package agenda;

public class Lembrete extends Acontecimento{
    public Lembrete(String titulo, String dataHora, String descricao) {
        super(titulo, dataHora, false, descricao);
    }
}
