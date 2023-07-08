package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import excecoes.ExcessoDeIngredientesException;

public abstract class Massa {
	private String sabor;
	private ListaGenerica<Ingrediente> listaIngredientes = new ListaGenerica<Ingrediente>();
	private static int contador = 0;
    private String codigo;
    
	
	public Massa(String sabor, ListaGenerica<Ingrediente> listaIngredientes) {
		this.sabor = sabor;
		try {
			this.setListaIngredientes(listaIngredientes);
		} catch (ExcessoDeIngredientesException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		contador++;
		this.codigo = getCodigoLetra() + contador;
		
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	
	public static int getQuantidadeMassas() {
		return contador;
	}
	
	public ArrayList<Ingrediente> getListaIngredientesPorOrdemAlfabetica() {
	    List<Ingrediente> ingredientesPorOrdemAlfabetica = new ArrayList<>(listaIngredientes);
	    Collections.sort(ingredientesPorOrdemAlfabetica , new Comparator<Ingrediente>() {
	        public int compare(Ingrediente ingrediente1, Ingrediente ingrediente2) {
	            return ingrediente1.getIngrediente().compareTo(ingrediente2.getIngrediente());
	        }
	    });
	    return new ArrayList<>(ingredientesPorOrdemAlfabetica);
	    }
	
	public ArrayList<Ingrediente> getListaIngredientesPorPreco() {
	    List<Ingrediente> listaOrdenadaPorPrecoDoIngrediente = new ArrayList<>(listaIngredientes);
	    Collections.sort(listaOrdenadaPorPrecoDoIngrediente, new Comparator<Ingrediente>() {
	        public int compare(Ingrediente ingrediente1, Ingrediente ingrediente2) {
	            return Double.compare(ingrediente1.getPreco(), ingrediente2.getPreco());
	        }
	    });
	    return new ArrayList<>(listaOrdenadaPorPrecoDoIngrediente);
	}
	
	public void setListaIngredientes(ListaGenerica<Ingrediente> listaIngredientes) throws ExcessoDeIngredientesException {
		if(listaIngredientes.size()>=4) {
			throw new ExcessoDeIngredientesException("Não é permitido criar massas com mais de 4 ingredientes!");
		}
		this.listaIngredientes = listaIngredientes;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public abstract String getCodigoLetra();
	
	public void addIngrediente(Ingrediente ingrediente) {
		listaIngredientes.add(ingrediente);
	}
	
	public void removeIngrediente(Ingrediente ingrediente) {
		listaIngredientes.remove(ingrediente);
	}
	
	public boolean verificaIngrediente(Ingrediente ingrediente) {
		if(listaIngredientes.contains(ingrediente)) {
			return true;
		}
		return false;
	}
	
	public abstract double calculaPreco();
	
	public abstract String getDescricao();
	
	public abstract String toString();
	public abstract String toStringPorPreco();
	
	
}
