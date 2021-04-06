import java.util.ArrayList;
import java.util.Random;

public class Deck {
  // feilds
  private ArrayList<Integer> cleanDeck = new ArrayList<Integer>();

  // constructors

  public Deck() {
    setCleanDeck();
  }

  // methods
  public void prefaceCardValues() {
    System.out.printf("--------Prefacing the Card Values!--------%n%n");

    ArrayList<String> cardNames = new ArrayList<String>();
    for (DeckName el : DeckName.values()) {
      cardNames.add(el.toString());
    }

    for (int i = 1; i < 15; i++) {
      System.out.printf("%-2d ... %-5s ", i, cardNames.get(i - 1));
      if (i % 2 == 0) {
        System.out.println();
      }
    }
  }

  public void setCleanDeck() {
    ArrayList<Integer> cleanDeck = new ArrayList<Integer>();

    for (int i = 0; i < 14; i++) {
      for (int j = 0; j < 4; j++) {
        cleanDeck.add(i + 1);
      }
    }

    this.cleanDeck = cleanDeck;
  }

  public ArrayList<Integer> setCleanDeck(ArrayList<Integer> inputDeck) {
    ArrayList<Integer> outputDeck = new ArrayList<Integer>();

    for (int i = 0; i < 14; i++) {
      for (int j = 0; j < 4; j++) {
        outputDeck.add(i + 1);
      }
    }

    return outputDeck;
  }

  public void shuffleDeck() {
    Random rand = new Random();

    ArrayList<Integer> cleanDeck = new ArrayList<Integer>();
    for (int i = 0; i < 13; i++) {
      for (int j = 0; j < 4; j++) {
        cleanDeck.add(rand.nextInt(14) + 1);
      }
    }

    this.cleanDeck = cleanDeck;
  }

  public ArrayList<Integer> shuffleDeck(ArrayList<Integer> inputDeck) {
    Random rand = new Random();

    ArrayList<Integer> outputDeck = new ArrayList<Integer>();
    for (int i = 0; i < 13; i++) {
      for (int j = 0; j < 4; j++) {
        outputDeck.add(rand.nextInt(14) + 1);
      }
    }

    return outputDeck;
  }

  public ArrayList<Integer> getDeck() {
    return cleanDeck;
  }
}