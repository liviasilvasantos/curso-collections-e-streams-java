/**
 * 
 */
package one.digitalinnovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author coruja
 *
 */
public class ExemploStreamAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> estudantes = new ArrayList<String>();

		estudantes.add("Pedro");
		estudantes.add("Thayse");
		estudantes.add("Marcelo");
		estudantes.add("Carla");
		estudantes.add("Juliana");
		estudantes.add("Thiago");
		estudantes.add("Rafael");

		estudantes.stream().peek(System.out::println);

		// retorna a contagem de elementos do stream
		System.out.println("contagem: " + estudantes.stream().count());

		// retorna o elemento com maior número de letras
		System.out
				.println("maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

		// retorna o elemento com menor número de letras
		System.out
				.println("menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

		// retorna os elementos que tem a letra R no nome
		System.out.println("com a letra r no nome: "
				+ estudantes.stream().filter(e -> e.toLowerCase().contains("r")).collect(Collectors.toList()));

		// retorna uma nova coleção com os nomes concatenados a quantidade de letra de
		// cada nome
		System.out.println("retorna uma nova coleção com a quantidade de letras: " + estudantes.stream()
				.map(e -> e.concat(" - ").concat(String.valueOf(e.length()))).collect(Collectors.toList()));

		// retorna somente os 3 primeiros elementos da coleção
		System.out.println(
				"retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

		// exibe cada elemento no console e depois retorna a mesma colecao
		System.out.println(
				"retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

		// exibe cada elmento no console sem retornar outra coleção
		System.out.println("retorna os elementos novamente:");
		estudantes.stream().forEach(System.out::println);

		// retorna true se todos os elementos possuem a letra w no nome
		System.out.println("tem algum elemento com w no nome? " + estudantes.stream().allMatch(e -> e.contains("w")));

		// retorna true se algum dos elementos possuem a letra a minúscula no nome
		System.out.println(
				"tem algum elemento com a minúsculo no nome? " + estudantes.stream().anyMatch(e -> e.contains("a")));

		// retorna true se nenhum elemento possue a letra a minúscula no nome
		System.out.println("não tem nenhum elemento com a minúsculo no nome? "
				+ estudantes.stream().noneMatch(e -> e.contains("a")));

		// retorna o primeiro elemento da coleção, se existir exibe no console
		System.out.println("retorna o primeiro elemento da coleção: ");
		estudantes.stream().findFirst().ifPresent(System.out::println);

		// exemplo de operação encadeada
		System.out.println("operação encadeada: ");
		System.out.println(estudantes.stream().peek(System.out::println) // dá out para cada elemento inicial
				.map(e -> e.concat(" - ").concat(String.valueOf(e.length()))).peek(System.out::println) // dá out para
																										// cada map
																										// realizado
				.filter(e -> e.toLowerCase().contains("r")) // filtra
				.collect(Collectors.toList()) // retorna nova coleção
		);
	}

}
