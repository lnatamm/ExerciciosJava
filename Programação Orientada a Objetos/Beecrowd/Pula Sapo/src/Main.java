import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        Sapo sapo = new Sapo(dado.nextInt());

        Fase fase = new Fase(sapo);

        int n = dado.nextInt();

        for(int i = 0; i < n; i++) {

            Cano c = new Cano(dado.nextInt());

            fase.addCano(c);

        }

        fase.sapoGanha();

    }

}
