package customstack;

/**
 * @author Lavin
 *
 */
public class MainClass {

	public static void main(String[] args) {

		EventStack eventStack = new EventStack(3);
		System.out.println("EventStack Created");
		System.out.println("Stack size is: " + eventStack.getSize());
		System.out.println("Stack length is: " + eventStack.getLength());
		System.out.println("Is Stack Empty? " + eventStack.isEmpty());
		
		try {
			System.out.println("Pushing Event");
			eventStack.push(new Event(1, "Alert", "High temperature detected"));
			eventStack.push(new Event(2, "Notification", "Scan completed"));
			eventStack.push(new Event(3, "Alert", "Machine stopped"));
			eventStack.push(new Event(4, "Notification", "Temperature below threshold"));
			System.out.println("Pushing Finished");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Stack length is: " + eventStack.getLength());
		System.out.println("Is Stack  full? " + eventStack.isFull());
		System.out.println("peek() Element on top: " + eventStack.peek());
		System.out.println("pop()  Element on top: " + eventStack.pop());
		System.out.println("pop()  Element on top: " + eventStack.pop());
		System.out.println("pop()  Element on top: " + eventStack.pop());
		System.out.println("Stack length is: " + eventStack.getLength());
		
		try {
			eventStack.pop();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		eventStack.displayStack();
	}

}

/**
 * Output:
 * 
 * EventStack Created 		# Using parameterised constructor size 3 Stack size is: 3
 * 
 * Stack length is: 0 		# No elements are added yet Is Stack Empty? true Pushing
 * 
 * Event 					# 3 Event Objects are Pushed
 * 
 * Event Stack Overflow 	# Trying to Push 4th Event Object. Stack reached maximum
 * 							  limit. Exception is thrown Stack length is: 3 
 * Is Stack full? true 
 * 
 * peek() Element on top: Event: eventId=3, eventName=Alert, eventDescription=Machine stopped 
 * pop()  Element on top: Event: eventId=3, eventName=Alert, eventDescription=Machine stopped 
 * pop()  Element on top: Event: eventId=2, eventName=Notification, eventDescription=Scan completed 
 * pop()  Element on top: Event: eventId=1, eventName=Alert, eventDescription=High temperature detected
 * 
 * Stack length is: 0 
 * 
 * Event Stack Under Flow 	# Trying to pop() empty stack. Exception is thrown
 * 
 * Event Stack Empty
 * 
 */



/**
 *****************************************
 * Explanation #1 System.out vs System.err
 *****************************************
 * In Java System.out.println() will print to the standard out of the system you
 * are using. On the other hand, System.err.println() will print to the standard
 * error.
 * 
 * 
 * If you are using a simple Java console application, both outputs will be the
 * same (the command line or console) but you can reconfigure the streams so
 * that for example, System.out still prints to the console but System.err
 * writes to a file.
 * 
 * Also, IDEs like Eclipse show System.err in red text and System.out in black
 * text by default.
 * 
 * Also, System.out is buffered, and System.err is not
 * 
 *****************************************
 * Explanation #2 System.out vs System.err
 *****************************************
 * System.out is "standard output" (stdout) and System.err is "error output"
 * (stderr). Along with System.in (stdin), these are the three standard I/O
 * streams in the Unix model. Most modern programming environments (C, Perl,
 * etc.) support this model.
 * 
 * The standard output stream is used to print output from "normal operations"
 * of the program, while the error stream is for "error messages". These need to
 * be separate -- though in most cases they appear on the same console.
 * 
 * Suppose you have a simple program where you enter a phone number and it
 * prints out the person who has that number. If you enter an invalid number,
 * the program should inform you of that error, but it shouldn't do that as the
 * answer: If you enter "999-ABC-4567" and the program prints an error message
 * "Not a valid number", that doesn't mean there is a person named "Not a valid
 * number" whose number is 999-ABC-4567. So it prints out nothing to the
 * standard output, and the message "Not a valid number" is printed to the error
 * output.
 * 
 * Reference
 * https://stackoverflow.com/questions/3163399/difference-between-system-out-println-and-system-err-println
 */
