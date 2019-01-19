//Rhythminator
//CSE1102 Project 06, Spring 2016
//Bryan Arnold
//4/17/16
//TA: Zigeng Wang
//Section: 51
//Instructor: Jeffrey A. Meunier

package model;

import message.Broadcaster;

/**
 * This class takes certain sounds instances and
 * combines them into one chord. All the sound instances
 * in the chord are played simultaneously. Subclass
 * of the Broadcaster class and utilizes its constructor
 * and subscribe methods.
 * @author Bryan Arnold
 */

public class Chord extends Broadcaster {

	/**
	 * Constructor to give a chord instance its respective
	 * sounds.
	 * @param Sound[] sounds. Since a chord is a
	 * collection of a few sounds, multiple sound
	 * instances must be used to create a chord. Each
	 * sound is put into the chord and subscribed.
	 */
	
	public Chord(Sound[] sounds) {

		super(sounds.length);

		for(Sound sounds1  : sounds){

			SoundPlayer sp = new SoundPlayer(sounds1);

			this.subscribe(sp);

		}

	}

}
