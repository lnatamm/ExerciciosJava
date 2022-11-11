public class Quadrado extends PolReg{

    public Quadrado(double tamanhoDoLado){

        super(4);

        this.setTamanhoDoLado(tamanhoDoLado);

    }

    @Override
    public double calculoDaArea() {

        return this.getTamanhoDoLado() * this.getTamanhoDoLado();

    }

}
