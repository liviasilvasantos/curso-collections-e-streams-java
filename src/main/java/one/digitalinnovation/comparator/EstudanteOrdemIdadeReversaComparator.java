/**
 * 
 */
package one.digitalinnovation.comparator;

import java.util.Comparator;

/**
 * @author coruja
 *
 */
public class EstudanteOrdemIdadeReversaComparator implements Comparator<Estudante> {

	@Override
	public int compare(Estudante o1, Estudante o2) {
		return o2.getIdade() - o1.getIdade();
	}

}
