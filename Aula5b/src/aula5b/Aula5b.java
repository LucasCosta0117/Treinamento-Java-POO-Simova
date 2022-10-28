package aula5b;

public class Aula5b {
    public static void main(String[] args) {
        //Instanciando objeto - Conta do Jubileu
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.estadoAtual();
        //Ativando a conta através do método
        p1.abrirConta("CC");

        //Instanciando objeto - Conta da Creuza
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.estadoAtual();
        //Ativando a conta através do método
        p2.abrirConta("CP");

        // Testando métodos personalizados
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(250);
        p2.sacar(1000);

        //Fechando a conta do jubileu
        p1.sacar(150); //Retirando o saldo da conta
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
