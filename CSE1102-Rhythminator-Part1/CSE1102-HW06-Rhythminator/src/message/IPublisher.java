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
 * Creates the subscription
 * methods for subscribers for later implementation
 * for other classes. 
 * @author Bryan
 */

public interface IPublisher{

	/**
	 * Subscribe Method: Abstract method for later
	 * implementation, allows a subscriber to subscribe
	 * to a certain publisher (sequence, broadcaster, etc.)
	 * @param ISubscriber subscriber. A subscriber
	 * is necessary in order to subscribe to a 
	 * publisher.
	 */
	
	public void subscribe(ISubscriber subscriber);

	/**
	 * Unsubscribe Method: Abstract method for later 
	 * implementation, allows a subscriber to unsibscribe
	 * from the certain publisher they are subscribed to.
	 * @param ISubscriber subscriber. The subscriber
	 * who wishes to be unsubscribed from a certain
	 * type of publisher must be known in order to
	 * unsubscribe them.
	 */
	
	public void unsubscribe(ISubscriber subscriber);

}