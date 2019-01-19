//Rhythminator
//CSE1102 Project 06, Spring 2016
//Bryan Arnold
//4/17/16
//TA: Zigeng Wang
//Section: 51
//Instructor: Jeffrey A. Meunier

package message;

/**
 * Broadcasts a message to multiple subscribers.
 * @author Bryan Arnold
 */
public class Broadcaster implements ISubscriber, IPublisher {

	private ISubscriber[] _subscribers;

	/** Creates an instance of a Broadcaster that can hold up to some number of
	 * subscribers.
	 * @param : int limit. The maximum number of subscribers that this
	 * Broadcaster can hold.
	 */
	public Broadcaster(int limit){

		this._subscribers = new ISubscriber[limit];

	}

	/** Subscribe Method: adds a subscriber to the list of subscribers
	 * for a specific Broadcaster.
	 * @param: ISubscriber subscriber.The subscriber who wishes to 
	 * subscribe to the Broadcaster. A subscriber is needed
	 * in order to subscribe to a Broadcaster (no duh).
	 */

	@Override
	public void subscribe(ISubscriber subscriber) {

		for(int i = 0; i < _subscribers.length; i++){

			if(_subscribers[i] == null){

				_subscribers[i] = subscriber;

				break;

			}

		}
	}

	/** Unsubscribe Method: removes a subscriber from the
	 * list of subscribers for the Broadcaster. However this
	 * method is not used for the project so it is left blank, 
	 * but is needed to implement the IPublisher class.
	 * @param: ISubscriber subscriber. The subscriber who wishes
	 * to unsubscribe from the Broadcaster. A subscriber must 
	 * be known in order to remove them from the subscriber list.
	 */

	@Override
	public void unsubscribe(ISubscriber subscriber) {

	}

	/** Notify Method: notifies the subscribers in the
	 * list of subscribers of a notification once
	 * it is received.
	 * @param: Message msg. The notification the method
	 * receives that will be sent to all subscribers of
	 * the Broadcaster in a message. The message is needed
	 * in order to pass it on to the subscribers.
	 */

	@Override
	public void notify(Message msg) {

		for(ISubscriber subscriber : _subscribers){

			if(subscriber != null){

				subscriber.notify(msg);

			}

		}

	}

}
