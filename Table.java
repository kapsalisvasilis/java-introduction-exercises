
import java.util.ArrayList;
//AM 4080 VASILEIOS KAPSALIS	
public class Table {
	  private String label;
	  private ArrayList<Card> Pile;

	  
	  public Table(String label) {
	    this.label = label;
	    this.Pile = new ArrayList<Card>();
	  }

	  public String getLabel() {
	    return label;
	  }



	 public Table throwCard(Card antikeimeno) {
		 return null;
    	
     }
	 public Table drawCard(Card antikeimeno) {
		 return null;
    	
     }
	 public Table getTopCard(Card antikeimeno) {
		 return null;
    	
     }
}