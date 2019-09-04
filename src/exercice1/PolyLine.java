package exercice1;

public class PolyLine {
	
	private int m_nbPts;
	
	private final int m_nbMaxPts;
	private final Point[] m_points;
	// Question 1:
	// The max number of points should not be store in a static field to allow each instance to have a different capacity
	
	public PolyLine(int nbMaxPts) {
		m_nbMaxPts = nbMaxPts;
		m_points = new Point[m_nbMaxPts];
		m_nbPts=0;
	}
	
	/**
	 * Add a point in the line
	 * @param pt
	 */
	public void add(Point pt) {
		//Question 2:
		// if we exceed the number max of point, it will throw an exception
		
		//Question 4:
		if(m_nbPts < m_nbMaxPts) {
			m_points[m_nbPts] = pt;
			m_nbPts++;
		}
		else {
			System.out.println("Error : Line is full !");
		}
		//Question 7:
		//add an empty spot in the points array if pt = null
	}
	
	/**
	 * Provide the number max of points
	 * @return number max of points
	 */
	public int pointCapacity() {
		return m_nbMaxPts;
	}
	
	/**
	 * Provide the current number of point in the line
	 * @return current number of points
	 */
	public int pointCount() {
		return m_nbPts;
	}
	
	/**
	 * Check if the point provided is in the PolyLine
	 * @param pt point to look for
	 * @return true if the point is in the line else false
	 */
	public boolean contains(Point pt) {
		boolean resp = false;
		
		for(Point point:m_points) {
			if(pt == point) resp = true;
		}
		
		return resp;
		
		//if arg pt = null return true if array not full else return false
	}
}
