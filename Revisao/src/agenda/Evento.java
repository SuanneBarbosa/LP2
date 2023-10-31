package agenda;

public class Evento extends Acontecimento{
    private String dataHoraFinal;
    private String local;

    public Evento(String titulo, String dataHora, String dataHoraFinal, boolean repetir, String local, String descricao) {
        super(titulo, dataHora, repetir, descricao);
        this.dataHoraFinal = dataHoraFinal;
        this.local = local;
    }

    public String getDataHoraFinal() {
        return dataHoraFinal;
    }

    public void setDataHoraFinal(String dataHoraFinal) {
        this.dataHoraFinal = dataHoraFinal;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }


    @Override
    public String toString() {
        return super.toString() + "\nData e Hora Final: " + dataHoraFinal + "\nLocal: " + local;
    }
}

