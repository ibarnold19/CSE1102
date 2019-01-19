package view;


import javax.swing.JPanel;

public class BeatNumbers extends JPanel {

	private static final long serialVersionUID = -2710519476983653232L;
	private BeatNumberSquare[] _beatNumSqs;
	private int _activeBeatNum;
	
	public BeatNumbers(int numBeats) {
		// Setup Layout
		setLayout(null);
		setSize(numBeats * (NoteSquare.SIZE + Tracks.GAP_SIZE), NoteSquare.SIZE);
		
		// Initialize member variables
		_beatNumSqs = new BeatNumberSquare[numBeats];
		_activeBeatNum = 0;
		
		// Set Panel Contents
		int x = 0; // horizontal position of BeatNumberSquare
		
		for (int i=0; i < numBeats; i++) {
			// Create new BeatNumberSquare and place it
			BeatNumberSquare beatNumSq = new BeatNumberSquare(i+1); // beat nums don't start from 0
			beatNumSq.setLocation(x, 0);
			x += NoteSquare.SIZE + Tracks.GAP_SIZE;
			
			// Save the BeatNumberSquare into array
			_beatNumSqs[i] = beatNumSq;
			
			// Add it to Panel
			add(beatNumSq);
		}
	}
	
	public void setBeatNumber(int beatNum) {
		// Turn off any other beats
		for (BeatNumberSquare beatSquare : _beatNumSqs)
			if (beatSquare.getState())
				beatSquare.setState(false);		
		
		// Set the desired one on
		_beatNumSqs[beatNum].setState(true);
		_activeBeatNum = beatNum;
	}
	
	public void clear() {
		_beatNumSqs[_activeBeatNum].setState(false);
	}
}
