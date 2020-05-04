package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author coruja
 *
 */
public class ExercicioFinal {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();

		// adiciona 5 nomes
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");

		// navegue na lista, exibindo cada nome no console
		for (String nome : nomes) {
			System.out.print(" " + nome);
		}
		System.out.println();

		// substitua o nome Carlos por Roberto
		nomes.set(2, "Roberto");
		System.out.println(nomes);

		// retorne o nome da posição 1
		System.out.println(nomes.get(1));

		// remova o nome da posição 4
		System.out.println("removeu " + nomes.remove(4));

		// remove o nome João
		System.out.println(nomes.remove("João"));

		// verifique se o nome Juliano existe na lista
		System.out.println("Tem Juliano? " + nomes.contains("Juliano"));

		// crie uma nova lista com os nomes Ismael e Rodrigo. Adicione todos os itens da
		// nova lista na primeira lista criada
		List<String> novosNomes = new ArrayList<String>();
		novosNomes.add("Ismael");
		novosNomes.add("Rodrigo");

		nomes.addAll(novosNomes);

		// ordene os itens da lista por ordem alfabética
		Collections.sort(nomes);
		System.out.println(nomes);

		// verifique se a lista está vazia
		System.out.println("Está vazia? " + nomes.isEmpty());

		System.out.println(nomes.remove("Matheus"));

		nomes.addAll(nomes);
		System.out.println(nomes);
	}
}