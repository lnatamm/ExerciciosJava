import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        Aluno a = new Aluno("Levi", "2210378");

        String enunciado1, enunciado2, enunciado3, enunciado4;

        String[] alternativas1 = new String[4], alternativas2 = new String[4], alternativas3 = new String[4], alternativas4 = new String[4];

        Questao[] questoes = new Questao[4];

        System.out.println("Digite o enunciado 1");

        enunciado1 = dado.nextLine();

        for(int i = 0; i < alternativas1.length; i++){

            System.out.printf("Digite a alternativa %d: ", i);

            alternativas1[i] = dado.nextLine();

        }

        Questao q1 = new Questao(enunciado1, alternativas1, 3);

        questoes[0] = q1;

        System.out.println("Digite o enunciado 2: ");

        enunciado2 = dado.nextLine();

        for(int i = 0; i < alternativas2.length; i++){

            System.out.printf("Digite a alternativa %d: ", i);

            alternativas2[i] = dado.nextLine();

        }

        Questao q2 = new Questao(enunciado2, alternativas2, 2);

        questoes[1] = q2;

        System.out.println("Digite o enunciado 3: ");

        enunciado3 = dado.nextLine();

        for(int i = 0; i < alternativas3.length; i++){

            System.out.printf("Digite a alternativa %d: ", i);

            alternativas3[i] = dado.nextLine();

        }

        Questao q3 = new Questao(enunciado3, alternativas3, 2);

        questoes[2] = q3;

        System.out.println("Digite o enunciado 4: ");

        enunciado4 = dado.nextLine();

        for(int i = 0; i < alternativas4.length; i++){

            System.out.printf("Digite a alternativa %d: ", i);

            alternativas4[i] = dado.nextLine();

        }

        Questao q4 = new Questao(enunciado4, alternativas4, 2);

        questoes[3] = q4;

        Prova p = new Prova(a, questoes);

        p.aplicarProva();

        p.corrigirProva();

    }

}