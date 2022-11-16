package org.example.model;

public class Atividade {
    private int codigo;
    private String nome;
    private String grupo;
    private int etapas;

    public Atividade(int codigo, String nome, String grupo, int etapas) {
        this.codigo = codigo;
        this.nome = nome;
        this.grupo = grupo;
        this.etapas = etapas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getEtapas() {
        return etapas;
    }

    public void setEtapas(int etapas) {
        this.etapas = etapas;
    }
}
