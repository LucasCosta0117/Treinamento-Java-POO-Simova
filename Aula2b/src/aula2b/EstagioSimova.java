package aula2b;

import java.time.LocalDateTime;
import java.util.Date;

public class EstagioSimova {
    String turma;
    int duracao;
    int qtdParticipantes;
    boolean isCompleted;

    void aprenderMySQL() {
        System.out.println("Realizando o CeV MySQL do guanabara");
    }

    void aprenderJava() {
        System.out.println("Realizando o CeV Java POO do guanabara");
    }

    void desafioFabio() {
        System.out.println("Realizando o desafio proposto pelo fábio");
    }

    void finalizarEstagio() {
        if (this.isCompleted) {
            System.out.println("O processo de estágio chegou ao fim.");
        } else {
            System.out.println("Complete todas as etapas para finaliza-lo.");
        }
    }
}
