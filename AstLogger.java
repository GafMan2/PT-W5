package week05CodingAssignment;

import week05CodingAssignment.AppLogger.Logger;

public class AstLogger {
	
    // 3. Create two classes that implement the Logger interface:
    // a. AsteriskLogger

    public static class AsteriskLogger implements Logger { // On this line The AsteriskLogger class implements the Logger interface that provides for implementations for log and error methods
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
    // Within the main method an instance of the AsteriskLogger class 
    // is created and assigned to the variable asteriskLogger and this implements
    // the Logger interface    

        asteriskLogger.log("Hello"); // The log method prints the message surrounded by three asterisks on each side
        asteriskLogger.error("Hello"); // The error method prints the message inside a box of asterisks, preceded by the word Error:
    }
}
