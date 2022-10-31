package aula11b;

public class Aula11b {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa(); Não pode instanciar objetos pois é uma classe Abstrata.

        // Agora podemos instanciar um objeto de Visitante que é uma herança de implementação de Pessoa
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setSexo("M");
        v1.setIdade(70);

        System.out.println(v1.toString());

        // Instanciando um Aluno
        Aluno a1 = new Aluno();
        a1.setNome("Lucas");
        a1.setSexo("M");
        a1.setIdade(27);
        a1.setCurso("Informática");
        a1.setMat(11111);
        a1.pagarMensalidade();

        System.out.println(a1.toString());

        // Instanciando um Bolsista
        Bolsista b1 = new Bolsista();
        b1.setMat(2222);
        b1.setNome("Jubas");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();

    }
}
