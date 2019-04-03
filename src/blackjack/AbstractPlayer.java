package blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import blackjack.Card;
import blackjack.Deck;

public abstract class AbstractPlayer implements Playerable
{
   private ArrayList<Card> hand= new ArrayList<Card>();
   private int winCount;

   //constructors
   public AbstractPlayer(){
    
}

   public  void addCardToHand( Card temp )
   {
       
       hand.add(temp);

   }

   public  void resetHand( )
   {
       for(int i = hand.size()-1; i>=0; i--){
           hand.remove(i);
       }

   }

   public  void setWinCount( int numwins )
   {
       winCount = numwins;

   }

   public int getWinCount() { 
       return winCount; 
   }

   public int getHandSize() { 
       return hand.size(); 
   }

   public int getHandValue()
   {
		//great example of polymorphism
      int total=0;

      for(Card c: hand){
          total += c.getValue();
      }

      return total;
   }
   
   public int getFinalHandValue(){
       int total=getHandValue();

      if(total<=11){
         total = 0;
         for(Card c: hand){
          if(c.getValue() == 1){
              total+=11;
          }else{
              total+=c.getValue();
          }
      }
      }

      return total;
   }

   public String toString()
   {
      //return "hand = " + hand.toString() + " \n-  # wins " + winCount;
       return "hand = " + hand.toString() + " \n-"  + getHandValue();
   }
   //public abstract boolean hit();
}