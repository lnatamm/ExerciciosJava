public class Questao {

    public String enunciado;

    public String[] alternativas = new String[4];

    private int resposta;

    public Questao(){

        this.enunciado = "";

        for(int i = 0; i < alternativas.length; i++){

            this.alternativas[i] = "";

        }

        this.resposta = 999;

    }

    public Questao(String enunciado, String[] alternativas, int resposta){

        this.enunciado = enunciado;

        for(int i = 0; i < alternativas.length; i++){

            this.alternativas[i] = alternativas[i];

        }

        this.resposta = resposta;

    }

    public void exibirQuestao(){

        System.out.println(this.enunciado);

        for(int i = 0; i < alternativas.length; i++){

            System.out.println(alternativas[i]);

        }

    }

    public boolean verificarResposta(int reposta){

        if(this.resposta == resposta) return true;

        else return false;

    }

}