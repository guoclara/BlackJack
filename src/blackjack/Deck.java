package blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private int topCardIndex;
	private ArrayList<Card> stackOfCards;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
          
            stackOfCards = new ArrayList<Card>(52);
            
            for (int j = 1; j <= NUMFACES; j++) {
                    for (String suitString : SUITS) {
                           stackOfCards.add(new BlackJackCard(j, suitString));
                    }
            }
            topCardIndex = size();
            
		
		//loop through suits
			//loop through faces
				//add in a new card
		
	}

	//modifiers
   public void shuffle ()
	{
		//shuffle the deck
            topCardIndex =52;
            Collections.shuffle(stackOfCards);
		//reset variables as needed
       
	}

   //accessors
	public int  size ()
	{
		return stackOfCards.size();
                
	}

	public int numCardsLeft()
	{
		return topCardIndex;
	}

	public Card nextCard()
	{
            topCardIndex--;
            return stackOfCards.get(topCardIndex);
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}