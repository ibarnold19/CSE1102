package view;

import javax.swing.JPanel;

import controller.Controller;

public class SoundBank extends JPanel {

	private static final long serialVersionUID = 6249914173769272977L;
	private SoundNameBox[] _soundNameBoxes;

	public SoundBank(Controller aController, int numTracks) {
		// Setup layout
		setLayout(null);
		int width = 0;
		
		// Initialize member variables
		_soundNameBoxes = new SoundNameBox[numTracks];
		
		// Create SoundNameBoxs and place them
		int y = 0;  // vertical component of SoundNameBox location
		
		for (int i=0; i < numTracks; i++) {
			SoundNameBox soundNameBox = new SoundNameBox(aController, i+1);
			soundNameBox.setLocation(0, y);
			_soundNameBoxes[i] = soundNameBox;
			
			// Update coordinates
			y += Tracks.GAP_SIZE + soundNameBox.getSize().getHeight();
			
			// Add SoundNameBox to Panel
			add(soundNameBox);
		}
		
		// Finish Panel layout setup
		if (_soundNameBoxes[0] != null) 
			width = (int) _soundNameBoxes[0].getSize().getWidth();
		
		setSize(width, y);
	}
	
	public void setSoundName(int trackNum, String soundName) {
		_soundNameBoxes[trackNum].setText(soundName);
	}
}
