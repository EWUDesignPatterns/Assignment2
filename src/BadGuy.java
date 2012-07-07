import java.util.Observable;
import java.util.Observer;


public class BadGuy implements Observer
{
	private String name;
	private EyeOfSauron eye;
 
	public BadGuy(EyeOfSauron eye, String name)
	{
		this.name = name;
		this.eye = eye;
		System.out.println(name +": What is thy bidding, my master?");
		this.eye.addObserver(this);
	}

	public void defeated() 
	{
		System.out.println(name + ": My Master, I have failed you");
		this.eye.deleteObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) 
	{
		System.out.println(name + ": I see " + arg.toString());
		
	}

}
