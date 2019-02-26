package pokemon.model;

public class Pokemon
{
	
	
	
	
	private int attack;
	private double enhancement;
	private int health;
	private String name;
	private boolean evolve;

	public void setAttackPoints(int attack)
	{
		this.attack = attack;
	}
	
	public void setEnhancementModifier(double enhancement)
	{
		this.enhancement = enhancement;
	}
	
	public void setHealthPoints(int health)
	{
		this.health = health;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setCanEvolve(boolean evolve)
	{
		this.evolve = evolve;
	}
	
	public String getName(String name)
	{
		return name;
	}
}
