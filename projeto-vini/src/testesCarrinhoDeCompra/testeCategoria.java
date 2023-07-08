package testesCarrinhoDeCompra;

import java.util.ArrayList;

import entities.CarrinhoCompras;
import entities.Cliente;
import entities.Ingrediente;
import entities.Lasanha;
import entities.ListaGenerica;
import entities.Massa;
import entities.Pizza;

public class testeCategoria {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Joao");
		Cliente cli2 = new Cliente("Vinicius");
		Cliente cli3 = new Cliente("Pedro");

		Ingrediente ingrediente1 = new Ingrediente("Molho de tomate", 2000);
		Ingrediente ingrediente2 = new Ingrediente("Carne moida", 1500);

		ListaGenerica<Ingrediente> ingredientes = new ListaGenerica<Ingrediente>();

		ingredientes.add(ingrediente1);
		ingredientes.add(ingrediente2);

		Lasanha l1 = new Lasanha("Bolonhesa", ingredientes);

		Ingrediente ingrediente4 = new Ingrediente("Atum", 1000);
		Ingrediente ingrediente5 = new Ingrediente("Calabresa", 300);

		ListaGenerica<Ingrediente> ingredientes2 = new ListaGenerica<Ingrediente>();

		ingredientes2.add(ingrediente4);
		ingredientes2.add(ingrediente5);

		Pizza pizza1 = new Pizza("Mista", ingredientes2);

		ListaGenerica<Ingrediente> ingredientes3 = new ListaGenerica<Ingrediente>();

		Ingrediente ingrediente7 = new Ingrediente("Peixe", 10);
		Ingrediente ingrediente6 = new Ingrediente("Tomate", 20);

		ingredientes3.add(ingrediente7);
		ingredientes3.add(ingrediente6);

		Pizza pizza2 = new Pizza("Peixe", ingredientes3);

		ListaGenerica<Massa> listaMassas1 = new ListaGenerica<Massa>();
		listaMassas1.add(l1);

		ListaGenerica<Massa> listaMassas2 = new ListaGenerica<Massa>();
		listaMassas2.add(pizza1);

		ListaGenerica<Massa> listaMassas3 = new ListaGenerica<Massa>();
		listaMassas3.add(pizza2);

		CarrinhoCompras c1 = new CarrinhoCompras(cli1, listaMassas1);
		CarrinhoCompras c2 = new CarrinhoCompras(cli2, listaMassas2);
		CarrinhoCompras c3 = new CarrinhoCompras(cli3, listaMassas3);

		c1.getCategoria();
		c2.getCategoria();
		c3.getCategoria();

	}

}
