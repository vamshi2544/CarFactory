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

	public static void Print(ArrayList<Car> carList) {
		Car car=null;
		for (int i=0;i<carList.size();i++) {
			System.out.println(car.toString());
		}
			
		}
		
	}
