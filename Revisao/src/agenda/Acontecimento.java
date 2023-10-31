package agenda;

class Acontecimento {
    private String titulo;
    private String dataHora;
    private boolean repetir;
    private String descricao;

    public Acontecimento(String titulo, String dataHora, boolean repetir, String descricao) {
        this.titulo = titulo;
        this.dataHora = dataHora;
        this.repetir = repetir;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public boolean isRepetir() {
        return repetir;
    }

    public void setRepetir(boolean repetir) {
        this.repetir = repetir;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\nData e Hora: " + dataHora + "\nRepetir: " + repetir + "\nDescrição: " + descricao;
    }
}
