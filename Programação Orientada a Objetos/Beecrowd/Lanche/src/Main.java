import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner dado = new Scanner(System.in);

		Cardapio c = new Cardapio();

		Pedido p = new Pedido(dado.nextInt(), dado.nextInt());

		System.out.printf("Total: R$ %.2f\n", p.valorTotal(c));

		dado.close();

	}

}