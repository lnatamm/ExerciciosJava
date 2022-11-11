import java.util.*;

public class Julgamento {

    private Competidor competidor = new Competidor();

    private ArrayList<Juiz> juizes = new ArrayList<Juiz>();

    public Julgamento(Competidor competidor, ArrayList<Juiz> juizes){

        this.competidor = competidor;

        this.juizes = juizes;

        defineNotaFinal();

    }

    public Competidor getCompetidor() {

        return this.competidor;

    }

    public void setCompetidores(Competidor competidor) {

        this.competidor = competidor;

    }

    public Juiz getJuizes(int i) {

        return this.juizes.get(i);

    }

    public void setJuizes(int i, Juiz j) {

        this.juizes.set(i, j);

    }

    public void defineNotaFinal(){

        double soma = 0;

        double aux = 0;

        int pos = 0;

        for(int i = 0; i < juizes.size(); i++){

            if(juizes.get(i).getNota() > aux){

                aux = juizes.get(i).getNota();

                pos = i;

            }

        }

        juizes.remove(pos);

        for(int i = 0; i < juizes.size(); i++){

            if(juizes.get(i).getNota() < aux){

                aux = juizes.get(i).getNota();

                pos = i;

            }

        }

        juizes.remove(pos);

        for(int i = 0; i < juizes.size(); i++){

            soma += getJuizes(i).getNota();

        }

        this.competidor.setNota(soma * competidor.getSalto().getGrauDificuldade());

    }

}
