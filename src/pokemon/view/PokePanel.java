package pokemon.view;

import javax.swing.*;
import pokemon.controller.PokedexController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;

public class PokePanel extends JPanel
{
	private PokedexController app;
	private SpringLayout appLayout;
	
	private JButton changeButton;
	private JComboBox dropdownMenu;
	
	private JTextField numberField;
	private JTextField nameField;
	private JTextField evolveField;
	private JTextField attackField;
	private JTextField enhancementField;
	private JTextField healthField;
	
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel evolveLabel;
	private JLabel attackLabel;
	private JLabel enhancementLabel;
	private JLabel imageLabel;
	
	public PokePanel(PokedexController appController)
	{
		super();
		this.app = app;
		
		this.appLayout = new SpringLayout();
		
		numberField = new
		
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupScrollPane()
	{
		
		this.setLayout(appLayout);
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
