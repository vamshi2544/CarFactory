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
		/*
		 * created 6 objects with diff parameters from car1 to car6
		 */
		double mileage = 12000;
        ArrayList<Car> carList = CarAssembler.getCars(mileage);
		System.out.println(CarAssembler.getCar("maruthi"));
		System.out.println(CarAssembler.getCar(23).toString());
	}

}
