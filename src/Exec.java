import java.util.ArrayList;

public class Exec {
  public static void main(String[] args) {
    Deck deckObj = new Deck();
    Game gameObj = new Game();

    ArrayList<Integer> cardDeck = deckObj.getDeck();
    cardDeck = deckObj.shuffleDeck(cardDeck);

  
    ArrayList<Integer> playerHand = gameObj.setPlayerHand(cardDeck);
    System.out.println("Player hand: " + playerHand);

    ArrayList<Integer> dealerHand = gameObj.setDealerHand(cardDeck);
    System.out.println("Dealer hand: " + dealerHand);
    
  }
}
