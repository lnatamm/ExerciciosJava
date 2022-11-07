
public class Jipe {

	private String estado;

	private int passageiros;

	private int turistas;

	private int jipes;

	public Jipe() {

		this.estado = "";

		this.passageiros = 0;

		this.turistas = 0;

		this.jipes = 0;

	}

	public void setEstado(String estado) {

		this.estado = estado;

	}

	public void setPassageiros(int passageiros) {

		this.passageiros = passageiros;

		if (this.estado.equals("SALIDA")) {

			this.jipes++;

			this.turistas += this.passageiros;

		}

		if (this.estado.equals("VUELTA")) {

			this.jipes--;

			this.turistas -= this.passageiros;

		}

	}

	public String getEstado() {

		return this.estado;

	}

	public void exibir() {

		System.out.println(this.turistas);

		System.out.println(this.jipes);

	}

}