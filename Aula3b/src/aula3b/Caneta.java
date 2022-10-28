package aula3b;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean isTampada;

    public void status() {
        System.out.println("O modelo da caneta é: "+ this.modelo);
        System.out.println("A cor da caneta é: "+ this.cor);
        System.out.println("A ponta da caneta é: "+ this.ponta);
        System.out.println("A carga da caneta está em: "+ this.carga +"%");
        System.out.println("Está tampada? "+ this.isTampada);
    }

    public void rabiscar() {
        if (this.isTampada) {
            System.out.println("Erro: Não pode rabiscar!");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }
    //O método pode alterar o atributo privado, pois está dentro da própria classe (encapsulamento)
    public void tampar() {
        this.isTampada = true;
    }

    public void destampar() {
        this.isTampada = false;
    }
}
