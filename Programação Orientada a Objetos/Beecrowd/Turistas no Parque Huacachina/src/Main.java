import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner dado = new Scanner(System.in);
		
		Jipe j = new Jipe();
	
		j.setEstado(dado.next());

		while(!j.getEstado().equals("ABEND")) {
			
			j.setPassageiros(dado.nextInt());
			
			j.setEstado(dado.next());
			
		}
		
		j.exibir();
		
		dado.close();
		
	}

}