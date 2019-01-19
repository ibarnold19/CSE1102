package gui;

import java.awt.Color;
import java.awt.Point;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import controller.Controller;

public class NumberSlider extends JPanel implements ChangeListener  {
	
	private static final long serialVersionUID = 1680309392780477591L;
	private Controller _controller;
	private String _name;
	private JSlider _slider; 
	private Box _numberIndicator;
	
	
	public NumberSlider(Controller aController, String name, int min, int max, int dflt) {
		// Instantiate member variables
		_controller = aController;
		_name = name;
		_numberIndicator = new Box("" + dflt);
		_slider = new JSlider(JSlider.HORIZONTAL, min , max , dflt);
		
		// Setup up Panel
		setLayout(null);
		
		// Setup number indicator
		_numberIndicator.setLocation(new Point());
		_numberIndicator.setSize(40, 30);
		
		// Setup slider
		_slider.setLocation(_numberIndicator.getWidth(), 0);
		_slider.setSize(200, 30);
		_slider.setFocusable(false);
		_slider.addChangeListener(this);
				
		// Set up panel
		int panelWidth = _numberIndicator.getWidth() + _slider.getWidth();
		setSize(panelWidth, 30);
		
		// Add to Panel
		add(_numberIndicator);
		add(_slider);		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		_numberIndicator.setText("" + _slider.getValue());
		_controller.sliderChange(_name, _slider.getValue());
	}
}
