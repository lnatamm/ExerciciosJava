import java.util.Comparator;

public class ComparadorAluno implements Comparator<Aluno> {

    public int compare(Aluno a1, Aluno a2){

        if(a1.getCamisa().getCor().compareTo(a2.getCamisa().getCor()) == 0){

            if(a1.getCamisa().getTamanho().compareTo(a2.getCamisa().getTamanho()) == 0){

                return a1.getNome().compareTo(a2.getNome());

            }

            else return -(a1.getCamisa().getTamanho().compareTo(a2.getCamisa().getTamanho()));

        }

        else return a1.getCamisa().getCor().compareTo(a2.getCamisa().getCor());

    }

}