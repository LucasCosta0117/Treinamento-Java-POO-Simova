package aula6b;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Métodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Ligando seu aparelho ...");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Desligando seu aparelho ...");
    }

    @Override
    public void abrirMenu() {
        if (this.isLigado()) {
            System.out.println("----- MENU -----");
            System.out.println("Está ligado? " + this.isLigado());
            System.out.println("Está tocando? " + this.isTocando());
            System.out.print("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 5) {
                System.out.print(" |");
            }
            System.out.println("");
        } else {
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.isLigado()) {
            System.out.println("Fechando menu");
        } else {
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() + 5);
        } else {
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() - 5);
        } else {
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume()>0) {
            this.setVolume(0);
        } else {
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume()==0) {
            this.setVolume(50);
        } else {
            System.out.println("Aparelho desligado.");
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()) {
            this.setTocando(true);
        } else if (!this.ligado) {
            System.out.println("Aparelho desligado.");
        } else {
            System.out.println("Aparelho já está em reprodução.");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        } else if (!this.isLigado()){
            System.out.println("Aparelho desligado.");
        } else {
            System.out.println("Aparelho não está reproduzindo nada no momento.");
        }
    }
}
