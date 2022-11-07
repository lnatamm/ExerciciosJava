import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        Mestre mestre = new Mestre();

        Pomedex pomedex;

        int n = dado.nextInt();

        for(int i = 0; i < n; i++){

            Pomekon pomekon = new Pomekon(dado.next());

            mestre.addPomekon(pomekon);

        }

        pomedex = new Pomedex(mestre, 151);

        System.out.println("Falta(m) " + pomedex.getPomekonsRestantes() + " pomekon(s).");

    }

}
