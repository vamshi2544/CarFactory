/**
 * This is a repository class for Carfactory project.
 */
package carfactory;

import java.util.ArrayList;

/**
 * This class is to assemble the car with our own features.
 * @author vamshikrishna 06.21.201
 */
public class CarAssembler {
	/**
	 * @see Carlist is an arraylist to store cars
	 */
	
	private static ArrayList<Car> carList;

	
	
	/**
	 * Empty constructor
	 */
	public CarAssembler() {
	}

	
	/**
	 *  Return the car that manufactured in specific year
	 *  
	 * @param yearOfManufactur year that car manufactured
	 */
//	public static Car getCar(String makeOfcompany) {
//	    Car car1 = null;
//		for(Car car:carList) {
//			if(makeOfcompany.equalsIgnoreCase(car.getMake())) {
//				car1 = car;
//			}
//		}
//		return car1;
//			
//	}
	/**getcars is a method to grab car on basis of make of acar
	 * @param makeOfcompany
	 * @return
	 */
	public static ArrayList<Car> getCars(String makeOfcompany) {
		ArrayList<Car> carListResult = new ArrayList<Car>();
		for(Car car:carList) {
				if(car.getMake()==makeOfcompany) {
					carListResult.add(car);
				}
			}
			return carListResult;
				
		}
	/**
	 * 
	 * @param make1
	 * @return
	 */
//	public static Car getCar(double mileage) {
//		Car car1=null;
//		for (int i=0;i<carList.size();i++) {
//			if (mileage==carList.get(i).getMileage()) {
//				 car1 = carList.get(i);
//			}
//		}
//		return car1;
//		
//	}
	/**
	 * Getcars is method to grab car on basis of mileage
	 */
	public static ArrayList<Car> getCars(double mileage) {
		ArrayList<Car> carListResult = new ArrayList<Car>();
		for(Car car:carList) {
				if(car.getMileage()==mileage) {
					carListResult.add(car);
				}
			}
			return carListResult;
				
		}
		
	/**
	 * static fields
	 */
	static{
		carList = new ArrayList<Car>(); 
		Car accord = new Car("Honda",2013,23);
		Car crz=new Accord("honda", 2011, 20, 180);
		Car Insight= new Accord("honda", 2012, 22, 200);
		Car santro = new Car("Hyundai",2013,23);
		Car accent= new Accord("hyundai", 2010, 20, 200);
		Car vista = new Car("Tata",2014,23);
		Car wagon = new Accord("honda",2010,24,200);
		Car swift = new Accord("maruthi",2014,20,150);
		Car zen= new Accord("maruthi", 2010, 18, 150);
		carList.add(accord);
		carList.add(santro);
		carList.add(vista);
		carList.add(wagon);
		carList.add(swift);
		carList.add(zen);
		carList.add(accent);
		carList.add(Insight);
		carList.add(crz);
       	}
	}

