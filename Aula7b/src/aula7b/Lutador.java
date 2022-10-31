package aula7b;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    //Métodos personalizados
    public void apresentar() {
        System.out.println("CHEGOU A HORA! Apresentamos o lutador"+ this.getNome() + "\n"
                + "Diretamente de " + this.getNacionalidade() + "\n"
                + "com "+ this.getIdade() + " anos e " + this.getAltura() + "m de altura!" + "\n"
                + "pesando "+ this.getPeso() + "Kg"
                + this.getVitorias() + "vitórias,"
                + this.getDerrotas() + "derrotas e "
                + this.getEmpates() + " empates!" + "\n");
    }

    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria() + "\n"
                + "Ganhou " + this.getVitorias() + " vezes!" + "\n"
                + "Perdeu " + this.getDerrotas() + " vezes!" + "\n"
                + "Empatou " + this.getEmpates() + " vezes!" + "\n");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() +1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() +1);
    }

    public void empatarLuta() {
        this.setDerrotas(this.getEmpates() +1);
    }

    //Métodos especiais
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
                   int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }
}
