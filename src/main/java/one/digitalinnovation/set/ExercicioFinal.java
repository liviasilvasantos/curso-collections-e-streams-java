/**
 * 
 */
package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author coruja
 *
 */
public class ExercicioFinal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();

		// adicione 5 números inteiros: 3, 88, 20, 44, 3
		numeros.add(3);
		numeros.add(88);
		numeros.add(20);
		numeros.add(44);
		numeros.add(3);

		// navegue no set exibindo cada número no console
		for (Integer numero : numeros) {
			System.out.println(numero);
		}

		// remova o primeiro item do set
		numeros.remove(3);

		// adicione um novo número no set: 23
		numeros.add(23);

		// verifique o tamanho do set
		System.out.println(numeros.size());

		// verifique se o set está vazio
		System.out.println(numeros.isEmpty());

		System.out.println(numeros);
	}

}
