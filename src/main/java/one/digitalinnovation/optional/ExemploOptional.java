/**
 * 
 */
package one.digitalinnovation.optional;

import java.util.Optional;

/**
 * @author coruja
 *
 */
public class ExemploOptional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Optional<String> opString = Optional.of("valor opcional");

		System.out.println(opString.isPresent());
		// System.out.println(opString.isEmpty());

		opString.ifPresent(System.out::println);

		if (opString.isPresent()) {
			String valor = opString.get();
			System.out.println(valor);
		}

		opString.map((valor) -> valor.concat("***")).ifPresent(System.out::println);

		opString = Optional.empty();
		opString.orElseThrow(IllegalStateException::new);
	}

}
