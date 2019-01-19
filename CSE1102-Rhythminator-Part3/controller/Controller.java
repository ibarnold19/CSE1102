package controller;

import gui.Button;
import gui.Dialog;
import message.ISubscriber;
import message.Message;
import model.Clock;
import model.Model;
import view.NoteSquare;
import view.View;

public class Controller implements ISubscriber
{

  private Model _model;
  private Clock _clock;
  private View  _view;

  public Controller(Clock clock, Model model)
  {
    // TODO
  }

  public void buttonPressed(Button button)
  {
    if(button.getText().equals("Save"))
      _buttonSave();
    else if(button.getText().equals("Load"))
      _buttonLoad();
    else if(button.getText().equals("Play"))
    {
      // TODO
      System.out.println("Controller.buttonPressed got Play button");
    }
    else if(button.getText().equals("Stop"))
    {
      // TODO
      System.out.println("Controller.buttonPressed got Stop button");
    }
    else if(button.getText().equals("Quit"))
      _buttonQuit();
    else
      System.out.println("Controller.buttonPressed " + button + " pressed");
  }

  private void _buttonQuit()
  {
    if(Dialog.askYesNo("Exiting program", "Really quit?"))
      System.exit(0);
  }

  private void _buttonLoad()
  {
    System.out.println("Controller._buttonLoad called");
  }

  private void _buttonSave()
  {
    System.out.println("Controller._buttonSave called");
  }

  public void keyPressed(int keyCode)
  {
    System.out.println("Controller.keyPressed " + keyCode);
  }

  public void keyReleased(int keyCode)
  {
    System.out.println("Controller.keyReleased " + keyCode);
  }

  public void keyTyped(char keyChar)
  {
    System.out.println("Controller.keyTyped '" + keyChar + "'");
  }

  public void noteSquareClicked(NoteSquare noteSquare)
  {
    // TODO
    System.out.println("Controller.noteSquareClicked " + noteSquare);
  }

  @Override
  public void notify(Message message)
  {
    // TODO
    System.out.println("Controller.notify " + message);
  }

  public void soundNameSelected(int trackNumber, String soundName)
  {
    // TODO
    System.out.println("Controller.soundNameSelected for track " +  trackNumber + ": " + soundName);
  }

  public void setView(View view)
  {
    _view = view;
  }

  public void sliderChange(String name, int _value)
  {
    // TODO
    System.out.println("Controller.sliderChange " + name + " = " + _value);
  }

}
