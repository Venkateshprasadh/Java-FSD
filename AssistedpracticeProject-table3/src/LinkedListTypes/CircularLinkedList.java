package LinkedListTypes;

public class CircularLinkedList 
{
	class Node
	{
		int data;
		Node next;
	}	
	Node head=null;
	Node tail=null;
		public void insert(int data)
		{
			Node n = new Node();
			n.data=data;
			
			if(head==null)
			{
				head=n;
				tail=n;
				tail.next=head;
			}
			else
			{
				tail.next=n;
				tail=n;
				tail.next=head;
			}
			
		}
		public void show()
		{
			Node temp;
			temp=head.next;
			System.out.println(head.data);
			if(head==null)
			{
				System.out.println("empty");
			}
			else
			{
				while(temp!=head)
				{
					System.out.println(temp.data);
					temp=temp.next;
				}
			}
		}
		public static void main(String[] args)
		{
			CircularLinkedList c = new CircularLinkedList();
			c.insert(2);
			c.insert(3);
			c.insert(5);
			c.show();
		}
	

}
