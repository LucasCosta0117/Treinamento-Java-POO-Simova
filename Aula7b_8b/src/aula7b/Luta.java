package aula7b;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos personalizados
    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if ((desafiado.getCategoria().equals(desafiante.getCategoria()))&&( desafiado != desafiante)) {
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante =desafiante;
        }  else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante =null;
        }
    }

    public void lutar() {
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(3); //Gera 3 valores aleatórios: 0, 1 ou 2.

            switch (vencedor){
                case 0:
                    System.out.println("Luta empatou! \n");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vendeu " + this.desafiado.getNome() + "\n");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vendeu " + this.desafiante.getNome() + "\n");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }else {
            System.out.println("Luta não pode acontecer!");
        }
    }

    //Métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
