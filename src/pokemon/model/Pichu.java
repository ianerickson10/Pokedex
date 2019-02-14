package pokemon.model;

public class Pichu extends Pokemon implements ElectricType
{
	public Pichu()
	{
		super(172, "Pichu");
	}
	
	public Pichu(String name)
	{
		super(172, name);
	}
	
	public Pichu(int num, String name)
	{
		super(num, name);
	}
}
