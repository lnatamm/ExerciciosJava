public class PolReg {

    private int numeroDeLados;

    private double tamanhoDoLado;

    public int getNumeroDeLados(){

        return this.numeroDeLados;

    }

    public double getTamanhoDoLado() {

        return this.tamanhoDoLado;

    }

    public PolReg(int numeroDeLados, double tamanhoDoLado){

        this.numeroDeLados = numeroDeLados;

        this.tamanhoDoLado = tamanhoDoLado;

    }

    public PolReg(int numeroDeLados){

        this.numeroDeLados = numeroDeLados;

    }

    public void setNumeroDeLados(int numeroDeLados){

        this.numeroDeLados = numeroDeLados;

    }

    public void setTamanhoDoLado(double tamanhoDoLado){

        this.tamanhoDoLado = tamanhoDoLado;

    }

    public double calculoDoPerimetro(){

        return this.tamanhoDoLado * this.numeroDeLados;

    }

    public double calculoDoAnguloInterno(){

        return ((this.numeroDeLados - 2) * 180) / this.numeroDeLados;

    }

    public double calculoDaArea(){

        return 0;

    }

}