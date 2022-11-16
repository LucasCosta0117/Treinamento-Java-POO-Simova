package org.example.model;

public class Equipamento {
    private int codigo;
    private String nome;
    private String fabricante;
    private String modelo;
    private int horasManutencao;

    public Equipamento(int codigo, String nome, String fabricante, String modelo, int horasManutencao) {
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.horasManutencao = horasManutencao;
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

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHorasManutencao() {
        return horasManutencao;
    }

    public void setHorasManutencao(int horasManutencao) {
        this.horasManutencao = horasManutencao;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", horasManutencao=" + horasManutencao +
                '}';
    }
}
