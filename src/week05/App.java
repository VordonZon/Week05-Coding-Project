package week05;

public class App {

	public static void main(String[] args) {
		//Creates a new instance of class AsteriskLogger
		Logger aLogger = new AsteriskLogger();
	
		//Runs the methods of the aLogger object
		aLogger.log("HelloWorld");
		System.out.println();
		
		aLogger.error("HelloWorld");
		System.out.println();
		
		//Creates a new instance of class SpacedLogger
		Logger spacedLogger = new SpacedLogger();
		
		//Runs the methods of the spacedLogger object
		spacedLogger.log("NewLog");
		System.out.println();
		
		spacedLogger.error("NewLog");
		
		
	}
}
