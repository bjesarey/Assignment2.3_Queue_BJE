/*
 * Creates a linked list that can store generics.
 */

/**
 * @author njohnson3 and Brandon Esarey
 * @version 1.0 
 * Assignment 2.3 
 * CS215 Semester year Fall 2023
 */
public class LinkedList<T> {

	private Node<T> head;
	int length;
	private Node<T> tail;

	public LinkedList() {
		head = null;
		length = 0;
		tail = null;
	}//end constructors

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}//end isEmpty()

	public Node<T> getList() {
		return head;
	}//end getList()

	public void addNode(Node<T> anEntry) {
		if (isEmpty()) {
			head = anEntry;
			tail = head;
			return;
		}//end if
		tail.nextNode = anEntry;
		tail = tail.nextNode;
		tail.nextNode = null;
		length++;
	}//end addNode
	
	public Node<T> removeNode() {
		if(isEmpty()) {
			return null;
		}//end if
		head = head.nextNode;
		head.nextNode=null;
		length--;
		return head;
	}//end removeNode

}//end LinkedList