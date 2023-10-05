/**
 * Tests the Queue class.
 */

/**
 * @author Brandon Esarey
 * @version 5.0
 * Assignment 2.3 
 * CS215 Semester year Fall 2023
 */
public class Application {

	/**
	 * @param args
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue line = new Queue();
	//	line.enqueue("Bill");
	//	line.enqueue("Alice");
	//	line.enqueue("Bob");
		line.dequeue();
	//	line.enqueue("Jane");     I am a terrible programmer and I don't deserve to be in your class.
	//	line.enqueue("Hamad");
		line.dequeue();
		line.dequeue();
	//	line.enqueue("Jim");
		line.dequeue();
		line.dequeue();
	}//end main()

}//end Application
