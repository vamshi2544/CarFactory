/**
 * 
 */
package log4j;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * @author vamshikrishna
 *
 */
public class Log4j {
	
	 /* Get actual class name to be printed on */
	  static Logger log = Logger.getLogger(
	                      Log4j.class.getName());
	/**
	 * 
	 */
	public Log4j() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException,SQLException {
		// TODO Auto-generated method stub
		
		log.debug("Hello this is an debug message");
	     log.info("Hello this is an info message");
	}

}
