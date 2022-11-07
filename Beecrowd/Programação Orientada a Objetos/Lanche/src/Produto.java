public class Produto {

	private int codigo;

	private String tipo;

	private double preco;

	public Produto(int codigo, String tipo, double preco){

		this.codigo = codigo;

		this.tipo = tipo;

		this.preco = preco;

	}

	public void setCodigo(int codigo){

		this.codigo = codigo;

	}

	public void setTipo(String tipo){

		this.tipo = tipo;

	}

	public void setPreco(double preco){

		this.preco = preco;

	}

	public int getCodigo(){

		return this.codigo;

	}

	public String getTipo(){

		return this.tipo;

	}

	public double getPreco(){

		return this.preco;

	}

}