/**
 * 
 */
package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author coruja
 *
 */
public class ExemploList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Carlos");
		nomes.add("Pedro");
		nomes.add("Juliana");
		nomes.add("Anderson");
		nomes.add("Maria");
		nomes.add("João");

		System.out.println(nomes);

		nomes.set(2, "Larissa");

		System.out.println(nomes);

		Collections.sort(nomes);
		System.out.println(nomes);

		// set
		nomes.set(2, "Wesley");
		System.out.println(nomes);

		// indexOf
		System.out.println("posição do Carlos = " + nomes.indexOf("Carlos"));
		System.out.println("posição do Everton = " + nomes.indexOf("Everton"));

		// remove - index
		nomes.remove(4);
		System.out.println(nomes);

		// remove - object
		nomes.remove("Wesley");
		System.out.println(nomes);

		// for each
		for (String nome : nomes) {
			System.out.println("--->" + nome);
		}

		// iterator
		Iterator<String> it = nomes.iterator();
		while (it.hasNext()) {
			System.out.println("===>" + it.next());
		}

		// get
		System.out.println(nomes.get(1));

		// get - index out of bounds
		// System.out.println(nomes.get(5));

		// size
		System.out.println(nomes.size());

		// contains
		System.out.println("tem Anderson? " + nomes.contains("Anderson"));
		System.out.println("tem Fernando? " + nomes.contains("Fernando"));

		// isEmpty
		System.out.println("isEmpty? " + nomes.isEmpty());

		// clear
		nomes.clear();
		System.out.println(nomes);

		// isEmpty
		System.out.println("isEmpty? " + nomes.isEmpty());
	}

}
