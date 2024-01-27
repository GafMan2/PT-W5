package week05CodingAssignment;

import week05CodingAssignment.AppLogger.Logger;

	//5. Implement the SpacedLogger methods:
	// a. If the log method received “Hello” as an argument, it should print H e l l o
	// b. The error method should do the same, but with “ERROR:” preceding the spaced out input (
	//    i.e. ERROR: H e l l o)

public class SpaceLogger { // On this line I define the class named SpaceLogger

    public class SpacedLogger implements Logger { // the SpaceLogger class implements the Logger interface for the log and error methods
        public void log(String message) {
            String spacedMessage = String.join(" ", message.split(""));
            System.out.println(spacedMessage);
        }

        public void error(String message) {
            String spacedError = String.join(" ", message.split("")) + " " + String.join(" ", (""));
            System.out.println("Error: " + spacedError);
        }
    }

    public static void main(String[] args) { 
        Logger spacedLogger = new SpaceLogger().new SpacedLogger(); // Within the main method an instance of the SpacedLogger class is created and assigned to the variable spacedLogger
        spacedLogger.log("Hello"); // The log method takes a message, splits it into individual characters, and then joins the characters with a space in between.
        spacedLogger.error("Hello"); // The error method does the same thing but adds the word Error: before the spaced characters
    }
}