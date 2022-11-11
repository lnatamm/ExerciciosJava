import java.util.ArrayList;

public class Motor {

    private int Rpm;

    private ArrayList<Integer> listaRpms = new ArrayList<Integer>();

    public Motor() {

        this.Rpm = 0;

        listaRpms.clear();

    }

    public Motor(int Rpm) {

        this.Rpm = Rpm;

    }

    public void setRpm(int Rpm) {

        this.Rpm = Rpm;

    }

    public int getRpm() {

        return this.Rpm;

    }

    public void setListaRpms(int i, int j) {

        this.listaRpms.set(i, j);

    }

    public int getListaRpms(int i) {

        return this.listaRpms.get(i);

    }

    public int getListaRpmsSize() {

        return this.listaRpms.size();

    }

    public void addListaRpms(int Rpm) {

        this.listaRpms.add(Rpm);

    }

}