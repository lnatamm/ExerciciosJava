public class Aluno {
    private String nome;

    private Camisa camisa;

    public Aluno(String nome, Camisa camisa){

        this.nome = nome;

        this.camisa = camisa;

    }

    public String getNome(){

        return this.nome;

    }

    public Camisa getCamisa(){

        return this.camisa;

    }

    public void setNome(String nome){

        this.nome = nome;

    }

    public void setCamisa(Camisa camisa){

        this.camisa = camisa;

    }
}
