package Read_Write_Functions;

import org.apache.log4j.Logger;

public class Logging_Example {
	public static void main(String[] args) {
	

	// add log4j.jar
	//add log4.j properties directly in src folder
	//create the objects in the code
	
	Logger Application_Logs = Logger.getLogger("devpinoyLogger");
	Application_Logs.debug("Hello");
	Application_Logs.debug("Hello");
	Application_Logs.debug("Hello");
	Application_Logs.debug("Hello");
	
}
}
