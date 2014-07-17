package carfactory;

/**
 * This car class is to describe make model and mileage of a car in general.
 * @author vamshikrishna
 *06.21.2014
 */
public class Car {
	private String make;
	private int model;
	private double mileage;
	private double price;
	public Car(String make1,int model1,double mileage1,double price1) {
		setMake(make1);
		setModel(model1);
		setMileage(mileage1);
		setPrice(price1);
	}
	/**
	 * this is constructor for class car with 3 parameters
	 * @param make1 to take brand of a car
	 * @param model1 to know the year of manufacture
	 * @param mileage to know what is the mileage.
	 */
	public Car(String make1,int model1,double mileage1) {
		setMake(make1);
		setModel(model1);
		setMileage(mileage1);
		
	}
	/**
	 * constructor with no paramaters
	 */
	public Car() {
	}
	/**
	 * constructor with single parameter and default values
	 * @param make1
	 */
	public Car(String make1) {
		make = make1;
		setModel(2014);	//default values if only make is given
		setMileage(20.22);	
	}
	/**
	 * constructor with two parameters and one default value
	 * @param make1
	 * @param model1
	 */
	public Car(String make1,int model1) {
		make=make1;
		model=model1;
		setMileage(20.22);
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
	 * @param model1 the model to set
	 */
	public void setModel(int model1) {
		this.model = model1;
	}

	/**getter method for mileage
	 * @return the mileage
	 */
	public double getMileage() {
		return mileage;
	}

	/**setter method for mileage
	 * @param mileage1 the mileage to set
	 */
	public void setMileage(double mileage1) {
		this.mileage = mileage1;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "CAR is made by "+make+",model is "+model+" "
				+ ", its approximate mileage is "+mileage+" ";
		
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
