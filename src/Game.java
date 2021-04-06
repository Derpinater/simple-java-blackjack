import java.util.ArrayList;

public class Game {
  public static void main(String[] args) {
    Deck deckObj = new Deck();

    ArrayList<Integer> cardDeck = deckObj.getDeck();
    cardDeck = deckObj.shuffleDeck(cardDeck);

    System.out.println(cardDeck);
    ArrayList<Integer> playerHand = setPlayerHand(cardDeck);
    System.out.println(cardDeck);
  }

  // plans to make this in a Moves.java file.
  private static ArrayList<Integer> setPlayerHand(ArrayList<Integer> targetList)  {
    ArrayList<Integer> playerHand = new ArrayList<Integer>();
    playerHand.add(targetList.get(0));
    playerHand.add(targetList.get(1));

    targetList.remove(0);
    targetList.remove(1);

    return playerHand;
  }
}
