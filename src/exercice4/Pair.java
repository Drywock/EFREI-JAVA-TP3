/**
 * 
 */
package exercice4;

/**
 * @author Thomas LINTANF, Gabriel RIBIER
 *
 */
public class Pair<U,V> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.util.HashMap<Pair<String,String>,String> map =  new java.util.HashMap<Pair<String,String>,String>();
		map.put(new Pair<String,String>("jean-paul","sartre"),"mort");
		map.put(new Pair<String,String>("elvis","presley"),"vivant");
		map.remove(new Pair<String,String>("elvis","presley"));
		System.out.println(map);
		//Output:
		// {elvis presley=vivant, jean-paul sartre=mort}
		// elvis presley is not removed
		// In order to fix this problem we have to implement the method equals
	}

	private final U first;
	private final V second;
	
	public Pair(U first, V second) {
		this.first=first;
		this.second=second;
	}
	
	public U getFirst() {
		return first;
	}
	
	public V getSecond() {
		return second;       
	}
	
	@Override
	public String toString() {
		return first+" "+second;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}
	
	
}
