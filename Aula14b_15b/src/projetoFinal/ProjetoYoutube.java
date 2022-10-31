package projetoFinal;

import java.sql.SQLOutput;

public class ProjetoYoutube {
    public static void main(String[] args) {
        // Testando classe vídeo
        Video v[] = new Video[3];

        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PhP");
        v[2] = new Video("Aula 10 de HTML5");

        System.out.println(v[0].toString());

        //Testando classe Gafanhoto
        Gafanhoto g[] = new Gafanhoto[2];

        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");

        System.out.println(g[0].toString());

    }
}
