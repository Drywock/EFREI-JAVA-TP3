/**
 * 
 */
package exercice2;

/**
 * @author Thomas LINTANF,  Gabriel RIBIER
 *
 */

import exercice1.Point;

public class FreePolyLine {
	private java.util.LinkedList<Point> m_points;
	
	public FreePolyLine() {
		m_points = new java.util.LinkedList<Point>();
	}
	
	public void add(Point pt) {
		m_points.add(pt);
	}
	
	public int pointCount() {
		return m_points.size();
	}
	
	public boolean contains(Point pt) {
		return m_points.contains(pt);
	}
	
	//Question 2 
	// the method pointCapacity will not be implemented because their is no maximum number of points
}
