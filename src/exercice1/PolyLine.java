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
	
	public void add(Point pt) {
		//Question 2:
		// if we exceed the number max of point, it will throw an exception
		
		//Question 4:
		if(m_nbPts < NMAXPTS)
			m_points[m_nbPts] = pt;
	}
	
	public int pointCapacity() {
		return NMAXPTS;
	}
}
