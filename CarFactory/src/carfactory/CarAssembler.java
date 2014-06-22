/**
 * 
 */
package carfactory;

/**This class is to assemble the car with our own features.
 * @author vamshikrishna
 *06.21.201
 */
public class CarAssembler extends Car {
	/**
	 * @see int numberOfGears
	 * @see String typeOfGearTranmission
	 * @see int year
	 * @see String navigationSystem.
	 */
	private  int numberOfGears;
	private  String typeOfGearTransmission;
	private  int year;
	private  String navigationSystem;
	/**
	 * constructor with full parameters
	 * @param make1
	 * @param model1
	 * @param mileage1
	 * @param numberOfGears1
	 * @param typeOfGearTransmission1
	 * @param year1
	 * @param navigationSystem1
	 */
	public CarAssembler(String make1,String model1,int mileage1,int numberOfGears1,
			String typeOfGearTransmission1,int year1,String navigationSystem1) {
		super(make1, model1, mileage1);
		setNumberOfGears(numberOfGears1);
		setTypeOfGearTransmission(typeOfGearTransmission1);
		setYear(year1);
		setNavigationSystem(navigationSystem1);
		
	}
	/**
	 * constructor with only six parameterss
	 * @param make1
	 * @param model1
	 * @param mileage1
	 * @param numberOfGears1
	 * @param typeOfGearTransmission1
	 * @param year1
	 */
	public CarAssembler(String make1,String model1,int mileage1,int numberOfGears1,
			String typeOfGearTransmission1,int year1) {
		super(make1, model1, mileage1);
		setNumberOfGears(numberOfGears1);
		setTypeOfGearTransmission(typeOfGearTransmission1);
		setYear(year1);
		
	}
	/**
	 * constructor with only five parameters
	 * @param make1
	 * @param model1
	 * @param mileage1
	 * @param numberOfGears1
	 * @param typeOfGearTransmission1
	 */
	public CarAssembler(String make1,String model1,int mileage1,int numberOfGears1,
			String typeOfGearTransmission1) {
		super(make1, model1, mileage1);
		setNumberOfGears(numberOfGears1);
		setTypeOfGearTransmission(typeOfGearTransmission1);
	}
	/**
	 * constructor with only four parameters
	 * @param make1
	 * @param model1
	 * @param mileage1
	 * @param numberOfGears1
	 */
	public CarAssembler(String make1,String model1,int mileage1,int numberOfGears1) {
		super(make1, model1, mileage1);
		setNumberOfGears(numberOfGears1);
	}
	/**
	 * @param make1
	 * @param model1
	 * @param mileage1
	 */
	public CarAssembler(String make1, String model1, int mileage1) {
		super(make1, model1, mileage1);
	}

	/**
	 * Empty constructor
	 */
	public CarAssembler() {
	}

	/**constructor with only one parameter
	 * @param make1
	 */
	public CarAssembler(String make1) {
		super(make1);
	}

	/**constructor with only two parameters
	 * @param make1
	 * @param model1
	 */
	public CarAssembler(String make1, String model1) {
		super(make1, model1);
	}
	
	
	
	
	
	
	/**getter method for number of gears
	 * @return the numberOfGears
	 */
	public int getNumberOfGears() {
		return numberOfGears;
	}
	/** setter method for numberofGears
	 * @param numberOfGears the numberOfGears to set
	 */
	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}
	/**getter method for getTypeOfGearTransmission
	 * @return the typeOfGearTransmission
	 */
	public String getTypeOfGearTransmission() {
		return typeOfGearTransmission;
	}
	/**setter method for getTypeOfGearTransmission
	 * @param typeOfGearTransmission the typeOfGearTransmission to set
	 */
	public void setTypeOfGearTransmission(String typeOfGearTransmission) {
		this.typeOfGearTransmission = typeOfGearTransmission;
	}
	/**getter method for year
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**setter method for year
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**getter method for NavigationSystem
	 * @return the navigationSystem
	 */
	public  String getNavigationSystem() {
		return navigationSystem;
	}
	/**setter method for NavigationSystem
	 * @param navigationSystem the navigationSystem to set
	 */
	public void setNavigationSystem(String navigationSystem) {
		this.navigationSystem = navigationSystem;
	}

}
