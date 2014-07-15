/**
 * 
 */
package carfactory;

import java.util.ArrayList;

/**
 * @author vamshikrishna
 *
 */
public class PrintUtil {

	/**
	 * 
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
