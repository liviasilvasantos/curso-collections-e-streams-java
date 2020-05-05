/**
 * 
 */
package one.digitalinnovation.optional;

import java.util.Optional;
import java.util.OptionalDouble;

/**
 * @author coruja
 *
 */
public class ExerciciosTeste {

	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		Optional emptyOpcional = Optional.empty();

		System.out.println(emptyOpcional.isPresent());

		emptyOpcional.orElseThrow(IllegalStateException::new);

		// System.out.println(emptyOpcional.isEmpty());
		// System.out.println(emptyOpcional.get());

		// Optional<String> dois = Optional<String>.of(255);
		Optional.empty();

		Optional carla = Optional.ofNullable("Carla");
		System.out.println(carla.get());

		OptionalDouble doub = OptionalDouble.of(25.5);
		System.out.println(doub.getAsDouble());

		Optional<String> str = Optional.of("23");

		Optional nill = Optional.of(null);
		System.out.println(nill.isPresent());
	}

}
