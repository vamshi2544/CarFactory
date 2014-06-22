/**
 * 
 */
package carfactory;

/**
 * @author vamshikrishna
 *
 */
public class Accord extends Car {

	/**
	 * @param make1
	 * @param model1
	 * @param mileage1
	 */
	public Accord(String make1, int model1, int mileage1) {
		super(make1, model1, mileage1);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accord a = new Accord("Honda", 2010, 22);
		System.out.println(a.toString());
		
		Car s=new Car();
		s.setMake("Nissan");
		System.out.println(s.toString());
	}

}
