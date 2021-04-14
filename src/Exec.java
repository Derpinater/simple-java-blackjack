import java.util.ArrayList;
import java.util.Scanner;

public class Exec {
  public static void main(String[] args) {
    Deck deckObj = new Deck();
    Game gameObj = new Game();
    Scanner input = new Scanner(System.in);
    int decision;

    ArrayList<Integer> cardDeck = deckObj.getDeck();
    cardDeck = deckObj.shuffleDeck(cardDeck);

  
    ArrayList<Integer> playerHand = gameObj.setPlayerHand(cardDeck);
    System.out.println("Player hand: " + playerHand);

    ArrayList<Integer> dealerHand = gameObj.setDealerHand(cardDeck);
    System.out.println("Dealer hand: " + dealerHand);
    
    do {
      System.out.print("Hit: 0, Stand: 1\nYour choice: ");
      decision = input.nextInt();
      input.nextLine();
      switch (decision) {
        case 0:
          System.out.println("HIT");
          playerHand = Exec.hit(cardDeck, playerHand);
          System.out.println("Player hand: " + playerHand);
          break;
        case 1:
          System.out.println("STAND");
          break;
        default:
          System.out.println("Invalid input");
          break;
      }
    } while (decision != 1);
    // put dealer code here
    input.close();
  }

  public static ArrayList<Integer> hit(ArrayList<Integer> targetList, ArrayList<Integer> playerHand) {
    ArrayList<Integer> newPlayerHand = playerHand;

    newPlayerHand.add(targetList.get(0));

    targetList.remove(0);

    return newPlayerHand;
  }
}
