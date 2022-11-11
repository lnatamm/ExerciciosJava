public class TrianguloEq extends PolReg{

    public TrianguloEq(double tamanhoDoLado){

        super(3);

        this.setTamanhoDoLado(tamanhoDoLado);

    }

    @Override
    public double calculoDaArea(){

        return (this.getTamanhoDoLado() * Math.sqrt(3.0)) / 2;

    }

}