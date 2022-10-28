package aula6b;

public class Aula6b {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.abrirMenu();
        c.menosVolume();
        c.pause();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
        c.desligar();
    }
}
