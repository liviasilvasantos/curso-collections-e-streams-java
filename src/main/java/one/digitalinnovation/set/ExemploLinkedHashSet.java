/**
 * 
 */
package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author coruja
 *
 */
public class ExemploLinkedHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<Integer>();

		// adiciona os numeros no set
		sequenciaNumerica.add(16);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(1);

		System.out.println(sequenciaNumerica);

		// remove o número do set
		sequenciaNumerica.remove(4);
		System.out.println(sequenciaNumerica);

		// retorna a quantidade de itens do set
		System.out.println(sequenciaNumerica.size());

		// navega em todos os itens do iterator
		Iterator<Integer> it = sequenciaNumerica.iterator();
		while (it.hasNext()) {
			System.out.println("--->" + it.next());
		}

		for (Integer numero : sequenciaNumerica) {
			System.out.println("===>" + numero);
		}

		// retorna se o set está vazio ou não
		System.out.println(sequenciaNumerica.isEmpty());
	}

}
