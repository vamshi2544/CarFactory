/**
 * This class is to print values in the client class.
 */
package carfactory;

import java.util.ArrayList;

/**
 * @author vamshikrishna
 * 07.10.14
 */
public class PrintUtil {

	/**
	 * constructor with no parameters
	 */
	public PrintUtil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param carList
	 */
	public static void Print(ArrayList<Car> carList) {
		
		for (int i=0;i<carList.size();i++) {
			Car car=carList.get(i);
			System.out.println(car.toString());
		}
			
		}
		
	}
