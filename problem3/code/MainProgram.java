import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author  Group 13
 *
 */
public class MainProgram {
	static private ArrayList<Area> list;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list = new ArrayList<Area>();
		list.add(new Rectangle(10,12));
		list.add(new Circle(12));
		list.add(new Triangle(10, 12));
		double sum = 0.0;
		for(int i=0;i<list.size();i++)
		{
			sum += list.get(i).computeArea();
		}
		System.out.println("Sum of all areas:"+sum);
	}

}
