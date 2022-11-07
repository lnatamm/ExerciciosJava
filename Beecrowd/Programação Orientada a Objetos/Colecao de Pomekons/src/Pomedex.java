public class Pomedex {

    private Mestre mestre = new Mestre();

    private int totalPomekons;

    private int pomekonsRestantes;

    public Pomedex(Mestre mestre, int totalPomekons){

        this.mestre = mestre;

        this.totalPomekons = totalPomekons;

        definePomekonsRestantes();

    }

    public Mestre getMestre(){

        return this.mestre;

    }

    public void setMestre(Mestre mestre){

        this.mestre = mestre;

    }

    public int getTotalPomekons(){

        return this.totalPomekons;

    }

    public void setTotalPomekons(int totalPomekons){

        this.totalPomekons = totalPomekons;

    }

    public int getPomekonsRestantes(){

       return this.pomekonsRestantes;

    }

    public void setPomekonsRestantes(int pomekonsRestantes){

        this.pomekonsRestantes = pomekonsRestantes;

    }

    public void definePomekonsRestantes(){

        this.pomekonsRestantes = this.totalPomekons - this.mestre.getColecaoPomekons().size();

    }

}
