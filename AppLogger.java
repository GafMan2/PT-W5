package week05CodingAssignment;

public class AppLogger {
	
	// 1. Create an interface named Logger.
		public interface Logger {  // On this line I create an interface named Logger
			
	// 2. Add two void methods to the Logger interface, each should take a String as an argument:
	// a. log
	// b. error
		    void log(String message); // Here I added a void method called log that takes a string message
		    void error(String message); // Here I added a void method called error that takes a string message
		}

	public static void main(String[] args) {

	}
}
