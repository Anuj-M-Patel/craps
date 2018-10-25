
public class Dice {
	
	private int numOfRolls;
	
	public Dice() {
		numOfRolls = 0;
	}

	public int roll() {
		numOfRolls += 1;
		return (int)(Math.random()*6+1);
	}

	public void reset() {
		numOfRolls = 0;
	}
	
	public int getNumOfRolls() {
		return numOfRolls;
	}
}
