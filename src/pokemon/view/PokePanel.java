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
	private JLabel healthLabel;
	
	public PokePanel(PokedexController appController)
	{
		super();
		this.app = app;
		
		this.appLayout = new SpringLayout();
		
		numberField = new JTextField("0");
		nameField = new JTextField("My Pokename");
		evolveField = new JTextField("false");
		attackField = new JTextField("0");
		enhancementField = new JTextField("0");
		healthField = new JTextField("0");
		
		healthLabel = new JLabel("Health");
		numberLabel = new JLabel("Number");
		evolveLabel = new JLabel("Can Evolve");
		enhancementLabel = new JLabel("Enhancement");
		attackLabel = new JLabel("Attack");
		nameLabel = new JLabel("Name");
		imageLabel = new JLabel("Picture");
		
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupScrollPane()
	{
		this.setLayout(appLayout);
		this.add(attackField);
		this.add(attackLabel);
		this.add(changeButton);
		this.add(dropdownMenu);
		this.add(enhancementField);
		this.add(enhancementLabel);
		this.add(evolveField);
		this.add(evolveLabel);
		this.add(healthField);
		this.add(healthLabel);
		this.add(imageLabel);
		this.add(nameField);
		this.add(nameLabel);
		this.add(numberField);
		this.add(numberLabel);
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
