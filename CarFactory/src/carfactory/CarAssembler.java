/**
 * 
 */
package carfactory;

import java.util.ArrayList;

/**
 * This class is to assemble the car with our own features.
 * 
 * @author vamshikrishna 06.21.201
 */
public class CarAssembler {
	/**
	 * @see int numberOfGears
	 * @see String typeOfGearTranmission
	 * @see int year
	 * @see String navigationSystem.
	 */
	private static int numberOfGears;
	private static String typeOfGearTransmission;
	private static int year;
	private static String navigationSystem;
	private static ArrayList<Car> carList;

	/**
	 * constructor with full parameters
	 * 
	 * @param make1
	 * @param model1
	 * @param mileage1
	 * @param numberOfGears1
	 * @param typeOfGearTransmission1
	 * @param year1
	 * @param navigationSystem1
	 */
	public CarAssembler(int numberOfGears1, String typeOfGearTransmission1,
			int year1, String navigationSystem1) {

		setNumberOfGears(numberOfGears1);
		setTypeOfGearTransmission(typeOfGearTransmission1);
		setYear(year1);
		setNavigationSystem(navigationSystem1);

	}

	/**
	 * constructor with only 3 parameterss
	 * 
	 * @param make1
	 * @param model1
	 * @param mileage1
	 * @param numberOfGears1
	 * @param typeOfGearTransmission1
	 * @param year1
	 */
	public CarAssembler(int numberOfGears1, String typeOfGearTransmission1,
			int year1) {

		setNumberOfGears(numberOfGears1);
		setTypeOfGearTransmission(typeOfGearTransmission1);
		setYear(year1);

	}

	/**
	 * constructor with only 2 parameters
	 * 
	 * @param make1
	 * @param model1
	 * @param mileage1
	 * @param numberOfGears1
	 * @param typeOfGearTransmission1
	 */
	public CarAssembler(int numberOfGears1, String typeOfGearTransmission1) {

		setNumberOfGears(numberOfGears1);
		setTypeOfGearTransmission(typeOfGearTransmission1);
	}

	/**
	 * constructor with single parameter
	 * 
	 * @param make1
	 * @param model1
	 * @param mileage1
	 * @param numberOfGears1
	 */
	public CarAssembler(int numberOfGears1) {

		setNumberOfGears(numberOfGears1);
	}

	
	/**
	 * Empty constructor
	 */
	public CarAssembler() {
	}

	
	/**
	 * getter method for number of gears
	 * 
	 * @return the numberOfGears
	 */
	public int getNumberOfGears() {
		return numberOfGears;
	}

	/**
	 * setter method for numberofGears
	 * 
	 * @param numberOfGears
	 *            the numberOfGears to set
	 */
	public static  void setNumberOfGears(int numberOfGears1) {
		numberOfGears = numberOfGears1;
	}

	/**
	 * getter method for getTypeOfGearTransmission
	 * 
	 * @return the typeOfGearTransmission
	 */
	public String getTypeOfGearTransmission() {
		return typeOfGearTransmission;
	}

	/**
	 * setter method for getTypeOfGearTransmission
	 * 
	 * @param typeOfGearTransmission
	 *            the typeOfGearTransmission to set
	 */
	public static void setTypeOfGearTransmission(String typeOfGearTransmission1) {
		typeOfGearTransmission = typeOfGearTransmission1;
	}

	/**
	 * getter method for year
	 * 
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * setter method for year
	 * 
	 * @param year
	 *            the year to set
	 */
	public static void setYear(int year1) {
		year = year1;
	}

	/**
	 * getter method for NavigationSystem
	 * 
	 * @return the navigationSystem
	 */
	public String getNavigationSystem() {
		return navigationSystem;
	}

	/**
	 * setter method for NavigationSystem
	 * 
	 * @param navigationSystem
	 *            the navigationSystem to set
	 */
	public static void setNavigationSystem(String navigationSystem1) {
		navigationSystem = navigationSystem1;
	}

	
	public static void assemble(int numberOfGears1, String typeOfGearTransmission1,
			int year1, String navigationSystem1) {

		setNumberOfGears(numberOfGears1);
		setTypeOfGearTransmission(typeOfGearTransmission1);
		setYear(year1);
		setNavigationSystem(navigationSystem1);

	}

	public static void assemble(int numberOfGears1, String typeOfGearTransmission1,
							int year1) {

		setNumberOfGears(numberOfGears1);
		setTypeOfGearTransmission(typeOfGearTransmission1);
		setYear(year1);
		setNavigationSystem("Available");

	}
	public static void assemble(int numberOfGears1, String typeOfGearTransmission1) {

		setNumberOfGears(numberOfGears1);
		setTypeOfGearTransmission(typeOfGearTransmission1);
		setYear(2014);
		setNavigationSystem("Available");

	}
	public static void assemble(int numberOfGears1) {

		setNumberOfGears(numberOfGears1);
		setTypeOfGearTransmission("Automatic");
		setYear(2014);
		setNavigationSystem("Available");

	}
	
	public String toString() {
		return "number of gears = "+getNumberOfGears()+
				" ,transmission type = "+getTypeOfGearTransmission()
				+" ,year= "+getYear()+" navigation sys = "+getNavigationSystem(); 
		
	}
	/**
	 *  Return the car that manufactured in specific year
	 *  
	 * @param yearOfManufactur year that car manufactured
	 */
	public static Car getCar(String makeOfcompany) {
	    Car car1 = null;
		for(Car car:carList) {
			if(makeOfcompany.equalsIgnoreCase(car.getMake())) {
				car1 = car;
			}
		}
		return car1;
			
	}
	/**
	 * 
	 * @param make1
	 * @return
	 */
	public static Car getCar(int mileage) {
		Car car1=null;
		for (int i=0;i<carList.size();i++) {
			if (mileage==carList.get(i).getMileage()) {
				car1=carList.get(i);
			}
		}
		return car1;
		
	}
	/**
	 * static fields
	 */
	static{
		carList = new ArrayList<Car>(); 
		Car accord = new Car("Honda",2013,23);
		Car santro = new Car("Hyundai",2013,23);
		Car vista = new Car("Tata",2014,23);
		Car wagon = new Accord("maruthi",2010,24,200);
		carList.add(accord);
		carList.add(santro);
		carList.add(vista);
		carList.add(wagon);
       	}
	}

