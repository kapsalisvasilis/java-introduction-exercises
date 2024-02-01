public class Card {
	

  public static final String[] RANKS = {
      null, "Ace", "2", "3", "4", "5", "6", "7",
      "8", "9", "10", "Jack", "Queen", "King"};
  public static final String[] SUITS = {
      "Clubs", "Diamonds", "Hearts", "Spades"};

  private int rank;
  private int suit;

  public Card(int rank, int suit) {
    this.rank = rank;
    this.suit = suit;
  }
  public void setRank  (int rank) {
	   this.rank = rank;
  }
  public void setSuit (int suit) {
	  this.suit = suit;
  }

  public int getRank() {
    return rank;
  }

  public int getSuit() {
    return suit;
  }  

  public String toString() {
    return RANKS[rank] + " are the ranks and these are the suits" + SUITS[suit]; 
  }

  public boolean equals(Card that) {
    return rank == that.rank
        && suit == that.suit;
  }
  public boolean isEight(Card that) {
	    if (that.rank == 8 )
	    	return true;
	    else 
	    	return false;
  }
  public boolean matches(Card that, Card that1) {
	    if (that.rank == that1.rank )
	    	return true;
	    if (that.suit == that1.suit )
	    	return true;
	    else 
	    	return false;
  }
}