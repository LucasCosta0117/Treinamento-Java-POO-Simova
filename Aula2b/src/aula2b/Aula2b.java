package aula2b;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Aula2b {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar(); //Acionado o "Erro: Não pode rabiscar", pois, foi solicitado met. tampar a caneta;

        Caneta c2 = new Caneta();
        c2.modelo = "HostNet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar(); //Acionado o "Estou rabiscando", pois, foi solicitado met. destampar a caneta;

        // Exercício 01 - Objeto concreto: Veiculo
        Veiculo carro1 = new Veiculo();
        carro1.modelo = "A5";
        carro1.marca = "Audi";
        carro1.tipo = "Carro Sedan";
        carro1.passageiros = 5;
        carro1.potMotor = 2.0f;
        carro1.isNovo = true;
        // Dando um rolê com meu Audi.
        carro1.ligar();
        carro1.andar();
        carro1.parar();
        carro1.desligar();

        Veiculo moto1 = new Veiculo();
        moto1.modelo = "Tenerê";
        moto1.marca = "Yamaha";
        moto1.tipo = "Moto Trail";
        moto1.passageiros = 2;
        moto1.potMotor = 0.250f;
        moto1.isNovo = false;
        // Dando um rolê com minha Moto.
        moto1.ligar();
        moto1.andar();
        moto1.parar();
        moto1.desligar();

        //Exercício 02 - Objeto abstrato - EstagioSimova
        EstagioSimova es1 = new EstagioSimova();
        es1.turma = "Turma 01";
        es1.duracao = 1;
        es1.qtdParticipantes = 7;
        es1.isCompleted = false;

        es1.aprenderMySQL();
        es1.desafioFabio();
        es1.aprenderJava();
    }
}
