/**
 * 
 */
package one.digitalinnovation.comparator;

/**
 * @author coruja
 *
 */
public class Item implements Comparable<Item> {

	private int codigo;
	private String descricao;

	public Item(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return this.codigo + " - " + this.descricao;
	}

	@Override
	public int compareTo(Item o) {
		return Integer.valueOf(this.codigo).compareTo(Integer.valueOf(o.getCodigo()));
	}
}
