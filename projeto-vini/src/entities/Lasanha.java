package entities;


public class Lasanha extends Massa {

	public Lasanha(String sabor, ListaGenerica<Ingrediente> listaIngredientes) {
		super(sabor, listaIngredientes);
		
	}

	@Override
	public String getCodigoLetra() {
		return "L";
	}

	@Override
	public double calculaPreco() {
		double valorLasanha = 0;
		
		for(Ingrediente ingrediente : getListaIngredientesPorOrdemAlfabetica()) {
			valorLasanha += ingrediente.getPreco();
		}
		
		return valorLasanha;
	}
	
	@Override
	public String getDescricao() {
		return "Isso é uma lasanha";
	}
	
	@Override
	public String toString() {
		return "Lasanha de " + getSabor() + "\nPreço: " + this.calculaPreco() + "\nIngredientes: "
	+ getListaIngredientesPorOrdemAlfabetica() + "\nCodigo: " + getCodigo() + "\n";
	}
	
	@Override
	public String toStringPorPreco() {
		return "Lasanha de " + getSabor() + "\nPreço: " + this.calculaPreco() + "\nIngredientes: "
	+ getListaIngredientesPorPreco() + "\nCodigo: " + getCodigo() + "\n";
	}
}
