import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        Motor m = new Motor();

        Comparador me;

        int n = dado.nextInt();

        for(int i = 0; i < n; i++) {

            m.addListaRpms(dado.nextInt());

        }

        me = new Comparador(m);

        System.out.println(me.getIndiceMudanca());

        dado.close();

    }

}