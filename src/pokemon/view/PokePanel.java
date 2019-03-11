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
//	private JButton saveButton;
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
	
	private ImageIcon pokemonIcon;
	
	public PokePanel (PokedexController app)
	{
		super();
		this.app = app;
		
		this.appLayout = new SpringLayout();
		
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png"));
		
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
		imageLabel = new JLabel("Picture", pokemonIcon, JLabel.CENTER);
		dropdownMenu = new JComboBox<String>();
//		saveButton = new JButton("Save");
		changeButton = new JButton("Change");
		
		
		
		setupDropdown();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupDropdown()
	{
		DefaultComboBoxModel temp = new DefaultComboBoxModel(app.buildPokedextext());
		dropdownMenu.setModel(temp);
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
//		this.add(saveButton);
		
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 169, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 6, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberLabel, -51, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, -5, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 28, SpringLayout.EAST, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 144, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, enhancementField, -10, SpringLayout.EAST, enhancementLabel);
		appLayout.putConstraint(SpringLayout.EAST, enhancementLabel, -32, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 29, SpringLayout.SOUTH, imageLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, imageLabel);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 201, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 6, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 6, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, -102, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 41, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -3, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 46, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, enhancementLabel);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementLabel, 23, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 6, SpringLayout.SOUTH, enhancementLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.SOUTH, attackLabel, -6, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 1599, SpringLayout.NORTH, imageLabel);
		appLayout.putConstraint(SpringLayout.WEST, dropdownMenu, 32, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, dropdownMenu, -53, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, dropdownMenu);
		appLayout.putConstraint(SpringLayout.NORTH, changeButton, 6, SpringLayout.SOUTH, dropdownMenu);
		appLayout.putConstraint(SpringLayout.WEST, changeButton, 10, SpringLayout.WEST, this);

//		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -10, SpringLayout.SOUTH, this);
//		appLayout.putConstraint(SpringLayout.EAST, saveButton, -10, SpringLayout.EAST, this);
	}
	
	private void sendDataToController()
	{
		int index = dropdownMenu.getSelectedIndex();
		
		if (app.validInt(attackField.getText()) && app.validDouble(enhancementField.getText()) && app.validInt(healthField.getText()))
		{
			String [] data = new String [5];
			
			app.updatePokemon(index, data);
		}
	}
	
	private void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "ultraball";
		String extension = ".png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase() + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		imageLabel.setIcon(pokemonIcon);
		repaint();
	}
	
	private void updateFields(int index)
	{
		String [] data = app.getPokeData(index);
		
		attackField.setText(data[0]);
		enhancementField.setText(data[1]);
		healthField.setText(data[2]);
		nameField.setText(data[3]);
		evolveField.setText(data[4]);
		numberField.setText(data[5]);
		
	}
	
	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String name = dropdownMenu.getSelectedItem().toString();
				sendDataToController();
				changeImageDisplay(name);
			}
		});
		
		dropdownMenu.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String name = dropdownMenu.getSelectedItem().toString();
				updateFields(dropdownMenu.getSelectedIndex());
				changeImageDisplay(name);
			}
		});
		
//		saveButton.addActionListener(new ActionListener()
//		{
//			public void actionPerformed(ActionEvent selection)
//			{
//				app.savePokedex();
//			}
//		});
	}
}


