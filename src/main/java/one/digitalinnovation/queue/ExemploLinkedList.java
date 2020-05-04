/**
 * 
 */
package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author coruja
 *
 */
public class ExemploLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<String> filaBanco = new LinkedList<String>();

		filaBanco.add("Pamela");
		filaBanco.add("Patrícia");
		filaBanco.add("Roberto");
		filaBanco.add("Flávio");
		filaBanco.add("Anderson");

		System.out.println(filaBanco);

		String clienteASerAtendido = filaBanco.poll();

		System.out.println(clienteASerAtendido);
		System.out.println(filaBanco);

		String primeiroCliente = filaBanco.peek();

		System.out.println(primeiroCliente);
		System.out.println(filaBanco);

		// filaBanco.clear();
		// deve lancar erro
		String primeiroClienteComErro = filaBanco.element();
		System.out.println(primeiroClienteComErro);
		System.out.println(filaBanco);

		for (String cliente : filaBanco) {
			System.out.println(cliente);
		}

		Iterator<String> itFilaBanco = filaBanco.iterator();
		while (itFilaBanco.hasNext()) {
			System.out.println("--->" + itFilaBanco.next());
		}

		System.out.println(filaBanco.size());

		System.out.println(filaBanco.isEmpty());
		filaBanco.clear();
		System.out.println(filaBanco.isEmpty());
	}

}