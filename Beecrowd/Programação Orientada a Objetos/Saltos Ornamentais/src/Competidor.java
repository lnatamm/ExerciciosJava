public class Competidor {

    private String nome;

    private Salto salto;

    private double nota;

    public Competidor(){

        this.nome = "";

        this.nota = 0;

    }

    public Competidor(String nome){

        this.nome = nome;

        this.nota = 0;

    }

    public String getNome(){

        return this.nome;

    }

    public void setNome(String nome){

        this.nome = nome;

    }

    public Salto getSalto(){

        return this.salto;

    }

    public void setSalto(Salto salto){

        this.salto = salto;

    }

    public double getNota(){

        return this.nota;

    }

    public void setNota(double nota){

        this.nota = nota;

    }

}
