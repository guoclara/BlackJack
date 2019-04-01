package blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class BlackJackCard extends Card
{
  	//constructors
        public BlackJackCard(int f, String s){
            super(f, s);
        }
        
        public BlackJackCard(){
            super();
        }


  	public int getValue()
  	{
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier
                int val = 0;
                if(getFace()<=10){
                    val = getFace();
                }else{
                    val = 10;
                }
                

		return val;
  	}
  	
 }