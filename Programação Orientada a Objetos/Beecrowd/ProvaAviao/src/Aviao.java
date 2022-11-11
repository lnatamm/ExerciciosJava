import java.util.*;
public class Aviao {

    private String prefixo;

    private String modelo;

    private String fabricante;

    private int qtdVoos;

    private ArrayList<Voo> voo = new ArrayList<Voo>();

    public Aviao(String prefixo, String modelo, String fabricante, int qtdVoos){

        this.prefixo = prefixo;

        this.modelo = modelo;

        this.fabricante = fabricante;

        this.qtdVoos = qtdVoos;

    }

    public Aviao(String prefixo){

        this.prefixo = prefixo;

        this.qtdVoos = 0;

        this.voo.clear();

    }

    public String getPrefixo(){

        return this.prefixo;

    }

    public String getModelo(){

        return this.modelo;

    }

    public String getFabricante(){

        return this.fabricante;

    }

    public int getQtdVoos(){

        return this.qtdVoos;

    }

    public ArrayList<Voo> getVoo(){

        return this.voo;

    }

    public void setPrefixo(String prefixo){

        this.prefixo = prefixo;

    }

    public void setModelo(String modelo){

        this.modelo = modelo;

    }

    public void setFabricante(String fabricante){

        this.fabricante = fabricante;

    }

    public void setQtdVoos(int qtdVoos){

        this.qtdVoos = qtdVoos;

    }

    public void setVoo(ArrayList<Voo> voo){

        this.voo = voo;

    }

    public Voo getVoo(int i){

        return this.voo.get(i);

    }

    public void setVoo(int i, Voo voo){

        this.voo.set(i, voo);

    }

    public void addVoo(Voo voo){

        this.voo.add(voo);

    }

    public void removeVoo(int i){

        this.voo.remove(i);

    }

    public int getVooSize(){

        return this.voo.size();

    }

    public boolean CadastrarVoo(Voo voo){

        if(this.qtdVoos < 5) {

            this.voo.add(voo);

            this.qtdVoos++;

            return true;

        }

        else {

            return false;

        }

    }

    public Voo BuscarVoo(int i){

        return this.voo.get(i);

    }

}