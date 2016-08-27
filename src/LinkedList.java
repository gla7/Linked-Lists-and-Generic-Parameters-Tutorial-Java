
public class LinkedList<Any> {// notice the method to genericize nodes to take in ANY kind of data!
	private Node<Any> head;// the linked list only contains a reference to the head, as per your notes!
	
	public void insertAtHead (Any data) {// this method creates a new head node
		Node<Any> newNode = new Node<Any>(data);// create new node with some data in it
		newNode.setNextNode(this.head);// set it to link to the former head
		this.head = newNode;// set it to be the present head
	}// this operation is O(1), which is much better than inserting into an array!
	
	public int length () {// this is the linkedList method to get its length, i.e. how many non-null nodes it has!
		int length = 0;
		Node<Any> current = this.head;
		while (current != null) {
			current = current.getNextNode();
			length++;
		}
		return length;
	}
	
	//override the toString method for linkedList, for demo purposes
	public String toString() {
		String result = "{";
		Node<Any> current = this.head;
		
		while (current != null) {
			result = result + current.toString() + ", ";
			current = current.getNextNode();
		}
		result = result + "END}";
		return result;
	}
	
	public void deleteFromHead () {
		this.head = this.head.getNextNode();
	}
	
	public Node<Any> find (Any searchingForThis) {
		Node<Any> current = this.head;
		while (current != null) {
			if (current.getData() == searchingForThis) {
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}
	
}
