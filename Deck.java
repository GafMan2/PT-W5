package week05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>();// Here I declare an Array List of Card
	
	Deck(){ //This is my constructor 
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"}; // Here I created an Array called suits to hold all of the card suits
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
							"Nine", "Ten", "Jack", "Queen", "King", "Ace"};// Here I created an Array called numberes to hold all of the numbers in a deck of cards
		
		for (String suit : suits) { // Here I created an enhanced for loop to take me through the suits string
			int count = 2; // This counter begins with the value of 2, the 2 card and goes to the value of 14 for the Ace
			for (String number : numbers) { //Here is a nested enhanced for loop that will take me through the numbers string
				Card card = new Card(number, suit, count); // This line instantiates a new card for each card we want to create
				this.cards.add(card); // This lines puts our newly instantiated card into the cards field
				count++; // This line increments our count and creates the deck
			}
			
		}
	}
	
	public List<Card> getCards() { //Here I created the getters and setters for the field cards 
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	public void describe() { // This is the describe method so that when the deck is instantiated it can be printed to the console
		for (Card card : this.cards) { // This is an enhanced for loop for each card in this.cards will give us each card in the field Deck
			card.describe(); // This line is the describe code from our card class that will allow us to print out all the cards
		}
	}
	
	public void shuffle() { // Here is the shuffle method I imported the java util Collections class
		Collections.shuffle(this.cards); // The method shuffle is in the Collections class
	}
	
	public Card draw() { // This method is takes a deck out of the deck and places it somewhere else
		Card card = this.cards.remove(0); // Here I created a remove method that removes the card in the first index.
		return card; // On this line the removed card from the deck is returned
	}
}

