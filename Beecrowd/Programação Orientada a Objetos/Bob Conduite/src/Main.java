import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner dado = new Scanner(System.in);

		int n = dado.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			Cabo c1 = new Cabo(dado.nextInt());
			
			Cabo c2 = new Cabo(dado.nextInt());
			
			Cabo c3 = new Cabo(c1.getRaio() + c2.getRaio());
		
			System.out.println(c3.getRaio());
		
		}
		
		dado.close();
		
	}

}