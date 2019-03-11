package pokemon.view;

import javax.swing.JFrame;
import pokemon.controller.PokedexController;

public class PokeFrame extends JFrame
{
	private PokedexController appController;
	private PokePanel appPanel;
	
	public PokeFrame(PokedexController appController)
	{
		super();
		
		this.appController = appController;
		this.appPanel = new PokePanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Pokedex");
		this.setSize(900, 600);
		this.setResizable(false);
		this.setVisible(true);
	}
}
