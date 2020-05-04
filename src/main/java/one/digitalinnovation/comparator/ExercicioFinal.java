/**
 * 
 */
package one.digitalinnovation.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author coruja
 *
 */
public class ExercicioFinal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// crie uma lista de um objeto complexo
		List<Item> itens = new ArrayList<Item>();

		// adicione elementos nesta lista
		itens.add(new Item(1, "item 1"));
		itens.add(new Item(18, "item 18"));
		itens.add(new Item(2, "item 2"));
		itens.add(new Item(4, "item 4"));
		itens.add(new Item(50, "item 50"));

		System.out.println(itens);

		// ordene implementando a interface java.util.Comparator no seu objeto complexo
		Collections.sort(itens, new ItemOrdemDescricaoReversa());
		System.out.println(itens);

		// ordene implementando um novo objeto com a interface java.util.Comparable
		Collections.sort(itens);
		System.out.println(itens);

		// ordene usando uma expressão lambda na chamada de suaLista.sort()
		itens.sort((o1, o2) -> o2.getDescricao().compareTo(o1.getDescricao()));
		System.out.println(itens);

		// ordene usando referências de métodos e os métodos estáticos de Comparator
		itens.sort(Comparator.comparingInt(Item::getCodigo));
		System.out.println(itens);

		itens.sort(Comparator.comparing(Item::getDescricao));
		System.out.println(itens);

		// TODO ordene coleções TreeSet e TreeMap
	}

}