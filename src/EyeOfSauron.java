import java.util.Observable;


public class EyeOfSauron extends Observable
{
	
	public void setEnemies(int hobbits, int elves, int dwarves, int men) 
	{
		this.setChanged();
		notifyObservers(hobbits + " Hobbits, " + elves + " Elves, " + dwarves + " Dwarves, and "+ men + " Men");
	}

}
