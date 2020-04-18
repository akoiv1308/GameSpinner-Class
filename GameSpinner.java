public class GameSpinner {

  //Fields
  private int sectors; 
  private int previousSpin; 
  private int count;

  //Constructor
  GameSpinner(int sectors) {

    this.sectors = sectors;
    previousSpin = 0;
    count = 0;

  }

  public int currentRun() { // returning the number of the current spin in the GameSpinner class //
    return count;
  }
  
  public int spin() {

    int spin = (int)(Math.random()*sectors) + 1; // spin the random number of spin // 
    if(spin==previousSpin) { //if spin and previousSpin are same
      count++; //we increment run
    }  
    else { //if spin and previousSpin are not same
      count = 1; //we reset run
      previousSpin = spin; //setting spin to previousSpin
    } 

    return spin; //returing spin

  }

}