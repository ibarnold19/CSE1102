package view;

import javax.swing.JPanel;

import controller.Controller;
import gui.*;

public class Header extends JPanel {

	private static final long serialVersionUID = -8592654734066776814L;
	private TextBox _textBox;
	public Header(Controller aController) {
	
		// Setup Layout
		setLayout(null);
		
		// Setup Panel contents
		int height = 30;
		int buttonWidth = 60;
		
		// Setup FileName Box
		TextBox _textBox = new TextBox("Unnamed", "Enter a new name:", "Change name");
		_textBox.setSize(200, height);
		_textBox.setLocation(0, 0);
		add(_textBox);
		
		// Setup Load Button
		Button loadButton = new Button(aController, "Load");
		loadButton.setSize(buttonWidth, height);
		loadButton.setLocation(_textBox.getWidth() + 10, _textBox.getLocation().y);
		add(loadButton);
		
		// Setup Save Button
		Button saveButton = new Button(aController, "Save");
		saveButton.setSize(buttonWidth, height);
		int x = loadButton.getLocation().x + loadButton.getWidth() + 10;  
		saveButton.setLocation(x, _textBox.getLocation().y);
		add(saveButton);
		
		// Setup Quit Button
		Button quitButton = new Button(aController, "Quit");
		quitButton.setSize(buttonWidth, height);
		x = saveButton.getLocation().x + saveButton.getWidth() + 40;
		quitButton.setLocation(x, _textBox.getLocation().y);
		add(quitButton);
		

		// Finish Setting up Panel
		int panelWidth = quitButton.getLocation().x + quitButton.getWidth();
		setSize(panelWidth, height);
	}
	
	public String getFileName() {
		return _textBox.getText();
	}
}
