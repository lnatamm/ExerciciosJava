import java.util.Scanner;
public class Prova {

    public Aluno aluno = new Aluno();

    public Questao[] questoes = new Questao[4];

    public double nota;

    private int[] respostas = new int[4];

    public Prova(Aluno a, Questao[] q){

        this.aluno.setNome(a.getNome());

        this.aluno.setMatricula(a.getMatricula());

        for(int i = 0; i < this.questoes.length; i++){

            this.questoes[i] = new Questao();

            this.questoes[i].enunciado = q[i].enunciado;

            for(int j = 0; j < q[i].alternativas.length; j++){

                this.questoes[i].alternativas[j] = q[i].alternativas[j];

            }

            this.respostas[i] = 999;

        }

        this.nota = 0;

    }

    public void aplicarProva(){

        Scanner dado = new Scanner(System.in);

        for(int i = 0; i < questoes.length; i++){

            this.questoes[i].exibirQuestao();

            this.respostas[i] = dado.nextInt();

        }

    }

    private void imprimirNota(){

        System.out.println("Nome do aluno: "+ this.aluno.getNome());

        System.out.println("Matricula: "+ this.aluno.getMatricula());

        System.out.println("Nota: " + this.nota);

    }

    public void corrigirProva(){

        int acertos = 0;

        for(int i = 0; i < questoes.length; i++){

            if(this.questoes[i].verificarResposta(this.respostas[i])) acertos++;

            System.out.println(this.questoes[i].verificarResposta(this.respostas[i]));



        }
        System.out.println("Acertos: " + acertos);

        System.out.println("Quantidade de Questoes: " + this.questoes.length);

        this.nota = (10 / this.questoes.length) * acertos;

        System.out.println("Nota: " + this.nota);

        imprimirNota();

    }

}