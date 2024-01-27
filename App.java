package week05CodingAssignment;

import week05CodingAssignment.AppLogger.Logger;

	// 6. Create a class named App that has a main method.
	// 	  a.  In this class instantiate an instance of each of your logger classes
	//        that implement the Logger interface.
	//    b. Test both methods on both instances, passing in Strings of your choice.

public class App { // Here I created a class named App
	
    public static class AsteriskLogger implements Logger { // Here I created the AsteriskLogger class and assigned it to the variable asteriskLogger and this implements the Logger interface.
        public void log(String message) {
            System.out.println("***" + message + "***");
        }

        public void error(String message) {
            System.out.println("****************");
            System.out.println("***Error: " + message + "***");
            System.out.println("****************");
        }
    }

    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();

        asteriskLogger.log("Greetings"); // Here the log method of asteriskLogger is called and demonstrates the string encapsulated inside 3 asterisks on each side
        asteriskLogger.error("Greetings"); // Here the error method of asteriskLogger is called and demonstrates the message with Error: preceding the string contained within asterisks

        SpaceLogger spaceLogger = new SpaceLogger(); // Here I instantiate the SpaceLogger which implements the Logger interface
        SpaceLogger.SpacedLogger spacedLogger = spaceLogger.new SpacedLogger();

        spacedLogger.log("Strawberry"); // Here the log method is called and the string prints spaced out
        spacedLogger.error("Strawberry"); // Here the error method is called and the string prints spread out after the word Error:
    }
}