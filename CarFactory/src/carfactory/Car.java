package carfactory;

/**
 * This car class is to describe make model and mileage of a car in general.
 * @author vamshikrishna
 *06.21.2014
 */
public class Car {
	private String make;
	private int model;
	private int mileage;
	/**
	 * this is constructor for class car with 3 parameters
	 * @param make1 to take brand of a car
	 * @param model1 to know the year of manufacture
	 * @param mileage to know what is the mileage.
	 */
	public Car(String make1,int model1,int mileage1) {
		setMake(make1);
		setModel(model1);
		setMileage(mileage1);
		
	}
	/**
	 * constructor with no paramaters
	 */
	public Car() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * constructor with single parameter and default values
	 * @param make1
	 */
	public Car(String make1) {
		make = make1;
		setModel(2000);	//default values if only make is given
		setMileage(20);	
	}
	/**
	 * constructor with two parameters and one default value
	 * @param make1
	 * @param model1
	 */
	public Car(String make1,int model1) {
		make=make1;
		model=model1;
		setMileage(20);
	}
	/**Getter method for make
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**Setter method for make variable
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**getter method for Model
	 * @return the model
	 */
	public int getModel() {
		return model;
	}

	/**setter method for model
	 * @param model the model to set
	 */
	public void setModel(int model) {
		this.model = model;
	}

	/**getter method for mileage
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/**setter method for mileage
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	
	public String toString() {
		return "CAR is made by "+make+" company in the year "+model+" "
				+ "and its approximate mileage is "+mileage+"  ";
		
	}

}
