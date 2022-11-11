public class Real extends Complexo{

    public Real(float real){

        super(real);

    }

    @Override
    public int Sinal(){

        if(this.getReal() > 0){

            return 1;

        }

        if(this.getReal() < 0){

            return -1;

        }

        return 0;

    }

}
