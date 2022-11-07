import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        int n = dado.nextInt();

        for(int i = 0; i < n; i++){

            Competidor competidor = new Competidor(dado.next());

            Salto salto = new Salto(dado.nextDouble());

            ArrayList<Juiz> juizes = new ArrayList<Juiz>();

            competidor.setSalto(salto);

            for(int j = 0; j < 7; j++){

                Juiz juiz = new Juiz(dado.nextDouble());

                juizes.add(juiz);

            }

            Julgamento julgamento = new Julgamento(competidor, juizes);

            System.out.printf("%s %.2f\n", competidor.getNome(), competidor.getNota());

        }

    }

}
