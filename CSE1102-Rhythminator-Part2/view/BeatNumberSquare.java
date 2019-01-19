package view;

import gui.Box;

public class BeatNumberSquare extends Box {

	private static final long serialVersionUID = -4349541382923387L;
	private int _beat;
	private boolean _state;
	
	public BeatNumberSquare(int beatNum) {
		super();
		
		// Instantiate member variables
		_beat = beatNum;
		_state = false;
		
		// Set up panel
		setText("" + _beat);
		setSize(NoteSquare.SIZE, NoteSquare.SIZE);
		setForeground(Colors.BEATNUMBER_OFF_FG);
		setBackground(Colors.BEATNUMBER_OFF_BG);
	}
	
	/////////////////////////
	// Getters and Setters
	/////////////////////////
	
	public boolean getState() {
		return _state;
	}
	
	public void setState(boolean state) {
		_state = state;
		
		if (_state) {
			setBackground(Colors.BEATNUMBER_ON_FG);
			setBackground(Colors.BEATNUMBER_ON_BG);
		} else {
			setForeground(Colors.BEATNUMBER_OFF_FG);
			setBackground(Colors.BEATNUMBER_OFF_BG);
		}
		
		invalidate();	
	}
}
