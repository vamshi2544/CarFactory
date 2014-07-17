/**
 * 
 */
package carfactory;

import services.PriceCalculatorService;

/**
 * @author vamshikrishna
 *
 */
public class PriceCaluculatorImplementation implements PriceCalculatorService {

	private double price;

	/**
	 * 
	 */
	public PriceCaluculatorImplementation() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see services.PriceCalculatorService#calculate(carfactory.Car)
	 */
	@Override
	public  void calculate(Car car) {
		setPrice(0);
		if(car.getMileage()==20 ) {
		setPrice(2000);
		}else if (car.getMileage()>20) {
			setPrice(2500);
		}
		return price ;
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
