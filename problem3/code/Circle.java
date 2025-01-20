/**
 * 
 */

/**
 * @author  Group 13
 *
 */
public final class Circle implements Area {
	private double radius;
	//private double area;
	/* (non-Javadoc)
	 * @see Area#computeArea()
	 */
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		double area = Math.PI * radius * radius; 
		return area;
	}
	public Circle(double radius)
	{
		this.radius = radius;
	}
	private Circle()
	{
		
	}
	public double getradius()
	{
		return radius;
	}
	/*
	public double getArea()
	{
		return area;
	}
	*/

}
