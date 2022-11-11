public class Comparador{

    private Motor m;

    public Comparador(Motor m) {

        this.m = m;

    }

    public Motor getMotor() {

        return this.m;

    }

    public void setMotor(Motor m) {

        this.m = m;

    }

    public int getIndiceMudanca() {

        for(int i = 1; i < this.m.getListaRpmsSize(); i++) {

            if(this.m.getListaRpms(i) < this.m.getListaRpms(i - 1)) {

                return i + 1;

            }

        }

        return 0;

    }

}