
public class Pomekon {

	private int ataque;
	
	private int defesa;
	
	private int bonus;
	
	private int level;
	
	private double valorGolpe;
	
	public Pomekon(int b, int a, int d, int l) {
			
		this.bonus = b;
		
		this.ataque = a;
		
		this.defesa = d;
		
		this.level = l;
		
		if(this.level % 2 != 0) {
			
			this.bonus = 0;
			
		}
		
		this.valorGolpe = ((this.ataque + this.defesa) / 2) + this.bonus;
		
	}
	
	public double getValorGolpe() {
		
		return this.valorGolpe;
		
	}

}