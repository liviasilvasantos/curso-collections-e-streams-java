/**
 * 
 */
package one.digitalinnovation.map;

import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author coruja
 *
 */
public class ExemploTreeMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMap<String, String> capitais = new TreeMap<String, String>();

		// monta a árvore com as capitais
		capitais.put("RS", "Porto Alegre");
		capitais.put("SC", "Florianópolis");
		capitais.put("PR", "Curitiba");
		capitais.put("SP", "São Paulo");
		capitais.put("RJ", "Rio de Janeiro");
		capitais.put("MG", "Belo Horizonte");

		System.out.println(capitais);

		// retorna a primeira capital no topo da árvore
		System.out.println(capitais.firstKey());

		// retorna a última capital no final da árvore
		System.out.println(capitais.lastKey());

		// retorna a primeira capital abaixo na árvore da capital parametrizada
		System.out.println(capitais.lowerKey("SC"));

		// retorna a primeira capital acima na árvore da capital parametrizada
		System.out.println(capitais.higherKey("SC"));

		// retorna a primeira capital no topo da árvore
		System.out.println(capitais.firstEntry().getKey() + " - " + capitais.firstEntry().getValue());

		// retorna a última capital no final da árvore
		System.out.println(capitais.lastEntry().getKey() + " - " + capitais.lastEntry().getValue());

		// retorna a primeira capital abaixo na árvore da capital parametrizada
		System.out.println(capitais.lowerEntry("SC").getKey() + " - " + capitais.lowerEntry("SC").getValue());

		// retorna a primeira capital acima na árvore da capital parametrizada
		System.out.println(capitais.higherEntry("SC").getKey() + " - " + capitais.higherEntry("SC").getValue());

		Entry<String, String> firstEntry = capitais.pollFirstEntry();
		Entry<String, String> lastEntry = capitais.pollLastEntry();

		// retorna a primeira capital no topo da árvore, removendo do map
		System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());

		// retorna a primeira capital no final da árvore, removendo do map
		System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());

		System.out.println(capitais);
	}

}