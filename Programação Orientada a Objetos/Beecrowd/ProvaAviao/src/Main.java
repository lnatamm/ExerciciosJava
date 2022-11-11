import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();

        System.out.println("Quantos aviões serão criados?");

        int x = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < x; i++){

            System.out.println("Digite o prefixo: ");

            String prefixo = sc.nextLine();

            Aviao aviao = new Aviao(prefixo);

            menu.cadastrarAviao(aviao);

        }

        System.out.println("Quantos voos serão realizados?");

        x = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < x; i++) {

            System.out.println("Insira a data do Voo: ");

            String data = sc.nextLine();

            System.out.println("Insira o destino do Voo: ");

            String destino = sc.nextLine();

            System.out.println("Insira a origem do Voo: ");

            String origem = sc.nextLine();

            System.out.println("Insira o numero do Voo: ");

            String nrVoo = sc.nextLine();

            Voo voo = new Voo(data, destino, origem, nrVoo);

            System.out.println("Insira o prefixo do avião a ser cadastrado o voo: ");

            String prefixo = sc.nextLine();

            menu.cadastrarVoo(prefixo, voo);

        }

        System.out.println("Insira o prefixo do aviao a ser efetuada a reserva: ");

        String prefixo = sc.nextLine();

        menu.efetuaReserva(prefixo);

        System.out.println("Digite o voo a ser conferido os assentos:");

        menu.exibirVoos(prefixo);

        int voo = Integer.parseInt(sc.next());

        System.out.printf("Quantidade de lugares do aviao: %d\n", menu.getAviao(menu.retornaAviao(prefixo)).getVoo(voo).getQtdLugares());

        System.out.println("Insira o prefixo do aviao a ser cancelado a reserva");

        prefixo = sc.next();

        menu.cancelarReserva(prefixo);

        System.out.println("Digite o voo a ser conferido os assentos:");

        menu.exibirVoos(prefixo);

        voo = Integer.parseInt(sc.next());

        System.out.printf("Quantidade de lugares do aviao: %d\n", menu.getAviao(menu.retornaAviao(prefixo)).getVoo(voo).getQtdLugares());

        System.out.println("Insira o prefixo do Aviao a ser listado os voos: ");

        prefixo = sc.next();

        menu.listarVoos(prefixo);

        menu.listarVoos(prefixo);

        menu.listarVoos(prefixo);

    }

}