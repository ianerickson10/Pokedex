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
	private JComboBox<String> dropdownMenu;
	
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
		
		numberField = new JTextField("number");
		nameField = new JTextField("My Pokename");
		evolveField = new JTextField("false");
		attackField = new JTextField("attack");
		enhancementField = new JTextField("enhance");
		healthField = new JTextField("health");
		
		healthLabel = new JLabel("Health");
		numberLabel = new JLabel("Number");
		evolveLabel = new JLabel("Can Evolve");
		enhancementLabel = new JLabel("Enhancement");
		attackLabel = new JLabel("Attack");
		nameLabel = new JLabel("Name");
		imageLabel = new JLabel("Picture");
		dropdownMenu = new JComboBox<String>();
		
		
		setupDropdown();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupDropdown()
	{
		
	}
	
	private void setupPanel()
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
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 169, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 46, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 41, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 6, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 0, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -51, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, -5, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 28, SpringLayout.EAST, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 144, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 6, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementLabel, 0, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 23, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 41, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 0, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 0, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, enhancementField, -10, SpringLayout.EAST, enhancementLabel);
		appLayout.putConstraint(SpringLayout.EAST, enhancementLabel, -32, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 29, SpringLayout.SOUTH, imageLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, imageLabel);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 201, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 6, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 6, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, -102, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, dropdownMenu, 0, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.SOUTH, dropdownMenu, -6, SpringLayout.NORTH, healthLabel);
		
	}
	
	private void setupListeners()
	{
		
	}
}
