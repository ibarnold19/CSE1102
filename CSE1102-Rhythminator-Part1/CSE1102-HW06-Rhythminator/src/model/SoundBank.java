//Rhythminator
//CSE1102 Project 06, Spring 2016
//Bryan Arnold
//4/17/16
//TA: Zigeng Wang
//Section: 51
//Instructor: Jeffrey A. Meunier

package model;

/**
 * This class creates a SoundBank instance
 * that collects sounds to become chord instances
 * that the input desires. So, if the user
 * wants specific sounds of the sound collection,
 * this class does just that.
 * @author Bryan
 */

public class SoundBank {

	private Sound[] _sounds;

	/**
	 * Constructor to create SoundBank instances, or a collection
	 * of sounds to be crafted into chords.
	 * @param Sound[] sounds. A collection of the
	 * sounds desired is required in order to be stored
	 * into a SoundBank.
	 */

	public SoundBank(Sound[] sounds){

		this._sounds = sounds;

	}

	/**
	 * Chord Method: creates a chord with the desired
	 * sounds that the user wishes from the collection of sounds. 
	 * @param boolean[] soundFlags. This method checks which indexes of
	 * the array are true, as those are the spots in the collection of 
	 * sounds that the user wishes to put into a chord. Thus, true and false
	 * collection would be needed reflecting the positions of the desired sounds.
	 * @return a new Chord instance. This new chord is the indexes of the collection
	 * of sounds that were the same element position as the true soundFlags. This
	 * chord is now a collection of the desired sounds to be played at once from 
	 * the sound collection.
	 */

	public Chord chord(boolean[] soundFlags){

		int counter = 0;

		for(int i = 0; i < soundFlags.length; i++){

			if(soundFlags[i] == true){

				counter = counter + 1;	

			}

		}

		int[] positions = new int[counter];

		Sound[] newSounds = new Sound[counter];

		int n = 0; 	 

		for(int i = 0; i < this._sounds.length; i++){

			if(n == soundFlags.length){

				break;

			}

			if(soundFlags[n] == false){

				i--;

			}

			if(soundFlags[n] == true){

				positions[i] = n;

				newSounds[i] = this._sounds[positions[i]];

			}

			n++;

		}

		return new Chord(newSounds);

	}

	/**
	 * Chord method: creates a chord with the desired
	 * sounds that the user wishes from the collection of sounds. 
	 * @param int[] soundNums. Instead of boolean values, this method
	 * takes in the desired index locations of the desired sounds in the
	 * collection. A collection of index locations, integers, would be needed.
	 * @return a new Chord instance. This new chord instance is the collection
	 * of sounds with respect to the given index locations from the parameters. This
	 * chord is now a collection of the desired sounds to be played at once from 
	 * the sound collection.
	 */

	public Chord chord(int[] soundNums){

		Sound[] newSounds = new Sound[soundNums.length];

		int n = 0;

		for(int i = 0; i < this._sounds.length; i++){

			if(n == soundNums.length){

				break;

			}


			if(soundNums[n] == i){

				newSounds[n] = this._sounds[i];

				n++;

			}

		}

		return new Chord(newSounds);	

	}

}
