/**
 * 
 */
package one.digitalinnovation.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author coruja
 *
 */
public class ExerciciosTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Estudante> estudantes = new ArrayList<Estudante>();

		estudantes.add(new Estudante("Matheus", 22));
		estudantes.add(new Estudante("Carla", 65));
		estudantes.add(new Estudante("Joice", 15));
		estudantes.add(new Estudante("Talison", 19));

		System.out.println(estudantes);

		Collections.sort(estudantes);

		estudantes.sort(Comparator.reverseOrder());
		System.out.println(estudantes);

		// Collections.sort(List.of(1, 5, 0, 9, 12, 23));
		// Collections.sort(Map.of("one", 1, "five", 5, "zero", 0, "nine", 9, "twelve",
		// 12, "twenty-three", 23));
		// Collections.sort(Set.of());

		estudantes.sort((e1, e2) -> e1.getIdade() - e2.getIdade());
		System.out.println(estudantes);

		estudantes.sort((e1, e2) -> e2.getIdade() - e1.getIdade());
		System.out.println(estudantes);

		// estudantes.sort((first, second) -> first.getIdade() -
		// second.getIdade()).reversed();
	}

}
