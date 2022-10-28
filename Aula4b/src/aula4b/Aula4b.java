package aula4b;

public class Aula4b {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic Cristal", "Azul", 0.5f, 100);
        System.out.println("O modelo da caneta é "+ c1.getModelo() +" e sua ponta é "+ c1.getPonta());
    }
}
