import java.util.Observable;


public class EyeOfSauron extends Observable
{
	int hobbits = 0, elves = 0, dwarves = 0, men = 0;
	
	public void setEnemies(int hobbits, int elves, int dwarves, int men) 
	{
		this.hobbits = hobbits;
		this.elves = elves;
		this.dwarves = dwarves;
		this.men = men;
		
		this.setChanged();
	}

}
