package pokemon.controller;

import java.util.ArrayList;
import java.io.*;

import javax.swing.JOptionPane;

import pokemon.model.*;
import pokemon.view.PokeFrame;

public class PokedexController
{
	private ArrayList<Pokemon> pokemonList;
	private PokeFrame appFrame;
	
	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>();
		addPokemon();
		appFrame = new PokeFrame(this);
		
	}
	
	public void start()
	{
		
	}
	
	public void updatePokemon(int index, String [] data)
	{
		if (data.length == 5)
		{
			Pokemon current = pokemonList.get(index);
			current.setAttackPoints(Integer.parseInt(data[0]));
			current.setEnhancementModifier(Double.parseDouble(data[1]));
			current.setHealthPoints(Integer.parseInt(data[2]));
			current.setName(data[3]);
			current.setCanEvolve(Boolean.parseBoolean(data[4]));
		}
	}
	
	private void addPokemon()
	{
		pokemonList.add(new Eevee());
		pokemonList.add(new Charmander());
		pokemonList.add(new Jigglypuff());
		pokemonList.add(new Pichu());
		pokemonList.add(new Turtwig());
	}
	
	public String[] buildPokedextext()
	{
		String [] names = new String [pokemonList.size()];
		
		for (int index = 0; index < pokemonList.size(); index++)
		{
			names[index] = pokemonList.get(index).getName();
		}
		return names;
	}
	
	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;
				
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number");
		}
		
		return isValid;
	}
	
	public boolean validDouble(String mightBeDouble)
	{
		Boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal");
		}
		
		return isValid;
	}
	
//	public String getName()
//	{
//		return name;
//	}
	
}
