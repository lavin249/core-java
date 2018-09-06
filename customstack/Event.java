package customstack;

/**
 * @author Lavin
 *
 */
public class Event {
	int eventId;
	String eventName;
	String eventDescription;

	public Event(int eventId, String eventName, String eventDescription) {
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDescription = eventDescription;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Event: eventId=" + eventId + ", eventName=" + eventName + ", eventDescription=" + eventDescription;
	}
}
