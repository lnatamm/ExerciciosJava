import java.util.*;
public class Mestre {

    private ArrayList<Pomekon> listaPomekons = new ArrayList<>();

    public Mestre(ArrayList<Pomekon> colecao){

        this.listaPomekons = colecao;

    }

    public Mestre(){

        this.listaPomekons.clear();

    }

    public ArrayList<Pomekon> getListaPomekons(){

        return this.listaPomekons;

    }

    public void setColecao(ArrayList<Pomekon> colecao){

        this.listaPomekons = colecao;

    }

    public void addPomekon(Pomekon pomekon){

        this.listaPomekons.add(pomekon);

    }

    public HashSet<String> getColecaoPomekons(){

        HashSet<String> colecaoPomekons = new HashSet<String>();

        for(int i = 0; i < listaPomekons.size(); i++){

            colecaoPomekons.add(listaPomekons.get(i).getNome());

        }

        return colecaoPomekons;

    }

}
