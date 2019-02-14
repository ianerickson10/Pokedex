package pokemon.model;

public class Eevee extends Pokemon implements NormalType
{
	public Eevee()
	{
		super(133, "Eevee");
	}
	
	public Eevee(String name)
	{
		super(98, name);
	}
	
	public Eevee(int num, String name)
	{
		super(num, name);
	}
}
