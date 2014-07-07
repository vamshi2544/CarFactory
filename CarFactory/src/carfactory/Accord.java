/**
 * 
 */
package carfactory;

/**
 * @author vamshikrishna
 *
 */
public class Accord extends Car {
	
	private int speed;
	
	/**
	 * @param make1
	 * @param model1
	 * @param mileage1
	 */
	public Accord(String make1, int model1, double mileage1,int speed1) {
		super(make1, model1, mileage1);
		speed=speed1;
	}



}
