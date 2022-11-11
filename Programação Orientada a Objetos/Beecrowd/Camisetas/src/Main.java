import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

        int n = Integer.parseInt(dado.nextLine());

        while(n > 0){

            for(int i = 0; i < n; i++){

                String nome = dado.nextLine();

                Camisa c = new Camisa(dado.next(), dado.nextLine());

                Aluno p = new Aluno(nome, c);

                listaAlunos.add(p);

            }

            Collections.sort(listaAlunos, new ComparadorAluno());

            for(int i = 0; i < n; i++){

                System.out.println(listaAlunos.get(i).getCamisa().getCor() + " " + listaAlunos.get(i).getCamisa().getTamanho() + " " + listaAlunos.get(i).getNome());

            }

            listaAlunos.clear();

            n = Integer.parseInt(dado.nextLine());

            if(n > 0) System.out.println();

        }

    }

}