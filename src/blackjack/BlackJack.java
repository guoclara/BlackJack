package blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;
import java.util.ArrayList;

public class BlackJack
{
	//add in Player instance variable
	//add in Dealer instance variable
        Player player = new Player();
        Dealer dealer = new Dealer();
        
	public BlackJack()
	{
            

	}

	public void playGame()
	{
            /*
            players= new ArrayList<Playerable>();
            Player player1 = new Player();
            Player player2 = new Player();
            Dealer dealer = new Dealer();
            players.add(player1);
            players.add(player2);
            */
            Scanner keyboard = new Scanner(System.in);
            char choice = 0;
            int playerWins = 0;
            int dealerWins = 0;
            char c = 0;
            do{
                dealer.shuffle();
                player.addCardToHand(dealer.deal());
                dealer.addCardToHand(dealer.deal());
                player.addCardToHand(dealer.deal());
                dealer.addCardToHand(dealer.deal());

                int playerTotal = player.getHandValue();
                int dealerTotal = dealer.getHandValue();

                out.println("Current " + player.toString() );
                out.println("Do you want to hit? [Y/N]");
                choice = keyboard.next().toLowerCase().charAt(0);
                keyboard.nextLine();

                while(choice == 'y'){
                    player.addCardToHand(dealer.deal());
                    out.println("Current " + player.toString() );
                    playerTotal = player.getHandValue();
                    if(playerTotal > 21){
                       out.println("\nDealer wins - Player busted!");
                       dealerWins++;
                       player.resetHand();
                       break;
                    }
                    out.println("Do you want to hit? [Y/N]");
                    choice = keyboard.next().toLowerCase().charAt(0);
                    keyboard.nextLine();

                }

                if(choice == 'n'){
                while(dealerTotal<=17){
                    dealer.addCardToHand(dealer.deal());
                    dealerTotal = dealer.getFinalHandValue();
                    if(dealerTotal > 21){
                        dealerTotal = dealer.getHandValue();
                    }
                }
                playerTotal = player.getFinalHandValue();
                dealerTotal = dealer.getFinalHandValue();

                out.println("\nPLAYER ");
                out.println("Hand Value :: " + playerTotal );
                out.println("Hand Size :: " + player.getHandSize() );
                out.println("Cards in Hand :: " + player.toString() );
                out.println("\nDEALER ");
                out.println("Hand Value :: " + dealerTotal );
                out.println("Hand Size :: " + dealer.getHandSize() );
                out.println("Cards in Hand :: " + dealer.toString() );

                if(playerTotal>21&&dealerTotal<=21)
                    {
                       out.println("\nDealer wins - Player busted!");
                       dealerWins++;
                    }
                    else if(playerTotal<=21&&dealerTotal>21)
                    {
                       out.println("\nPlayer wins - Dealer busted!");
                       playerWins++;
                    }
                    else if(playerTotal>21&&dealerTotal>21){
                       out.println("Both players bust!");
                       dealerWins++;
                    }
                    else if(playerTotal<dealerTotal){
                       out.println("\nDealer has bigger hand value!");
                       dealerWins++;
                    }
                    else if(playerTotal>dealerTotal){
                       out.println("\nPlayer has bigger hand value!");
                       playerWins++;
                    }else{
                        out.println("\nIt's a draw!");
                    }

                }

                out.println("\nDealer has won "+dealerWins+" times.");
                out.println("Player has won "+playerWins+" times.");
                
                out.println("\nDo you want to play again? [Y/N]");
                c = keyboard.next().toLowerCase().charAt(0);
                keyboard.nextLine();
                player.resetHand();
                dealer.resetHand();
            }while(c == 'y');

	}
	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
               
	}
}