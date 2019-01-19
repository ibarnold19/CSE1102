package controller;

import javax.swing.JSlider;

import gui.Button;
import view.NoteSquare;

public class Controller {

	public Controller() {
	}

	public void keyPressed(int keyCode) {
		// System.out.println("Controller.keyPressed " + keyCode);
	}

	public void keyReleased(int keyCode) {
		// System.out.println("Controller.keyReleased " + keyCode);
	}

	public void keyTyped(char keyChar) {
		// System.out.println("Controller.keyTyped '" + keyChar + "'");
	}

	public void soundNameSelected(int trackNumber, String soundName) {
		System.out.println("Sound " + soundName + " selected for track " + trackNumber);
	}

	public void buttonPressed(Button button) {
		// TODO Auto-generated method stub
		System.out.println("Button Pressed");
		System.out.println(button);
	}

	public void sliderChange(String sliderName, int value) {
		System.out.println("Slider " + sliderName + " changed values to " + value);
	}

	public void noteSquareClicked(NoteSquare noteSquare) {
		System.out.println("NoteSquare Clicked");
		System.out.println(noteSquare);
	}

}
