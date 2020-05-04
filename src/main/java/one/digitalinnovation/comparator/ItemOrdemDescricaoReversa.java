/**
 * 
 */
package one.digitalinnovation.comparator;

import java.util.Comparator;

/**
 * @author coruja
 *
 */
public class ItemOrdemDescricaoReversa implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		return o2.getDescricao().compareTo(o1.getDescricao());
	}

}
