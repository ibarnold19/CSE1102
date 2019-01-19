package view;

import java.awt.Color;

import javax.swing.JPanel;

import controller.Controller;

public class Tracks extends JPanel {

	private static final long serialVersionUID = -7997643440237979869L;
	public static final int GAP_SIZE = 10;
	
	public Tracks(Controller aController, int numTracks, int numBeats) {
		// Set Layout
		setLayout(null);
		int width = (numBeats * NoteSquare.SIZE) + ((numBeats -1) * GAP_SIZE);
		int height = (numTracks * NoteSquare.SIZE) + ((numTracks -1) *GAP_SIZE);
		setSize(width, height);	

		// Set up the Panel's Contents
		int y = 0;  // Vertical position of NoteSquare
		
		// Instantiate and place NoteSequares
		for (int i=0; i < numTracks; i++) {
			int x = 0;  // Horizontal Position of NoteSquare
			
			// Create a row (i.e. track) of NoteSquares
			for (int j=0; j < numBeats; j++) {
				// Create NoteSquare
				NoteSquare noteSqr = new NoteSquare(aController, i+1, j+1);
				noteSqr.setLocation(x, y);
				
				// Update coordinate for next NoteSquare
				x += NoteSquare.SIZE + GAP_SIZE;
				
				// Add new NoteSquare to panel
				add(noteSqr);
			}
			
			// Update the vertical Component
			y += NoteSquare.SIZE + GAP_SIZE;
		}
	}

}
