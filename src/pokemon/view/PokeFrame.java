package pokemon.view;

import javax.swing.JFrame;
import pokemon.controller.PokedexController;

public class PokeFrame
{
	private PokedexController appController;
	private PokePanel appPanel;
	
	public PokeFrame(PokedexController appController)
	{
		super();
		
		this.appController = appController;
		this.appPanel = new PokePanel(appPanel);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Pokedex");
		this.setSize(300, 200);
		this.setResizable(false);
		this.setVisible(true);
	}
}
