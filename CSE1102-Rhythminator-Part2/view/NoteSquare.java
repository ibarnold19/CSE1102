package view;

import java.awt.event.MouseEvent;

import controller.Controller;
import gui.*;

public class NoteSquare extends Box {
	
	private static final long serialVersionUID = -4614450319459697758L;
	public static final int SIZE = 30;
	private Controller _controller;
	private int _track;
	private int _beat;
	private int _value;  // 0 for off, and > 1 for some sound
	
	public NoteSquare(Controller aController, int track, int beat) {
		super();
		
		// Instantiate member variables
		_controller = aController;
		_track = track;
		_beat = beat;
		
		// Set Layout
		setSize(SIZE, SIZE);
		setBackground(Colors.NOTESQUARE_OFF);
	}
	
	////////////////
	// UI Methods
	////////////////
	@Override
	public void mousePressed(MouseEvent mev) {
		// Toggle value
		if (_value == 0)
			setValue(1);
		else
			setValue(0);
		
		_controller.noteSquareClicked(this);
	}
	
	/////////////////////////
	// Getters and Setters
	/////////////////////////
	
	public int getTrack() {
		return _track;
	}
	
	public int getBeat() {
		return _beat;
	}
	
	public int getValue() {
		return _value;
	}
	
	public void setValue(int val) {
		_value = val;
		
		if (_value > 0)
			setBackground(Colors.NOTESQUARE_ON);
		else
			setBackground(Colors.NOTESQUARE_OFF);
		
		repaint();
		
	}
	
	
	///////////////////////
	// Printing Methods
	///////////////////////
	
	public String toString() {
		return "NoteSquare (track=" + _track + ", beat=" + _beat + ")";
	}
}
