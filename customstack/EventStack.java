package customstack;

import java.util.NoSuchElementException;

/**
 * @author Lavin
 *
 */
public class EventStack {

	/**
	 * Keeps track of most recent element added to stack
	 */
	int top;
	
	/**
	 * Fixed Size of Stack. 
	 */
	int size;
	
	
	/**
	 *  Number of elements in stack
	 */
	int length;
	
	
	Event[] events;

	/**
	 * @param size
	 * Initialises EventStack
	 */
	public EventStack(int size) {
		this.size = size;
		this.top = -1;
		this.length = 0;
		events = new Event[size];
	}

	/**
	 * @param e
	 * check if stack is full
	 */
	public void push(Event e) {
		if(isFull())
			throw new IndexOutOfBoundsException("\nEvent Stack Overflow");
		top = top + 1;
		length = length + 1;
		events[top] = e;
	}

	/**
	 * @return Event
	 * Check if stack is empty
	 */
	public Event pop() {
		if(isEmpty())
			throw new NoSuchElementException("\nEvent Stack Under Flow");
		length--;
		top--;
		return events[length];
	}

	/**
	 * @return Event
	 * Check if stack is empty
	 */
	public Event peek() {
		if(isEmpty())
			throw new NoSuchElementException("Event Stack Under Flow");
		return events[top];
	}

	public int getLength() {
		return length;
	}

	public int getSize() {
		return size;
	}
	
	public boolean isEmpty(){
		return length==0;
	}
	
	public boolean isFull(){
		return length == size;
	}
	
	public void displayStack(){
		if(isEmpty())
			System.out.print("\nEvent Stack Empty");
		else
			for(int i=0; i < length;i++)
				System.out.print("\n"+events[i].toString());
	}
}
