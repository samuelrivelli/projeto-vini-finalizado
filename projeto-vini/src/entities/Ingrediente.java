package entities;

public class Ingrediente {
	
	private String ingrediente;
	private double preco;
	
	public Ingrediente(String ingrediente, double preco) {
		super();
		this.ingrediente = ingrediente;
		this.preco = preco;
	}

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return ingrediente ;
	}
	
	
	
	
	
	
	
	
	
}
