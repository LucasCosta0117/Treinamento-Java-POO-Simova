package aula5b;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos personalizado
    public void estadoAtual() {
        System.out.println(
                "#---------------------------#"+ "\n"+
                "Conta: "+ this.getNumConta() + "\n"+
                "Tipo da conta: "+ this.getTipo() + "\n"+
                "Dono: "+ this.getDono() + "\n"+
                "Saldo: "+ this.getSaldo() + "\n"+
                "Status: "+ this.isStatus() + "\n"+
                "#---------------------------#"+ "\n"
        );
    }

    public void abrirConta(String tipoConta) {
        this.setTipo(tipoConta);
        this.setStatus(true);
        if (tipoConta == "CC") {
            this.setSaldo(50);
        } else {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada. Você ainda possui saldo.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada. Você possui um saldo devedor.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar( float valor) {
        if (this.isStatus()) {
            // this.saldo = this.saldo + valor;
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso!");
        } else {
            System.out.println("Não foi possível depositar. Esta conta não está ativa!");
        }
    }

    public void sacar(float valor) {
        if (this.isStatus()) {
            if (this.getSaldo() >= valor) {
                //this.saldo = this.saldo - valor;
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Não foi possível sacar. Esta conta não está ativa!");
        }
    }

    public void pagarMensalidade() {
        float mensalidade = 0;
        if (this.getTipo() == "CC") {
            mensalidade = 12;
        } else {
            mensalidade = 20;
        }
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - mensalidade);
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Não foi possível pagar mensalidade. Esta conta não está ativa!");
        }
    }

    //Métodos Especiais
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
