
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Pile {

	  private String label;
	  private ArrayList<Card> cards;
	  
	  
	  
	  public static void fill(Card[] cards) {
		    for (int i = 0; i < cards.length; i++) {
		      System.out.println(cards[i]);
		      }
		    for (int i = 0; i < cards.length; i++) {
		    	shuffle(cards);
		    }
	  }
//	  private void shuffle() {
//		    Random random = new Random();
//		    for (int i = size() - 1; i > 0; i--) {
//		      int j = random.nextInt(i);
//		      swapCards(i, j);
//		    }
//	  }
	  private static void shuffle(Card[] ar)
	  {
	    Random rnd = ThreadLocalRandom.current();
	    for (int i = ar.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      Card a = ar[index];
	      ar[index] = ar[i];
	      ar[i] = a;
	    }
	  }
	  
	  public void swapCards(int i, int j) {
		    Card temp = cards.get(i);
		    cards.set(i, cards.get(j));
		    cards.set(j, temp);
	  }
	  public Card nextCard() {
		    int i = size() - 1;
		    return popCard(i);
	  }
	  public boolean isEmpty() {
		    return cards.size() == 0;
	  }
	  public void print() {
		    System.out.println(label + ": ");
		    for (Card card: cards) {
		      System.out.println(card);
		    }
		    System.out.println();
	  }

	  public String getLabel() {
	    return label;
	  }

	  public Card getCard(int i) {
	    return cards.get(i);
	  }


	  public void addCard(Card card) {
	    cards.add(card);
	  }


	  public Card popCard(int i) {
	    return cards.remove(i);
	  }

	  public Card popCard() {
	    int i = size() - 1;
	    return popCard(i);
	  }

	
	  public int size() {
	    return cards.size();
	  }

	  public boolean empty() {
	    return cards.size() == 0;
	  }

	  
	   //Returns the last card.
	  public Card last() {
	    int i = size() - 1;
	    return cards.get(i);
	  }

	  public String toString() {
		System.out.println( label + "+ \": \" + " + cards.toString());
	    return label + ": " + cards.toString();
	    
	  }


	  public void display() {
	    System.out.println(label + ": these are  ");
	    for (Card card: cards) {
	      System.out.println(card);
	    }
	    System.out.println();
	  }

	}