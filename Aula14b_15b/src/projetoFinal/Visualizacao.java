package projetoFinal;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public  void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public  void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public  void avaliar(float porcent) {
        int nota = 0;
        if (porcent <= 20) {
            nota = 3;
        } else if (porcent <= 50) {
            nota = 5;
        } else if (porcent <= 90) {
            nota = 8;
        } else {
            nota = 10;
        }
        this.filme.setAvaliacao(nota);
    }

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() +1);
        this.filme.setViews(this.filme.getViews() +1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
