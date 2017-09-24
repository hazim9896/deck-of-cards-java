import java.util.*;
public class Player{
	/**
	* This method is used to create a card which contains suit and points.
	* @param points This is the first paramter to store the points of a player
	* @return int This returns the point of the player
	* @return String This returns the point of the player
	* @return toString This returns the points of the player
	* @param cards This create the 3 cards for the player
	* @return void This will distribute the 3 cards to the players 
	*/
	
	private int points = 0;
	private String point;
	private Card[] cards = new Card[3];
	

	public Player(){
		
	}
	
	public Player(int points){
		this.points = points;
	}
	
	public int getPoint(){
		return points;
	}

	
	public void addCards(Stack<Card> cards1){
		System.out.print(cards1.pop() + " ");
			
				
	}
	
	
	public String toString(){
		return " " + points ;
	}
	
	
	
	

}