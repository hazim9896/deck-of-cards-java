import java.util.*;

public class Card{
	/**
	* This method is used to create a card which contains suit and points.
	* @param suit This is the first paramter create a suit for the card
	* @param point This is the second parameter create a point for the card
	* @return char This returns the suit of the card
	* @return String This returns the point of the card
	* @return toString This return the suit and point of a card
	*/

	private String value;
	private char suit;
	private String point;
	private int points = 0;

	
	public Card(){
		
	}
	
	
	public Card(char suit, String point){
		this.suit = suit;
		this.point = point;
	}
	
	public char getSuit(){
		return suit;
	}
	
	public String getPoint(){
		return point;
	}
	
	public String toString(){
		return " " + suit + point + " ";
	}
	
	
	


}

