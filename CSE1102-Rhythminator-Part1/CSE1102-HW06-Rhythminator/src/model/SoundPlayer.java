//Rhythminator
//CSE1102 Project 06, Spring 2016
//Bryan Arnold
//4/17/16
//TA: Zigeng Wang
//Section: 51
//Instructor: Jeffrey A. Meunier

package model;

import message.ISubscriber;
import message.Message;

/**
 * When a subscriber receives a notification, this class
 * plays a sound for the subscriber who is being notified.
 * @author Bryan Arnold
 */
public class SoundPlayer implements ISubscriber {

	private Sound sound;


	/**
	 * Constructor to give the sound a name.
	 * @param name: The name of the sound
	 * so that the sound name is known.
	 */
	public SoundPlayer(String name){

		this.sound = new Sound(name);

	}

	/**
	 * Constructor to give the new sound
	 * instance an actual sound.
	 * @param sound: The sound itself is then
	 * applied to the sound that will be used
	 * to notify the subscriber.
	 */
	public SoundPlayer(Sound sound){

		this.sound = sound;

	}

	/**
	 * Notify Method: plays a sound
	 * when a subscriber is notified.
	 * @param msg: A message being sent to
	 * the subscriber must exist for the sound
	 * to play once the message is received.
	 */
	@Override
	public void notify(Message msg) {

		this.sound.play();

	}

}
