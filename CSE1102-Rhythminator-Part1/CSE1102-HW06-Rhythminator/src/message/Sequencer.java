//Rhythminator
//CSE1102 Project 06, Spring 2016
//Bryan Arnold
//4/17/16
//TA: Zigeng Wang
//Section: 51
//Instructor: Jeffrey A. Meunier

package message;

/**
 * Sends a message to multiple subscribers in order of the subscriber list.
 * It conforms to the ISubscriber and IPublisher interfaces
 * @author Bryan Arnold
 */
public class Sequencer implements ISubscriber, IPublisher {

	private int spot;
	private ISubscriber[] _subscribers;

	/** Creates an instance of a Sequence that can hold up to some number of
	 * subscribers.
	 * @param : int limit. The maximum number of subscribers that this
	 * Sequence can hold.
	 */
	public Sequencer(int limit){

		this._subscribers = new ISubscriber[limit];

	}

	/** Subscribe Method: adds a subscriber to the list of subscribers
	 * for the list of subscribers in the specific sequence.
	 * @param: ISubscriber subscriber.The subscriber who wishes to 
	 * subscribe to the Broadcaster. A subscriber is needed
	 * in order to subscribe to the list of subscribers
	 * in the sequence (no duh).
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
	 * list of subscribers in the Sequence. However this
	 * method is not used for the project so it is left blank, 
	 * but is needed to implement the IPublisher class.
	 * @param: ISubscriber subscriber. The subscriber who wishes
	 * to unsubscribe from the list of subscribers
	 * in the sequence. A subscriber must 
	 * be known in order to remove them from the subscriber list.
	 */
	
	@Override
	public void unsubscribe(ISubscriber subscriber) {

	}

	/** Notify Method: notifies the subscribers in the
	 * list of subscribers one at a time in a
	 * sequence.
	 * @param: Message msg. The notification the method
	 * receives that will be sent to a subscriber
	 * and then passed on one at a time in a sequence. The message is needed
	 * in order to pass it on to the subscribers.
	 */

	@Override
	public void notify(Message msg) {
		

		if(spot == _subscribers.length){
			
			spot = 0;
			
		} 
		
		if (_subscribers[spot] != null){
			
			_subscribers[spot].notify(msg);
			
		}
		
		spot = spot + 1;

	}
	
}
