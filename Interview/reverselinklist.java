package Interview;

public class reverselinklist {
	
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node (int d){data=d; next=null;}
	}
	
	Node reverse (Node node) {
	Node prev=null;
	Node curr=head;
	Node next=null;
	while(curr!=null)
	{
	next=curr.next;
	curr.next=prev;
	prev=curr;
	curr=next;
	
	}
	node= prev;
	return node;
	}
	
	public void printlist(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data + " ");
			node=node.next;
		}
	}
	

	public static void main(String[] args) {
		reverselinklist llist=new reverselinklist();
		llist.head=new Node(8);
		llist.head.next=new Node(9);
		llist.head.next.next=new Node(10);
		System.out.println("Given list is");
		llist.printlist(head);
		head=llist.reverse(head);
		System.out.println(" "); 
		System.out.println("Reversed linked list "); 
		llist.printlist(head);

	}

}
