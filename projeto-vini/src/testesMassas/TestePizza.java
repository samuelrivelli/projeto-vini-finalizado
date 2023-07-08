package testesMassas;

import java.awt.dnd.DropTargetContext;
import java.util.ArrayList;

import entities.Ingrediente;
import entities.ListaGenerica;
import entities.Pizza;

public class TestePizza {

	public static void main(String[] args) {

		Ingrediente ingrediente1 = new Ingrediente("Molho de tomate", 5);
		Ingrediente ingrediente2 = new Ingrediente("Mussarela", 25);
		Ingrediente ingrediente3 = new Ingrediente("Calabresa", 20);

		ListaGenerica<Ingrediente> ingredientes1 = new ListaGenerica<Ingrediente>();

		ingredientes1.add(ingrediente1);
		ingredientes1.add(ingrediente2);
		ingredientes1.add(ingrediente3);

		ListaGenerica<Ingrediente> ingredientes2 = new ListaGenerica<Ingrediente>();
		ingredientes2.add(ingrediente2);

		ListaGenerica<Ingrediente> ingredientes3 = new ListaGenerica<Ingrediente>();
		ingredientes3.add(ingrediente2);
		ingredientes3.add(ingrediente3);

		Pizza pizza1 = new Pizza("Mista", ingredientes1);
		Pizza pizza2 = new Pizza("Mussarela", ingredientes2);
		Pizza pizza3 = new Pizza("Mussarela", ingredientes3);

		System.out.println(pizza1);
		System.out.println();
		System.out.println(pizza2);
		System.out.println();
		System.out.println(pizza3);
		
		Ingrediente ingrediente4 = new Ingrediente("Peito de peru", 10);
		
		pizza2.addIngrediente(ingrediente4);
		System.out.println();
		System.out.println(pizza2);
		
		pizza3.removeIngrediente(ingrediente3);
		System.out.println();
		System.out.println(pizza3);
		
		System.out.println();
		System.out.println("Contem esse ingrediente ? " + pizza1.verificaIngrediente(ingrediente4));
		
		System.out.println("Quantidade pizzas: " + Pizza.getQuantidadeMassas());

	}

}
