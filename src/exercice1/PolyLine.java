package exercice1;

public class PolyLine {
	
	private int m_nbPts;
	
	private final int NMAXPTS = 10;
	private final Point[] m_points;
	// Question 1:
	// The max number of points should be store in as a constant in order to provide information about this value and be able to use it in different parts of the code 
	
	public PolyLine() {
		m_points = new Point[NMAXPTS];
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
		if(m_nbPts < NMAXPTS) {
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
		return NMAXPTS;
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
