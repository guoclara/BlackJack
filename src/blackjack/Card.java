package blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


public abstract class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;
        

  	//constructors
        public Card(int f, String s){
            face = f;
            suit = s;
        }
        public Card(){
            face = 0;
            suit = "";
        }

  	public abstract int getValue();

	public boolean equals(Card obj)
	{
                if(this.getSuit().equals(obj.getSuit())&&this.getFace() == obj.getFace()){
                    return true;
                }

		return false;
	}
        
        public String toString(){
            return FACES[face]+" of "+getSuit()+" | value = "+getValue();
        }

  	//toString

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the face
     */
    public int getFace() {
        return face;
    }

    /**
     * @param face the face to set
     */
    public void setFace(int face) {
        this.face = face;
    }
  	
 }