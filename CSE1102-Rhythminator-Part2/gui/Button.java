package gui;

import java.awt.event.MouseEvent;

import controller.Controller;

public class Button extends Box {
	private static final long serialVersionUID = 1L;
	private Controller _controller;
	
	
	public Button(Controller aController, String text) {
		super(text);
		_controller = new Controller();

	}

	@Override
	public void mousePressed(MouseEvent mev) {
		_controller.buttonPressed(this);
	}
	
	@Override
	public String toString() {
		return "Button(" + getText() + ")";
	}
}
