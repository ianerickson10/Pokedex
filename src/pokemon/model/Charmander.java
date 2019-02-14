package pokemon.model;

public class Charmander extends Pokemon implements FireType
{
	public Charmander()
	{
		super(4,"Charmander");
	}
	
	public Charmander(String name)
	{
		super(4, name);
	}
	
	public Charmander(int num, String name)
	{
		super(num, name);
	}
}
