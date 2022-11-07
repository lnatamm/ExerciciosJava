
public class ContaBanco {

    public String numConta;

    public int tipo;

    private String dono;

    private double saldo;

    private boolean status;

    public ContaBanco(String numConta, int tipo, String dono) {

        this.numConta = numConta;

        if(tipo == 1 || tipo == 2) {

            this.tipo = tipo;

        }

        else {

            System.out.println("Tipo só pode assumir 1 ou 2");

        }

        this.dono = dono;

        this.saldo = 50;

        this.status = false;

    }

    public String getNumConta() {

        return this.numConta;

    }

    public int getTipo() {

        return this.tipo;

    }

    public String getDono() {

        return this.dono;

    }

    public double getSaldo() {

        return this.saldo;

    }

    public boolean getStatus() {

        return this.status;

    }

    public void setNumConta(String numConta) {

        this.numConta = numConta;

    }

    public void setTipo(int tipo) {

        this.tipo = tipo;

    }

    public void setDono(String dono) {

        this.dono = dono;

    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;

    }

    public void setStatus(boolean status) {

        this.status = status;

    }

    public void abrirConta() {

        if(this.status == false) {

            this.status = true;

        }

        if(this.tipo == 1) {

            this.saldo += 50;

        }

        else {

            this.saldo += 150;

        }

    }

    public void fecharConta() {

        if(this.status == true && this.saldo == 0) {

            this.status = false;

        }

    }

    public void depositar(double valor) {

        if(this.status == true && valor >= 0) {

            this.saldo += valor;

        }

    }

    public void sacar(double valor) {

        if(this.status == true && this.saldo >= valor && valor >= 0) {

            this.saldo -= valor;

        }

    }

    public void pagarMensalidade() {

        if(this.status == true) {

            if(this.tipo == 1) {

                this.saldo -= 12;

            }

            else {

                this.saldo -= 20;

            }

        }

    }

}