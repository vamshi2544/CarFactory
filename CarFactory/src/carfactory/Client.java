/**
 * 
 */
package carfactory;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

/**This class is client class which extends CarAssembler class creating diff types of cars
 * @author vamshikrishna
 *06.21.2014
 */
public class Client {

	/**main method from where execution starts
	 * @param args
	 */
	public static void main(String[] args) {
		
//		PrintUtil.Print(CarAssembler.getCars(23));
//		System.out.println(" ");
		PrintUtil.Print(CarAssembler.getCars("maruthi"));
	}
}
