
public class LinkedListDemo {
	public static void main (String[] args) {
		LinkedList<Integer> list = new LinkedList();
		
		list.insertAtHead(5);// sequentially setting heads, note that this linked list will start at 1 and end at 5 before going to null
		list.insertAtHead(10);
		list.insertAtHead(2);
		list.insertAtHead(7);
		list.insertAtHead(6);
		list.insertAtHead(8);
		list.insertAtHead(1);
		
		System.out.println(list);// sysout runs toString method by default! So here we are testing the toString method!
		System.out.println(list.length());// testing the length method of linkedList
		
		list.deleteFromHead();
		
		System.out.println(list);// testing if method removeFromHead did remove the head node
		System.out.println(list.length());// testing if method removeFromHead did remove the head node
		
		System.out.println("Found: " + list.find(7));// find index of existing item
		System.out.println("Found: " + list.find(77));// find index of non-existing item
		
		//testing the same things with a generisized linked list:
		
		LinkedList<String> generisized = new LinkedList();
		
		generisized.insertAtHead("YISS");
		generisized.insertAtHead("NOO");
		generisized.insertAtHead("ALMOST");
		generisized.insertAtHead("UH-HUH");
		generisized.insertAtHead("START???");
		
		System.out.println(generisized);
		System.out.println(generisized.length());
		
		generisized.deleteFromHead();
		
		System.out.println(generisized);
		System.out.println(generisized.length());
		
		System.out.println("Found: " + generisized.find("ALMOST"));
		System.out.println("Found: " + generisized.find("KJ:OOB:O"));
	}
}
