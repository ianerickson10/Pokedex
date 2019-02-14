package pokemon.model;

public class Jigglypuff extends Pokemon implements FairyType, NormalType
{
	public Jigglypuff()
	{
		super(39, "Jigglypuff");
	}
	
	public Jigglypuff(String name)
	{
		super(39, name);
	}
	
	public Jigglypuff(int num, String name)
	{
		super(num, name);
	}
}
