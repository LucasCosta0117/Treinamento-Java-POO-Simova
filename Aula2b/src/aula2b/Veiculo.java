package aula2b;

public class Veiculo {
    String modelo;
    String marca;
    String tipo;
    int passageiros;
    float potMotor;
    boolean isNovo;

    void ligar() {
        System.out.println("Motor Ligado!");
    }

    void desligar() {
        System.out.println("Motor desligado!");
    }

    void andar() {
        System.out.println("Carro está em movimento.");
    }

    void parar() {
        System.out.println("Carro está parado.");
    }
}
