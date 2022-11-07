import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);
		
		int n = dado.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			int b = dado.nextInt();
			
			Pomekon Dabriel = new Pomekon(b, dado.nextInt(), dado.nextInt(), dado.nextInt());
			
			Pomekon Guarte = new Pomekon(b, dado.nextInt(), dado.nextInt(), dado.nextInt());
			
			if(Dabriel.getValorGolpe() > Guarte.getValorGolpe()) System.out.println("Dabriel");
			
			else if(Dabriel.getValorGolpe() < Guarte.getValorGolpe()) System.out.println("Guarte");
			
			else System.out.println("Empate");
			
		}
	
		dado.close();
		
	}

}