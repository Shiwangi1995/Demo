package Interview;

import java.util.LinkedList;


import javax.xml.soap.Node;

public class linkedlistinsertion {
	
	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int d) {data=d ; next=null;}
	}
	
	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	public void insertAfter(Node prev_node, int new_data)
	{
		if(prev_node==null)
		{
			System.out.println("previous node can't be null");
		}
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
		
	}
	public void append(int new_data)
	{
		Node new_node =new Node(new_data);
		if(head==null)
		{
			head=new Node(new_data);
			return;
		}
		new_node.next=null;
		
		Node last=head;
		while(last.next!=null)
		
			last=last.next;
			last.next=null;
			return;
		
	}
	
	public void printlist()
	{
		 Node tnode=head;
		while(tnode!=null)
		{
			System.out.print(tnode.data + " ");
			tnode=tnode.next;
			
		}
	}
	
	public static void main(String[] args) {
		linkedlistinsertion llist=new linkedlistinsertion();
		llist.append(6);
		llist.push(7);
		llist.push(1);
		llist.append(4);
		llist.insertAfter(llist.head.next, 8);
		
		System.out.println("Created list is");
		llist.printlist();
		
		
	}

}
