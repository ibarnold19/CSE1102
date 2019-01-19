package model;

import message.Sequencer;

public class Model
{

  public int _numTracks;
  public int _numBeats;
  private SoundBank _soundBank;
  private Sequencer _sequencer;
  private Chord[] _chords;
  private Clock _clock;

  /**
   * The model sets up the clock.
   * Most of the work of running the application happens in the clock.
   * @param numTracks
   * @param numBeats
   */
  public Model(int numTracks, int numBeats)
  {
    // TODO
  }

  public int getBeatNumber()
  {
    return _sequencer.getStepNumber();
  }

  public Clock getClock()
  {
    return _clock;
  }

  public void startPlaying()
  {
    // TODO
  }
  
  public void stopPlaying()
  {
    // TODO
  }

  public void setNote(int trackNum, int beatNum, boolean value)
  {
    // TODO
  }

  public void setSoundName(int trackNum, String soundName)
  {
    // TODO
  }

}
