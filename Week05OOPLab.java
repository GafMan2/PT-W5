//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Object Oriented Programming
// Java Week 05 Lab  
//
package week05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week05OOPLab {

	// This Lab will give you a basic look at creating an Object Oriented Card Game.  
	//		The idea here is to prepare you for your Week 6 Unit Final Project.
	//		There are many ways to implement this Lab, please use the tools that you know,
	//		and go from there.
	// These exercises are intended to be coded in order 1 through 5.
		
	
	public static void main(String[] args) {
	
		
		// A standard deck of playing cards has 52 cards as specified below 
		//		i. There are 4 suits:  Clubs, Diamonds, Hearts, & Spades
		//				
		//	   ii. Each suit has 13 cards:  Two, Three, Four, Five, Six, Seven, 
		//									 Eight, Nine, Ten, Jack, Queen, King & Ace
		//
		//	  iii. Comparing Cards:  When comparing two cards, Ace is high and Two is low.
		//							 to make this easy, a Two will have a value of 2, a
		//							 Three will have a value of 3, ... and an Ace will have
		//							 a value of 14.
		//
	
		
		// 1. Card Class:
		//		Create a class called Card to represent a standard playing card. 
		//		Fields:   The Card class should have the following fields:
		// 			a. name field
		//			b. suit field
		//			c. value field for comparing against other cards.
		//
		//		Methods:  This class can have any useful method.
		//			a. describe() to display the card information to the Console.
		//			b. Getters & Setters 
		//
		System.out.println("\nQuestion 1: Card Class");
		// Add your code here to instantiate a Card
		Card card = new Card("Two", "Hearts", 2);
		card.describe(); 
		
		// Call the describe method on the newly instantiated card.
		
		
		
		

		// 2. Deck Class:
		//		Create a class called Deck.
		//		Fields:  This class should have a list of Card field called cards 
		//				 that will hold all the cards in the deck. 
		//			List<Card> cards = new ArrayList<Card>(); 
		//
		//		Constructor: The constructor for the Deck Class should
		// 			instantiate all 52 standard playing cards and add them to the cards list.
		//
		//		Methods:  
		//			a.  describe() to describe the deck to the Console -- 
		//					print out all of the cards in the deck.
		//
		System.out.println("\nQuestion 2: Deck Class");
	    // Add your code here to instantiate a Deck	
	    Deck deck = new Deck(); // Here I instantiate the deck by using the deck class and name it deck
	    
	    // Call the describe method on the newly instantiated deck.
	    deck.describe(); // Here I entered deck.describe to call the newly instantiated deck
	    
	    
	    
		
		
		// 3. Deck shuffle() Method:
		//		Add a shuffle method within the Deck Class
		System.out.println("\nQuestion 3: Deck shuffle() method");
		// Test your method here
		deck.shuffle(); // On this line we are calling the method that shuffles the cards in random order
		
		
		// Call the describe method on the newly shuffled deck.
		// deck.describe(); // On this line the deck in random order is printed to the console
		
		
		
		// 4. Deck draw() Method:
		//		Add a draw method within the Deck Class
		System.out.println("\nQuestion 4: Deck draw() method");
		// Test your method here
		Card drawnCard = deck.draw(); // Here I created a new card variable drawnCard
		drawnCard.describe(); // When I describe drawnCard it will return the card in the first index
		
		
		
		
		
		
		// 5. Create Game Board:
		//		Create and test a method that takes an int as a parameter (representing the
		// 			number of players for a game) and returns a Map<String, List<Card>>
		// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
		//			and their cards.
		//
		// 			The method should create a new instance of Deck, shuffle it,
		// 			and deal the cards out to the "players" in the Map.
		System.out.println("\nQuestion 5: Create Game");
		// Call your method here
		Map<String, List<Card>> gameBoard = new HashMap<>();
		int numberOfPlayers = 4; // This line defines the number of players
		gameBoard = createGame(numberOfPlayers);
		
		System.out.println("--------------------------------------"); // This places a border to the information
		for (int i = 1; i <= numberOfPlayers; i++) { // In this line we are going from 1 to the number of players incrementing
			String playerName = "Player " + i;
			System.out.println(playerName + "\n----------"); // This line will print the player name and dashes underneath those variables
			List<Card> playerList = gameBoard.get(playerName); // This line returns the list from the map 
			for (Card handCard : playerList) { // This enhanced for loop grabs every card from the playerList
				handCard.describe(); // This line prints out the cards in each player's hand
			}
			System.out.println("--------------------------------------"); // This line puts a border between every player.
		}
		
		
		
		
		
		
	} 
	
	// Method 5:
	
	public static Map<String, List<Card>> createGame (int numOfPlayers){ // This method takes an integer as a parameter (# of players) and returns a map of string (that contains the players) 
		Map<String, List<Card>> finalGameBoard = new HashMap<>(); //   
		Deck deck = new Deck(); // This line returns a deck of cards in this method
		deck.shuffle(); // This line shuffles the deck, which is a new instantiation of deck within our method
		System.out.println("Deck has " + deck.getCards().size() + " cards!"); // This line prints out how many cards are in the deck
		
		for (int i = 1; i <= numOfPlayers; i++){ // This is a for loop that starts at 1 and continues until we hit the number of players and then will increment our index
			List<Card> playerList = new ArrayList<>(); // This is a new array list called playerList that contains number of players
			String playerName = "Player " + i; // This is a new array list called playerName that contains the names of all players
			finalGameBoard.put(playerName, playerList); // This line puts playerName and playerList into our Map
		}
		
		for (int i = 0; i < 52/numOfPlayers; i++) { // This is a for loop that starts at 0 and continues until i < 52/players
			for (int j = 1; j <= numOfPlayers; j++) { // This is a nested for loop that loops through number of players 
				String playerName = "Player " + j; // This line uses the j index for the number of players
				List<Card> playerList =finalGameBoard.get(playerName); // This line gets the list of cards in the final game board
				playerList.add(deck.draw()); // This line will add a card to that list
				finalGameBoard.replace(playerName, playerList); // This line replaces the card from that list
			}
	}
		return finalGameBoard; // This line is a required return type of our method and it returns our finalGameBoard
	}
}