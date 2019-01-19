//Rhythminator
//CSE1102 Project 06, Spring 2016
//Bryan Arnold
//4/17/16
//TA: Zigeng Wang
//Section: 51
//Instructor: Jeffrey A. Meunier

package message;

/**
 * ISubscriber interface
 * Creates the notify method for implementation
 * for all classes that need it. (subscribers made)
 * @author Bryan Arnold
 */

public interface ISubscriber{

	/**
	 * Notify Method: Abstract method for
	 * later implementation. Notifies the subscribers
	 * with message once subscribes or for other notifcation
	 * reasons.
	 * @param Message msg. A message must
	 * be used in order for a notification
	 * to the subscribers to be sent.
	 */
	
	public void notify(Message msg);

}
