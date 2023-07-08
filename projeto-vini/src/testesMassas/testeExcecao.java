package testesMassas;

import java.util.ArrayList;

import entities.Ingrediente;
import entities.ListaGenerica;
import entities.Pizza;

public class testeExcecao {

	public static void main(String[] args) {
		Ingrediente ingrediente1 = new Ingrediente("Molho de tomate", 5);
		Ingrediente ingrediente2 = new Ingrediente("Mussarela", 25);
		Ingrediente ingrediente3 = new Ingrediente("Calabresa", 20);
		Ingrediente ingrediente4 = new Ingrediente("Atum", 20);
		
		ListaGenerica<Ingrediente> ingredientes = new ListaGenerica<Ingrediente>();

		ingredientes.add(ingrediente1);
		ingredientes.add(ingrediente2);
		ingredientes.add(ingrediente3);
		ingredientes.add(ingrediente4);
		
		Pizza pizza = new Pizza("Mista", ingredientes);
		
		System.out.println(pizza);
		
	}

}
