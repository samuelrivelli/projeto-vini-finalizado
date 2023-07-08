package testesCarrinhoDeCompra;

import java.util.ArrayList;

import entities.CarrinhoCompras;
import entities.Cliente;
import entities.Ingrediente;
import entities.Lasanha;
import entities.ListaGenerica;
import entities.Massa;
import entities.Pizza;

public class testeRelatorioPorPreco {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Jose Silva");
		
		Ingrediente ingrediente1 = new Ingrediente("Molho de tomate", 5);
		Ingrediente ingrediente2 = new Ingrediente("Carne moida", 20);
		
		ListaGenerica<Ingrediente> ingredientes = new ListaGenerica<Ingrediente>();

		ingredientes.add(ingrediente1);
		ingredientes.add(ingrediente2);
		
		Lasanha l1 = new Lasanha("Bolonhesa",ingredientes);
		
		Ingrediente ingrediente4 = new Ingrediente("Atum", 25);
		Ingrediente ingrediente5 = new Ingrediente("Calabresa", 20);

		ListaGenerica<Ingrediente> ingredientes1 = new ListaGenerica<Ingrediente>();

		ingredientes1.add(ingrediente1);
		ingredientes1.add(ingrediente4);
		ingredientes1.add(ingrediente5);
		
		Pizza pizza1 = new Pizza("Mista", ingredientes1);
		
		ArrayList<Massa> listaMassas = new ArrayList<Massa>();
		listaMassas.add(l1);
		listaMassas.add(pizza1);
		
		CarrinhoCompras carrinhoDeCompra = new CarrinhoCompras(cliente, listaMassas);
		
		carrinhoDeCompra.relatorioCarrinho_IngredientesPorPreco();

	}

}
