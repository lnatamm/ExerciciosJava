public class Voo {

    private String dataVoo;

    private String destino;

    private String origem;

    private String nrVoo;

    private int qtdLugares;

    public Voo(String dataVoo, String destino, String origem, String nrVoo){

        this.dataVoo = dataVoo;

        this.destino = destino;

        this.origem = origem;

        this.nrVoo = nrVoo;

        this.qtdLugares = 150;

    }

    public String getDataVoo(){

        return this.dataVoo;

    }

    public String getDestino(){

        return this.destino;

    }

    public String getOrigem(){

        return this.origem;

    }

    public String getNrVoo(){

        return this.nrVoo;

    }

    public int getQtdLugares(){

        return this.qtdLugares;

    }

    public void setDataVoo(String dataVoo){

        this.dataVoo = dataVoo;

    }

    public void setDestino(String destino){

        this.destino = destino;

    }

    public void setOrigem(String origem){

        this.origem = origem;

    }

    public void setNrVoo(String nrVoo){

        this.nrVoo = nrVoo;

    }

    public void setQtdLugares(int qtdLugares){

        this.qtdLugares = qtdLugares;

    }

    public boolean efetuarReserva(Aviao aviao, int i){

        if(aviao.getVoo(i).getQtdLugares() > 0){

            aviao.getVoo(i).setQtdLugares(getQtdLugares() - 1);

            return true;

        }

        else{

            return false;

        }

    }

    public boolean cancelarReserva(Aviao aviao, int i){

        if(aviao.getVoo(i).getQtdLugares() < 150){

            aviao.getVoo(i).setQtdLugares(getQtdLugares() + 1);

            return true;

        }

        else{

            return false;

        }

    }

}