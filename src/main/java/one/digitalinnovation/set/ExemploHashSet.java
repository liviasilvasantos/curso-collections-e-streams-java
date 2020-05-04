/**
 * 
 */
package one.digitalinnovation.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author coruja
 *
 */
public class ExemploHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Double> notasAlunos = new HashSet<Double>();

		// adiciona as notas no set
		notasAlunos.add(5.8);
		notasAlunos.add(9.3);
		notasAlunos.add(6.5);
		notasAlunos.add(10.0);
		notasAlunos.add(5.4);
		notasAlunos.add(7.3);
		notasAlunos.add(3.8);
		notasAlunos.add(4.0);

		System.out.println(notasAlunos);

		// remove a nota do set
		notasAlunos.remove(3.8);
		System.out.println(notasAlunos);

		// retorna a quantidade de itens do set
		System.out.println(notasAlunos.size());

		// navega em todos os itens do iterator
		Iterator<Double> itNotasAlunos = notasAlunos.iterator();
		while (itNotasAlunos.hasNext()) {
			System.out.println("--->" + itNotasAlunos.next());
		}

		// for each
		for (Double nota : notasAlunos) {
			System.out.println("===>" + nota);
		}

		// clear e isempty
		System.out.println(notasAlunos.isEmpty());
		notasAlunos.clear();
		System.out.println(notasAlunos.isEmpty());

		// Collections.sort(notasAlunos);
	}

}