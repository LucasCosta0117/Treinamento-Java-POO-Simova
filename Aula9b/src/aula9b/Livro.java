package aula9b;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totPag=" + totPag +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", leitor=" + leitor.getNome() +
                ", leitor=" + leitor.getSexo() +
                '}';
    }

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPag) {
            this.pagAtual = this.totPag;
            System.out.println("AVISO: Você folheou todo livro, o máximo de páginas é " + this.totPag);
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
