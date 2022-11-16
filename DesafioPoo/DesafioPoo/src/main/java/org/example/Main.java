package org.example;

import org.example.model.Apontamento;
import org.example.model.Atividade;
import org.example.model.Equipamento;
import org.example.model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario[] f = new Funcionario[3];
        f[0] = new Funcionario("Creuza", "F", 1234, "Pintor");
        f[1] = new Funcionario("Carlão", "M", 4321, "Pedreiro");
        f[2] = new Funcionario("Peçanha", "M", 1122, "Pedreiro");

        Equipamento e[] = new Equipamento[4];
        e[0] = new Equipamento(111, "Britadeira", "Meloy", "Pw2000", 60);
        e[1] = new Equipamento(222, "Serra Marmore", "Makita", "1200W", 20);
        e[2] = new Equipamento(333, "Color Spray", "+Tintas", "CS", 10);
        e[3] = new Equipamento(444, "Solda", "Simova Eletros", "SM1010x", 45);

        Atividade a[] = new Atividade[4];
        a[0] = new Atividade(1000, "Pintura PVA", "Acabamento", 4);
        a[1] = new Atividade(2000, "Assentamento", "Acabamento", 2);
        a[2] = new Atividade(3000, "Dobra de aço", "Estrutural", 1);
        a[3] = new Atividade(4000, "Concretagem", "Estrutural", 3);


        // TESTE 01
        Apontamento ap[] = new Apontamento[3];
        ap[0] = new Apontamento(1111, e[0], a[3], f[2]);

        ap[0].avancarAtividade(a[3]);
        ap[0].usarEquipamento(e[0], 40);
        System.out.println(ap[0].toString());


        ap[0].avancarAtividade(a[3]);
        ap[0].usarEquipamento(e[0], 30);
        System.out.println(ap[0].toString());

        ap[0].avancarAtividade(a[3]);
        ap[0].usarEquipamento(e[0], 10);
        System.out.println(ap[0].toString());

        ap[0].avancarAtividade(a[3]);
        System.out.println(ap[0].toString());


        ap[1] = new Apontamento(0303, e[3], a[2], f[1]);
        ap[2] = new Apontamento(0202, e[2], a[1], f[0]); // Victor que montou, ele assenta piso com o Color Spray
    }
}
