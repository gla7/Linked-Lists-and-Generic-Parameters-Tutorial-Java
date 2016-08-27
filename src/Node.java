
public class Node<Any> {// notice the method to genericize nodes to take in ANY kind of data!
	
	private Any data;
	private Node<Any> nextNode;// Node represents the "node" type of a linked list
	// the data types of the above are privates, so to access them we need "getters" like so:
	
	public Any getData () {
		return this.data;// refers to Node.data, defined above! It gets the data attached to node
	}
	
	public Node<Any> getNextNode () {
		return this.nextNode;// refers to Node.nextNode, again defined above! It goes to the "next link" in linked list
	}
	
	public void setData (Any data) {// this gives you the chance to set the data attached to a node, note that voids dont return anything, just perform actions thats why it doesnt have a type declared
		this.data = data;
	}
	
	public void setNextNode (Node<Any> nextNode) {// this gives you the chance to insert a new node anywhere without the expense of an array!
		this.nextNode = nextNode;
	}
	
	public Node (Any data) {// THIS DEFINES THE OBJECT CONSTRUCTOR OF THE CLASS!!!
		this.data = data;
	}
	
	//override the toString method for node, for demo purposes
	public String toString() {
		return "Data: " + this.data;
	}
	
}
