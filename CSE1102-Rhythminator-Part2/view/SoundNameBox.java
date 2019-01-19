package view;

import java.awt.event.MouseEvent;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

import controller.Controller;
import gui.Box;

public class SoundNameBox extends Box {

	private static final long serialVersionUID = -1976526149678909024L;
	private final int WIDTH = 130;
	private final int HEIGHT = 30;
	private Controller _controller;
	private int _track;
	
	public SoundNameBox(Controller aContorller, int trackNum) {
		super();
		
		// Instantiate member variables
		_controller = aContorller;
		_track = trackNum;
		
		// Setup box
		setSize(WIDTH, HEIGHT);
	}
	
	@Override
	public void mousePressed(MouseEvent mev) {
		SoundChooser.open(_controller, _track, getText());
	}
	
}
