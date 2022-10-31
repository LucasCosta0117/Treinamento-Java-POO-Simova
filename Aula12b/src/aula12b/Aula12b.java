package aula12b;

public class Aula12b {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.5f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        // Vendo na prática o polimorfismo do método locomover() nas classes filhas.
        a.locomover();
        r.locomover();
        p.locomover();

        // Classe Canguru sendo uma subclasse descendente de Animal, com polimorfismo no met locomover().
        Canguru c = new Canguru();
        c.locomover();
    }
}
