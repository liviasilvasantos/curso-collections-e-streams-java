/**
 * 
 */
package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author coruja
 *
 */
public class ExemploTreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<String> capitais = new TreeSet<String>();

		// monta a árvore com as capitais
		capitais.add("Porto Alegre");
		capitais.add("Florianópolis");
		capitais.add("Curitiba");
		capitais.add("São Paulo");
		capitais.add("Rio de Janeiro");
		capitais.add("Belo Horizonte");

		System.out.println(capitais);

		// retorna a primeira capital no topo da árvore
		System.out.println(capitais.first());

		// retorna a última capital no final da árvore
		System.out.println(capitais.last());

		// retorna a primeira capital abaixo na árvore da capital parametrizada
		System.out.println(capitais.lower("Florianópolis"));

		// retorna a primeira capital acima na árvore da capital parametrizada
		System.out.println(capitais.higher("Florianópolis"));

		// exibe todas as capitais no console
		System.out.println(capitais);

		// retorna a primeira capital no topo da árvore, removendo do set
		System.out.println(capitais.pollFirst());

		// retorna aprimeira capital no final da árvore, removendo do set
		System.out.println(capitais.pollLast());

		System.out.println(capitais);

		// navega em todos os itens do iterator
		Iterator<String> it = capitais.iterator();
		while (it.hasNext()) {
			System.out.println("--->" + it.next());
		}

		for (String capital : capitais) {
			System.out.println("===>" + capital);
		}
	}

}