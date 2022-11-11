public class Complexo {

    private float real;

    private float imag;

    public Complexo(float real, float imag){

        this.real = real;

        this.imag = imag;

    }

    public Complexo(float real){

        this.real = real;

    }

    public float getReal(){

        return this.real;

    }

    public float getImag(){

        return this.imag;

    }

    public void setReal(float real){

        this.real = real;

    }

    public void setImag(float imag){

        this.imag = imag;

    }

    public float Modulo(){

        return (float) Math.abs(Math.sqrt(this.real + this.imag));

    }

    public float Angulo(){

        float z = Modulo();

        float angulo;

        if(Math.round(Math.toDegrees(Math.atan2(this.imag, this.real))) >= 0){

            angulo = Math.round(Math.toDegrees(Math.atan2(this.imag, this.real)));

        }

        else{

            angulo = 360 + Math.round(Math.toDegrees(Math.atan2(this.imag, this.real)));

        }

        return angulo;

    }

    public int Sinal(){

        return 0;

    }

}