package LinkedListImplementation;

public class MainMenu 
{
	public static void main(String[] args)
	{
		LinkedList l = new LinkedList();
		l.insert(5);
		l.insert(10);
		l.insert(15);
		l.insertAtStart(90);
		l.insertAt(2, 100);
		l.deleteAt(1);
		l.show();
	}
}
