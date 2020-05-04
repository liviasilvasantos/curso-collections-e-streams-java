/**
 * 
 */
package one.digitalinnovation.list;

import java.util.List;
import java.util.Vector;

/**
 * @author coruja
 *
 */
public class ExemploVector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> esportes = new Vector<String>();

		// adiciona 4 esportes no vetor
		esportes.add("Futebol");
		esportes.add("Basquetebol");
		esportes.add("Tênis de Mesa");
		esportes.add("Handebol");

		System.out.println(esportes);

		// altera o valor da posição 2 do vetor
		esportes.set(2, "Ping Pong");
		System.out.println(esportes);

		// remove o valor da posição 2
		esportes.remove(2);
		System.out.println(esportes);

		// remove o esporte Handebol do vetor
		esportes.remove("Handebol");
		System.out.println(esportes);

		// retorna o primeiro item do vetor
		System.out.println(esportes.get(0));

		// navega nos esportes
		for (String esporte : esportes) {
			System.out.println("===>" + esporte);
		}

	}

}