/**
 * 
 */

/**
 * @author Group 3
 *
 */
public final class Triangle implements Area {
	private double base;
	private double height;
	//private double area;
	
	/* (non-Javadoc)
	 * @see Area#comuteArea()
	 */
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		double area = 1/2 * base * height;
		return area;
	}
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	private Triangle()
	{
		
	}
	public double getBase()
	{
		return base;
	}
	public double getHeight()
	{
		return height;
	}
	/*
	public double getArea()
	{
		return area;
	}
	*/
}
