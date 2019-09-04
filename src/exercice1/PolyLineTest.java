/**
 * 
 */
package exercice1;

/**
 * @author Thomas LINTANF,  Gabriel RIBIER
 *
 */
public class PolyLineTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PolyLine p = new PolyLine(5);
		Point pt = new Point(1,2);
		
		
		System.out.println("Max : " + p.pointCapacity());
		for(int i = 0; i < 5 ; i++) {
			p.add(pt);
			System.out.println("Count : " + p.pointCount());
		}
		
		Point pt2 = new Point(3,2);
		System.out.println("Is " + pt2 + " in line ? " + p.contains(pt2));
		System.out.println("Is " + null + " in line ? " + p.contains(null));
	}

}
