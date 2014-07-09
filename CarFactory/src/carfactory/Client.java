/**
 * 
 */
package carfactory;

import java.io.ObjectInputStream.GetField;

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
//		CarAssembler car1=new CarAssembler();
//		CarAssembler car2=new CarAssembler("Acura","RL");
//		CarAssembler car3=new CarAssembler("Bently","continental flying",25);
//		CarAssembler car4=new CarAssembler("Jeep","Wrangler",12,4);
//		CarAssembler car5=new CarAssembler("Nissan","Altima",18,4,"manual");
//		CarAssembler car6=new CarAssembler("JAGUAR","S-TYPE",16,5,"Automatic",2009);
//		CarAssembler car7=new CarAssembler("Ferrari","360-Modena",19,5,"Automatic",2014,"yes");
		/*
		 * to print the assembled cars based on objects.
		 */
//		System.out.println(car1.toString());
//		System.out.println(car2.toString()+".");
//		System.out.println(car3.toString());
//		System.out.println(car4.toString()+",\n number of gears = "+car4.getNumberOfGears());
//		System.out.println(car5.toString()+",\n number of gears = "+car5.getNumberOfGears()+", "
//							+ "Type of Gear Tranmission "+car5.getTypeOfGearTransmission());
//		System.out.println(car6.toString()+",\n number of gears = "+car6.getNumberOfGears()+","
//							+ "Type of Gear Tranmission "+car6.getTypeOfGearTransmission()+", "
//							+ "manufactured year is "+car6.getYear());
//		System.out.println(car7.toString()+",\n number of gears = "+car7.getNumberOfGears()+","
//							+ "Type of Gear Tranmission "+car7.getTypeOfGearTransmission()+", "
//							+ "manufactured year is "+car7.getYear()+",\n Navigation system presence = "
//							+ ""+car7.getNavigationSystem());
		
//		CarAssembler c1= new CarAssembler();
//		c1.assemble(4);
		//System.out.println(c1.toString());
		/**
		 *  based on mileage,  so there is no car that has mielage 2013, so this one return null object
		 *  this method call public static Car getCar(int mileage)
		 */
//		Car car = CarAssembler.getCar("honda");
//		System.out.println(car.toString());
//		System.out.println(CarAssembler.getCar("maruthi"));
		System.out.println(CarAssembler.getCar(23).toString());
	}

}
