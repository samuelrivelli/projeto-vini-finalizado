package entities;
import java.util.ArrayList;

public class Pizza extends Massa{
	
	
	public Pizza(String sabor, ListaGenerica<Ingrediente> listaIngredientes) {
		super(sabor, listaIngredientes);
		
	}

	@Override
	public double calculaPreco() {
		int numIngredientes = getListaIngredientesPorOrdemAlfabetica().size();
        double valorTotal = 0;

        for (Ingrediente ingrediente : getListaIngredientesPorOrdemAlfabetica()) {
            valorTotal += ingrediente.getPreco();
        }

        if (numIngredientes == 2) {
            valorTotal += valorTotal * 0.1;
        } else if (numIngredientes == 3) {
            valorTotal += valorTotal * 0.2;
        }

        return valorTotal;
	}
	
	@Override
	public String getCodigoLetra() {
		return "P";
	}
	
	@Override
	public String getDescricao() {
		return "Isso é uma pizza";
	}
	
	
	@Override
	public String toString() {
		return "Pizza de " + getSabor() + "\nPreço: " + this.calculaPreco() + "\nIngredientes: " 
	+ getListaIngredientesPorOrdemAlfabetica() + "\nCodigo: " + getCodigo() + "\n";
	}
	
	public String toStringPorPreco() {
		return "Pizza de " + getSabor() + "\nPreço: " + this.calculaPreco() + "\nIngredientes: " 
	+ getListaIngredientesPorPreco() + "\nCodigo: " + getCodigo() + "\n";
	}

	
}
