package aula12b;

public class Canguru extends Mamifero{

    // Sobreposição do método, utilizando a mesma assinatura e alterando o retorno.
    @Override
    public void locomover(){
        System.out.println("Pulando");
    }
}
