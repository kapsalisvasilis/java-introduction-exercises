public class Player {

  private String name;
  private Table hand;

//AM 4080 VASILEIOS KAPSALIS	
  public Player(String name) {
    this.name = name;
  }

 
  public String getName() {
    return name;
  }
  public String toString() {
	    return name + " player name " ; 
	  }

 
  public Table draw() {
    return hand;
  }



}