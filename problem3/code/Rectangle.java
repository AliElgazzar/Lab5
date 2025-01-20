/**
 * 
 */

/**
 * @author Group 13
 *
 */
public final class Rectangle implements Area {
	private double width;
	private double length;
	//private double area;

	/* (non-Javadoc)
	 * @see Area#computeArea()
	 */
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		double area =  width * length;
		return area;
	}
	public Rectangle(double width, double length)
	{
		this.width = width;
		this.length = length;
	}
	private Rectangle()
	{
		
	}
	public double getWidth()
	{
		return width;
	}
	public double getLength()
	{
		return length;
	}
}
