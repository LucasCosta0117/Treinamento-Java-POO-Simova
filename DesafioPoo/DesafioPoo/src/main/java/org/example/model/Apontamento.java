package org.example.model;

import java.util.Date;

public class Apontamento implements Relatorio {
    private int codigo;
    private Date data_apt;
    private Equipamento equipamento;
    private Atividade atividade;
    private Funcionario funcionario;

    public Apontamento(int codigo, Equipamento equipamento, Atividade atividade, Funcionario funcionario) {
        // this.data_apt = new Date();
        this.setData_apt();

        this.codigo = codigo;
        this.equipamento = equipamento;
        this.atividade = atividade;
        this.funcionario = funcionario;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData_apt() {
        return data_apt;
    }

    private Date setData_apt() {
        return this.data_apt = new Date();
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Apontamento{" +
                "codigo=" + codigo +
                ", data_apt=" + data_apt +
                ", equipamento=" + equipamento.getNome() +
                ", horasManut=" + equipamento.getHorasManutencao() +
                ", atividade=" + atividade.getNome() +
                ", etapas=" + atividade.getEtapas() +
                ", funcionario=" + funcionario.getNome() +
                '}';
    }

    @Override
    public void usarEquipamento(Equipamento equipamento, int horas) {
        if (equipamento.getHorasManutencao() > 0) {
            equipamento.setHorasManutencao(equipamento.getHorasManutencao() - horas);
        } else {
            equipamento.setHorasManutencao(equipamento.getHorasManutencao() - horas);
            System.out.println("O equipamento "+ equipamento.getNome() +
                    " apresentado no apontamento "+ this.getCodigo() +
                    " precisa de manutenção!");
        }
    }

    @Override
    public void avancarAtividade(Atividade atividade) {
        if (atividade.getEtapas() > 0) {
            atividade.setEtapas(atividade.getEtapas() - 1);
        } else {
            System.out.println("O apontamento " + this.getCodigo() +
                    " teve a atividade " + atividade.getNome() +" concluída!");
        }
    }
}
