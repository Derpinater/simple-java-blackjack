import java.util.ArrayList;

public class Game {

  /*
   * These are the methods that are performed by the rules of the games. This
   * involves "hit", "stand", and calclating if the dealer or the player is over
   * 21
   */

  public ArrayList<Integer> setPlayerHand(ArrayList<Integer> targetList) {
    ArrayList<Integer> playerHand = new ArrayList<Integer>();
    playerHand.add(targetList.get(0));
    playerHand.add(targetList.get(1));

    targetList.remove(0);
    targetList.remove(1);

    return playerHand;
  }

  public ArrayList<Integer> setDealerHand(ArrayList<Integer> targetList) {
    ArrayList<Integer> dealerHand = new ArrayList<Integer>();
    dealerHand.add(targetList.get(0));
    dealerHand.add(targetList.get(1));

    targetList.remove(0);
    targetList.remove(1);

    return dealerHand;
  }

  public boolean calculate(int int1, int int2) {
    int resultant = int1 + int2;
    if (resultant > 21) {
      System.out.print("You have failed");
    } else {
      // TODO main game loop
    }
    return true;
  }

  public boolean calculate(int int1, int int2, int int3) {
    int resultant = int1 + int2 + int3;
    if (resultant > 21) {
      System.out.print("You have failed");
    } else {
      // TODO main game loop
    }
    return true;
  }
}
