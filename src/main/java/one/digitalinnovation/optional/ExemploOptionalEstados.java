/**
 * 
 */
package one.digitalinnovation.optional;

import java.util.Optional;

/**
 * @author coruja
 *
 */
public class ExemploOptionalEstados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Optional<String> opString = Optional.of("Valor Presente");
		System.out.println("valor opcional que está presente");
		System.out.println(opString.isPresent() ? opString.get() : "não está presente");

		Optional<String> opNull = Optional.ofNullable(null);
		System.out.println("Valor opcional que não está presente");
		System.out.println(opNull.isPresent() ? opNull.get() : "null = não está presente");

		Optional<String> emptyOp = Optional.empty();
		System.out.println("valor opcional que não está presente");
		System.out.println(emptyOp.isPresent() ? emptyOp.get() : "empty = não está presente");

		Optional<String> opNullErro = Optional.of(null);
		System.out.println("valor opcional que lança erro NullPointerException");
		System.out.println(opNullErro.isPresent() ? opNullErro.get() : "erro = não está presente");
	}

}