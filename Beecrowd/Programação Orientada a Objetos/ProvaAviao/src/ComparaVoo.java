import java.util.*;

public class ComparaVoo implements Comparator<Voo> {

    private String tipo;

    public ComparaVoo(String tipo){

        this.tipo = tipo;

    }

    public String getTipo(){

        return this.tipo;

    }

    public void setTipo(String tipo){

        this.tipo = tipo;

    }

    public int compare(Voo v1, Voo v2){

        if(this.tipo.equals("Data")){

            return v1.getDataVoo().compareTo(v2.getDataVoo());

        }

        if(this.tipo.equals("Numero do Voo")){

            if(Integer.parseInt(v1.getNrVoo()) > Integer.parseInt(v2.getNrVoo())){

                return 1;

            }

            if(Integer.parseInt(v1.getNrVoo()) == Integer.parseInt(v2.getNrVoo())){

                return 0;

            }

            if(Integer.parseInt(v1.getNrVoo()) < Integer.parseInt(v2.getNrVoo())){

                return -1;

            }

        }

        if(this.tipo.equals("Origem")){

            return v1.getOrigem().compareTo(v2.getOrigem());

        }

        else return 0;

    }

}