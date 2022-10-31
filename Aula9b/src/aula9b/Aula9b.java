package aula9b;

public class Aula9b {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 20, "F");

        l[0] = new Livro("Aprendendo Java", "José Silva", 200, p[0]);
        l[1] = new Livro("POO Java", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "João Santos", 800, p[0]);

        l[0].abrir();
        l[0].folhear(400);
        System.out.println(l[0].detalhes());

        l[1].abrir();
        l[1].folhear(400);
        System.out.println(l[1].detalhes());
    }
}
