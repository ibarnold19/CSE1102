package view;

import gui.Box;
import gui.Button;
import gui.NumberSlider;

import java.awt.Color;
import java.security.AccessControlContext;

import controller.Controller;

public class View {

	public static final int TRACK_HEIGHT = 40; // this one must be public
	private static final int LEFT_MARGIN = 20;
	private static final int TOP_MARGIN = 20;

	public View(Controller controller, int numTracks, int numBeats) {
		Window window = new Window(controller, "Rhythminator");
		window.setSize(900, 500);

		//--------------------
		// Setup UI Elements
		//--------------------
				
		// Header
		Header header = new Header(controller);
		header.setLocation(LEFT_MARGIN, TOP_MARGIN);
		window.add(header);
		
		// SoundBank
		SoundBank soundBank = new SoundBank(controller, numTracks);
		int underHeader = (int) header.getSize().getHeight() + TOP_MARGIN + 20;  // literal is padding		
		soundBank.setLocation(LEFT_MARGIN, underHeader);
		window.add(soundBank);
		
		// Control Buttons
		ControlButtons controlButtons = new ControlButtons(controller);
		int underSoundBank = underHeader + (int) soundBank.getSize().getHeight() + 10;
		controlButtons.setLocation(LEFT_MARGIN, underSoundBank);
		window.add(controlButtons);
		
		// Tracks
		Tracks tracks = new Tracks(controller, numTracks, numBeats);
		int rightOfSoundBank = LEFT_MARGIN + (int) soundBank.getSize().getWidth() + 10;
		tracks.setLocation(rightOfSoundBank, underHeader);
		window.add(tracks);
		
		// BeatNumbers
		BeatNumbers beatNumbers = new BeatNumbers(numBeats);
		int underTracks = underSoundBank;
		beatNumbers.setLocation(rightOfSoundBank, underTracks);
		window.add(beatNumbers);
		
		// Slider
		NumberSlider numberSlider = new NumberSlider(controller, "mySlider", 0, 100, 50);
		int underBeatNums = underSoundBank +  (int) beatNumbers.getSize().getHeight() + 10; 
		numberSlider.setLocation(rightOfSoundBank, underBeatNums);
		window.add(numberSlider);
		
		
		// Make window visible
		window.setVisible(true);
	}
}
