import java.util.*;

/**
* <h1>Deck of Cards game </h1>
* The Deck of Card program basically creates a deck of cards with a total of 52 cards containing four suits such
* as Clubs, Hearts, Spade and Diamond and also some points. The cards will be shuffled and distributed among 4 players, each player will got 3 cards. The player
* with the highest points will win.
* 
* 
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author Muhammad Zulhazim bin Barizan 1142700963
* @version 1.0
* @since 2017-09-17
*/

/**
	* This is the main method which contains the gameplay for the deck of cards.
	*/
	
public class TestGame{


	
	public static void main(String[] args){
		Stack<Card> cards1 = new Stack<>();
	
		
		cards1.push(new Card('C', "A"));
		cards1.push(new Card('C', "2"));
		cards1.push(new Card('C', "3"));
		cards1.push(new Card('C', "4"));
		cards1.push(new Card('C', "5"));
		cards1.push(new Card('C', "6"));
		cards1.push(new Card('C', "7"));
		cards1.push(new Card('C', "8"));
		cards1.push(new Card('C', "9"));
		cards1.push(new Card('C', "10"));
		cards1.push(new Card('C', "J"));
		cards1.push(new Card('C', "Q"));
		cards1.push(new Card('C', "K"));
		
		cards1.push(new Card('D', "A"));
		cards1.push(new Card('D', "2"));
		cards1.push(new Card('D', "3"));
		cards1.push(new Card('D', "4"));
		cards1.push(new Card('D', "5"));
		cards1.push(new Card('D', "6"));
		cards1.push(new Card('D', "7"));
		cards1.push(new Card('D', "8"));
		cards1.push(new Card('D', "9"));
		cards1.push(new Card('D', "10"));
		cards1.push(new Card('D', "J"));
		cards1.push(new Card('D', "Q"));
		cards1.push(new Card('D', "K"));
		
		cards1.push(new Card('H', "A"));
		cards1.push(new Card('H', "2"));
		cards1.push(new Card('H', "3"));
		cards1.push(new Card('H', "4"));
		cards1.push(new Card('H', "5"));
		cards1.push(new Card('H', "6"));
		cards1.push(new Card('H', "7"));
		cards1.push(new Card('H', "8"));
		cards1.push(new Card('H', "9"));
		cards1.push(new Card('H', "10"));
		cards1.push(new Card('H', "J"));
		cards1.push(new Card('H', "Q"));
		cards1.push(new Card('H', "K"));
		
		cards1.push(new Card('S', "A"));
		cards1.push(new Card('S', "2"));
		cards1.push(new Card('S', "3"));
		cards1.push(new Card('S', "4"));
		cards1.push(new Card('S', "5"));
		cards1.push(new Card('S', "6"));
		cards1.push(new Card('S', "7"));
		cards1.push(new Card('S', "8"));
		cards1.push(new Card('S', "9"));
		cards1.push(new Card('S', "10"));
		cards1.push(new Card('S', "J"));
		cards1.push(new Card('S', "Q"));
		cards1.push(new Card('S', "K"));
		
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		
		
		
		
		int count = 0;
		String option = " ";
			
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			System.out.println("+++ Welcome to Deck of Cards Game ++++");
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			
			System.out.print("Win Count: " + "P1 = " + p1.toString()  + "  ");
			System.out.print("P2 = " + p2.toString()  + "  ");
			System.out.print("P3 = " + p3.toString()  + "  ");
			System.out.print("P4 = " + p4.toString()  + "  " + "\n");
			System.out.println("Available cards : " + " ");
			
			Collections.shuffle(cards1);
		
			System.out.println(cards1.toString());
			
			while (cards1.empty() != true){
			count = count + 1;
			if (cards1.size() <= 4){
				System.out.println("Thank you for playing with Deck of Cards Game!");
				return;
				
				} 
				else{
					System.out.println("Press ENTER to deal cards");
					new Scanner(System.in).nextLine();
					
					System.out.println("ROUND " + count);
					System.out.print("P1 cards: ");
						p1.addCards(cards1);
						System.out.print("Total = " + p1.toString());
						System.out.println(" ");
					
					
					System.out.print("P2 cards: ");
						p2.addCards(cards1);
						System.out.print("Total = " + p2.toString());
						System.out.println(" ");
					
					
					
					System.out.print("P3 cards: ");
						p3.addCards(cards1);
						System.out.print("Total = " + p3.toString());
						System.out.println(" ");
					
					
					System.out.print("P4 cards: ");
						p4.addCards(cards1);
						System.out.print("Total = " + p4.toString());
						System.out.println(" ");
						System.out.print("Win Count: " + "P1 = " + p1.toString()  + "  ");
						System.out.print("P2 = " + p2.toString()  + "  ");
						System.out.print("P3 = " + p3.toString()  + "  ");
						System.out.print("P4 = " + p4.toString()  + "  " + "\n");
						System.out.println("Available cards : " + " ");
						System.out.println(cards1.toString());
	
				
					}

			}
					
		
		
			
			
	
}


}

