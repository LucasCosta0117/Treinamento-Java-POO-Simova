package aula11b;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa() {
        System.out.printf("Renovando bolsa do aluno " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do bolsita " + this.getNome());
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
