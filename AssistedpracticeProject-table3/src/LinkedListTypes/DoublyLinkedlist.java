package LinkedListTypes;

public class DoublyLinkedlist 
{
	class Node
	{
		int data;
		Node prev;
		Node next;
	}
	Node head=null;
	Node tail=null;
	
	public void insert(int data)
	{
		Node n = new Node();
		n.data=data;
		if(head==null) //first node
		{
			head=n;
			tail=n;
			head.prev=null;
			tail.next=null;
		}
		else
		{
			tail.next=n;
			n.prev=tail;
			tail=n;
			tail.next=null;
		}
	}
	public void display()
	{
		Node temp=head;
		System.out.println("displaying content in forward direction");
		if(head==null)
		{
			System.out.println("empty");
		}
		else
		{
			while(temp!=null)
			{
				System.out.println(temp.data);
				
				temp=temp.next;
			}
		}
		System.out.println("reverse");
		Node rev=tail;
		while(rev!=null)
		{
			System.out.println(rev.data);
			rev=rev.prev;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		DoublyLinkedlist d = new DoublyLinkedlist();
		d.insert(4);
		d.insert(5);
		d.insert(8);
		d.display();
	}
}
