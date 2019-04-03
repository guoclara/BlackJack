package blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


//define Dealer class here
public class Dealer extends AbstractPlayer{
    private Deck deck = new Deck();
    
    public Dealer(){
        super();
    }
    
    public void shuffle(){
        deck.shuffle();
    }
    
    public Card deal(){
        return deck.nextCard();
    }
    
    public boolean hit(){
        return true;
    }
}
	
	
	
	
	//instance variable - Deck 





	//constructors





	//method to shuffle






	//method to deal a card





	//hit method goes here
