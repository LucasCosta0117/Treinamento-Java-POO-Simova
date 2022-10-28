package aula2b;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean isTampada;

    void status() {
        System.out.println("O modelo da caneta é: "+ this.modelo);
        System.out.println("A cor da caneta é: "+ this.cor);
        System.out.println("A ponta da caneta é: "+ this.ponta);
        System.out.println("A carga da caneta está em: "+ this.carga +"%");
        System.out.println("Está tampada? "+ this.isTampada);
    }

    void rabiscar() {
        if (this.isTampada) {
            System.out.println("Erro: Não pode rabiscar!");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }

    void tampar() {
        this.isTampada = true;
    }

    void destampar() {
        this.isTampada = false;
    }
}
