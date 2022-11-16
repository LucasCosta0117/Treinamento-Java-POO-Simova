package org.example.model;

public class Funcionario extends Pessoa {
    private int cracha;
    private String funcao;

    public Funcionario(String nome, String sexo, int cracha, String funcao) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.cracha = cracha;
        this.funcao = funcao;
    }

    public Funcionario() {

    }

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
