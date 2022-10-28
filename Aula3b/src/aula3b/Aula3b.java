package aula3b;

public class Aula3b {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; - Não foi possível atribuir pois o atributo 'ponta' é privado
        c1.carga = 80; // Posso alterar c1, pois apesar de protect a classe Caneta está sendo utilizada dentor da main que está sendo executada.
        // c1.isTampada = true; - Atributo privado
        c1.destampar(); // Posso mudar o atributo isTampada que é privado através do met. publico destampar (encapsulamento)
        c1.rabiscar();
        c1.status();
    }
}
