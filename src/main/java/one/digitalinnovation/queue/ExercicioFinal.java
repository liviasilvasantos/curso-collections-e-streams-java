package one.digitalinnovation.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author coruja
 *
 */
public class ExercicioFinal {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// adicione 5 nomes
		Queue<String> nomes = new LinkedList<String>();
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");

		// navegue na fila exibindo cada nome no console
		for (String nome : nomes) {
			System.out.println(nome);
		}

		// retorne o primeiro item da fila, sem removê-lo
		System.out.println(nomes.peek());
		System.out.println(nomes);

		// retorne o primeiro item da fila, removendo o mesmo
		System.out.println(nomes.poll());
		System.out.println(nomes);

		// adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na
		// fila
		nomes.add("Daniel");

		int index = 0;
		for (String nome : nomes) {
			if (nome.equals("Daniel")) {
				break;
			}
			index++;
		}

		System.out.println(nomes);
		System.out.println("posição Daniel=" + index);

		// retorne o tamanho da lista
		System.out.println(nomes.size());

		// verifique se a lista está vazia
		System.out.println(nomes.isEmpty());

		// verifique se o nome Carlos está na lista
		System.out.println(nomes.contains("Carlos"));

		// Collections.sort(nomes);
	}
}