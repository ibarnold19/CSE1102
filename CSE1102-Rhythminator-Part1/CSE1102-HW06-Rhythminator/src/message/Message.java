//Rhythminator
//CSE1102 Project 06, Spring 2016
//Bryan Arnold
//4/17/16
//TA: Zigeng Wang
//Section: 51
//Instructor: Jeffrey A. Meunier

package message;

/**
 * This class creates a message notification
 * that is sent out to the subscribers of a certain
 * publisher. Every message comes from a publisher
 * @author Bryan Arnold
 */

public class Message{

	private IPublisher _publisher;

	/**
	 * Constructor to give a message its respective publisher.
	 * @param IPublisher publisher. Every message
	 * has to come from a certain publisher,
	 * so the message needs a publisher origination.
	 */

	public Message(IPublisher publisher){

		_publisher = publisher;

	}

	/**
	 * @return the publisher of the message instance.
	 */

	public IPublisher getPublisher(){

		return _publisher;

	}

}
