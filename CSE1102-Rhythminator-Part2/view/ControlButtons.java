package view;

import javax.swing.JPanel;

import controller.Controller;
import gui.Button;

public class ControlButtons extends JPanel {
	
	private static final long serialVersionUID = -8407546648452796917L;

	public ControlButtons(Controller aController) {		
		// Set Panel Layout
		setLayout(null);
		setSize(130, 30);
		
		// Add Buttons
		Button playButton = new Button(aController, "Play");
		playButton.setSize(60, 30);
		playButton.setLocation(0, 0);
		
		Button stopButton = new Button(aController, "Stop");
		stopButton.setSize(60, 30);
		stopButton.setLocation(70, 0);
		
		// Add buttons to panel
		add(playButton);
		add(stopButton);
	}
}
