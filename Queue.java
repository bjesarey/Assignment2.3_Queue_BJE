/**
 * Poorly creates a queue that can't hold anything.
 */

/**
 * @author brandonesarey
 * @param <T>
 * @version 5.0
 * Assignment 2.3 
 * CS215 Semester year Fall 2023
 */
public class Queue<T>{
	LinkedList<T> line;
	/**
	 * @param line
	 */
	public Queue() {
		line=new LinkedList<T>();
	}


	public void enqueue(Node<T> anEntry) {
		line.addNode(anEntry);
		System.out.println(anEntry+" has entered the line.");
	}//end enqueue()
	
	public T dequeue() {
		line.removeNode();
		return null;

	}//end dequeue()




}
