/**
 * 
 */
package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author coruja
 *
 */
public class ExercicioFinal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> capitais = new HashMap<String, String>();

		capitais.put("RS", "Porto Alegre");
		capitais.put("PB", "João Pessoa");
		capitais.put("TO", "Palmas");
		capitais.put("RJ", "Rio de Janeiro");

		System.out.println(capitais);

		// capitais.set("RJ", "Búzios");

		capitais.put("RS", "Gravataí");

		System.out.println(capitais);

		System.out.println(capitais.containsValue("Rio de Janeiro"));

		System.out.println(capitais.get("Rio de Janeiro"));

		capitais.put("RS", "Gravataí");

		System.out.println(capitais.entrySet());

		capitais.clear();
		System.out.println(capitais);

		capitais.put("RS", "Porto Alegre");
		capitais.put("PB", "João Pessoa");
		capitais.put("TO", "Palmas");
		capitais.put("RJ", "Rio de Janeiro");

		System.out.println(capitais.get(3));
		System.out.println(capitais.get("SC"));

		capitais.put("AM", "Manaus");
		System.out.println(capitais);

		capitais.put("GO", null);
		System.out.println(capitais);

		capitais.put("RO", null);
		System.out.println(capitais);
	}

}